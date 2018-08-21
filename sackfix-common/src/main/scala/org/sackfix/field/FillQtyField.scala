package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class FillQtyField(override val value: Float) extends SfFieldFloat(1365, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1365)FillQty=(").append(value).append(")")
}

object FillQtyField {
  val TagId = 1365  
  def apply(value: String) = try {
    new FillQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FillQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FillQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FillQtyField]
  }

  def decode(a: Any) : Option[FillQtyField] = a match {
    case v: String => Some(FillQtyField(v))
    case v: Float => Some(FillQtyField(v))
    case v: Double => Some(FillQtyField(v.toFloat))
    case v: Int => Some(FillQtyField(v.toFloat))
    case v: FillQtyField => Some(v)
    case _ => scala.Option.empty[FillQtyField]
  } 
}
