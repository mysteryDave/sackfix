package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegRatioQtyField(override val value: Float) extends SfFieldFloat(623, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(623)LegRatioQty=(").append(value).append(")")
}

object LegRatioQtyField {
  val TagId = 623  
  def apply(value: String) = try {
    new LegRatioQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegRatioQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegRatioQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegRatioQtyField]
  }

  def decode(a: Any) : Option[LegRatioQtyField] = a match {
    case v: String => Some(LegRatioQtyField(v))
    case v: Float => Some(LegRatioQtyField(v))
    case v: Double => Some(LegRatioQtyField(v.toFloat))
    case v: Int => Some(LegRatioQtyField(v.toFloat))
    case v: LegRatioQtyField => Some(v)
    case _ => scala.Option.empty[LegRatioQtyField]
  } 
}
