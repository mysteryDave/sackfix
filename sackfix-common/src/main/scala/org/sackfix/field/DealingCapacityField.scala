package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class DealingCapacityField(override val value: Float) extends SfFieldFloat(1048, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1048)DealingCapacity=(").append(value).append(")")
}

object DealingCapacityField {
  val TagId = 1048  
  def apply(value: String) = try {
    new DealingCapacityField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DealingCapacity("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DealingCapacityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DealingCapacityField]
  }

  def decode(a: Any) : Option[DealingCapacityField] = a match {
    case v: String => Some(DealingCapacityField(v))
    case v: Float => Some(DealingCapacityField(v))
    case v: Double => Some(DealingCapacityField(v.toFloat))
    case v: Int => Some(DealingCapacityField(v.toFloat))
    case v: DealingCapacityField => Some(v)
    case _ => scala.Option.empty[DealingCapacityField]
  } 
}
