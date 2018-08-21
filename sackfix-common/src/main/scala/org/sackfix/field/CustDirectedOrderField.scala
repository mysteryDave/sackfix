package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class CustDirectedOrderField(override val value: Boolean) extends SfFieldBoolean(1029, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1029)CustDirectedOrder=(").append({if (value) "Y" else "N"}).append(")")
}

object CustDirectedOrderField {
  val TagId = 1029  
  def apply(value: String) = try {
    new CustDirectedOrderField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("CustDirectedOrder.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CustDirectedOrder("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CustDirectedOrderField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CustDirectedOrderField]
  }

  def decode(a: Any) : Option[CustDirectedOrderField] = a match {
    case v: String => Some(CustDirectedOrderField(v))
    case v: Boolean => Some(CustDirectedOrderField(v))
    case v: CustDirectedOrderField => Some(v)
    case _ => scala.Option.empty[CustDirectedOrderField]
  } 
}
