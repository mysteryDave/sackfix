package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class PriceUnitOfMeasureQtyField(override val value: Float) extends SfFieldFloat(1192, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1192)PriceUnitOfMeasureQty=(").append(value).append(")")
}

object PriceUnitOfMeasureQtyField {
  val TagId = 1192  
  def apply(value: String) = try {
    new PriceUnitOfMeasureQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PriceUnitOfMeasureQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriceUnitOfMeasureQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriceUnitOfMeasureQtyField]
  }

  def decode(a: Any) : Option[PriceUnitOfMeasureQtyField] = a match {
    case v: String => Some(PriceUnitOfMeasureQtyField(v))
    case v: Float => Some(PriceUnitOfMeasureQtyField(v))
    case v: Double => Some(PriceUnitOfMeasureQtyField(v.toFloat))
    case v: Int => Some(PriceUnitOfMeasureQtyField(v.toFloat))
    case v: PriceUnitOfMeasureQtyField => Some(v)
    case _ => scala.Option.empty[PriceUnitOfMeasureQtyField]
  } 
}
