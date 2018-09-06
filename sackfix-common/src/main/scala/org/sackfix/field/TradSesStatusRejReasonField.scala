package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class TradSesStatusRejReasonField(override val value: Int) extends SfFieldInt(567, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(567)TradSesStatusRejReason=(").append(value).append(")").append(TradSesStatusRejReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object TradSesStatusRejReasonField {
  val TagId = 567 
  val UnknownOrInvalidTradingsessionid=1
  val Other=99
  lazy val fixDescriptionByValue = Map(1->"UNKNOWN_OR_INVALID_TRADINGSESSIONID",99->"OTHER")
 
  def apply(value: String) = try {
    new TradSesStatusRejReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradSesStatusRejReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradSesStatusRejReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradSesStatusRejReasonField]
  }

  def decode(a: Any) : Option[TradSesStatusRejReasonField] = a match {
    case v: String => Some(TradSesStatusRejReasonField(v))
    case v: Int => Some(TradSesStatusRejReasonField(v))
    case v: TradSesStatusRejReasonField => Some(v)
    case _ => scala.Option.empty[TradSesStatusRejReasonField]
  } 
}
