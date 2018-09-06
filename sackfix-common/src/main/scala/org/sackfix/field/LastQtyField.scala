package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class LastQtyField(override val value: Float) extends SfFieldFloat(32, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(32)LastQty=(").append(value).append(")")
}

object LastQtyField {
  val TagId = 32  
  def apply(value: String) = try {
    new LastQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastQtyField]
  }

  def decode(a: Any) : Option[LastQtyField] = a match {
    case v: String => Some(LastQtyField(v))
    case v: Float => Some(LastQtyField(v))
    case v: Double => Some(LastQtyField(v.toFloat))
    case v: Int => Some(LastQtyField(v.toFloat))
    case v: LastQtyField => Some(v)
    case _ => scala.Option.empty[LastQtyField]
  } 
}
