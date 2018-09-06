package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class TriggerNewQtyField(override val value: Float) extends SfFieldFloat(1112, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1112)TriggerNewQty=(").append(value).append(")")
}

object TriggerNewQtyField {
  val TagId = 1112  
  def apply(value: String) = try {
    new TriggerNewQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TriggerNewQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TriggerNewQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerNewQtyField]
  }

  def decode(a: Any) : Option[TriggerNewQtyField] = a match {
    case v: String => Some(TriggerNewQtyField(v))
    case v: Float => Some(TriggerNewQtyField(v))
    case v: Double => Some(TriggerNewQtyField(v.toFloat))
    case v: Int => Some(TriggerNewQtyField(v.toFloat))
    case v: TriggerNewQtyField => Some(v)
    case _ => scala.Option.empty[TriggerNewQtyField]
  } 
}
