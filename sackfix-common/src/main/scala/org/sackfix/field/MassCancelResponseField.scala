package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class MassCancelResponseField(override val value: String) extends SfFieldString(531, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(531)MassCancelResponse=(").append(value).append(")").append(MassCancelResponseField.fixDescriptionByValue.getOrElse(value,""))
}

object MassCancelResponseField {
  val TagId = 531 
  val CancelRequestRejected="0"
  val CancelOrdersForASecurity="1"
  val CancelOrdersForAnUnderlyingSecurity="2"
  val CancelOrdersForAProduct="3"
  val CancelOrdersForACficode="4"
  val CancelOrdersForASecuritytype="5"
  val CancelOrdersForATradingSession="6"
  val CancelAllOrders="7"
  lazy val fixDescriptionByValue = Map("0"->"CANCEL_REQUEST_REJECTED","1"->"CANCEL_ORDERS_FOR_A_SECURITY",
    "2"->"CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY","3"->"CANCEL_ORDERS_FOR_A_PRODUCT","4"->"CANCEL_ORDERS_FOR_A_CFICODE",
    "5"->"CANCEL_ORDERS_FOR_A_SECURITYTYPE","6"->"CANCEL_ORDERS_FOR_A_TRADING_SESSION","7"->"CANCEL_ALL_ORDERS")
 
  def decode(a: Option[Any]) : Option[MassCancelResponseField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassCancelResponseField]
  }

  def decode(a: Any) : Option[MassCancelResponseField] = a match {
    case v: String => Some(MassCancelResponseField(v))
    case v: Char => Some(MassCancelResponseField(v.toString))
    case v: MassCancelResponseField => Some(v)
    case _ => scala.Option.empty[MassCancelResponseField]
  } 
}
