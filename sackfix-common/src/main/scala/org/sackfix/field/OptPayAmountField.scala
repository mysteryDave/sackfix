package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class OptPayAmountField(override val value: Float) extends SfFieldFloat(1195, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1195)OptPayAmount=(").append(value).append(")")
}

object OptPayAmountField {
  val TagId = 1195  
  def apply(value: String) = try {
    new OptPayAmountField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OptPayAmount("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OptPayAmountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OptPayAmountField]
  }

  def decode(a: Any) : Option[OptPayAmountField] = a match {
    case v: String => Some(OptPayAmountField(v))
    case v: Float => Some(OptPayAmountField(v))
    case v: Double => Some(OptPayAmountField(v.toFloat))
    case v: Int => Some(OptPayAmountField(v.toFloat))
    case v: OptPayAmountField => Some(v)
    case _ => scala.Option.empty[OptPayAmountField]
  } 
}
