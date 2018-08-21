package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegUnitOfMeasureQtyField(override val value: Float) extends SfFieldFloat(1224, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1224)LegUnitOfMeasureQty=(").append(value).append(")")
}

object LegUnitOfMeasureQtyField {
  val TagId = 1224  
  def apply(value: String) = try {
    new LegUnitOfMeasureQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegUnitOfMeasureQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegUnitOfMeasureQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegUnitOfMeasureQtyField]
  }

  def decode(a: Any) : Option[LegUnitOfMeasureQtyField] = a match {
    case v: String => Some(LegUnitOfMeasureQtyField(v))
    case v: Float => Some(LegUnitOfMeasureQtyField(v))
    case v: Double => Some(LegUnitOfMeasureQtyField(v.toFloat))
    case v: Int => Some(LegUnitOfMeasureQtyField(v.toFloat))
    case v: LegUnitOfMeasureQtyField => Some(v)
    case _ => scala.Option.empty[LegUnitOfMeasureQtyField]
  } 
}
