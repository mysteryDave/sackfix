package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class DisplayQtyField(override val value: Float) extends SfFieldFloat(1138, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1138)DisplayQty=(").append(value).append(")")
}

object DisplayQtyField {
  val TagId = 1138  
  def apply(value: String) = try {
    new DisplayQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DisplayQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DisplayQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DisplayQtyField]
  }

  def decode(a: Any) : Option[DisplayQtyField] = a match {
    case v: String => Some(DisplayQtyField(v))
    case v: Float => Some(DisplayQtyField(v))
    case v: Double => Some(DisplayQtyField(v.toFloat))
    case v: Int => Some(DisplayQtyField(v.toFloat))
    case v: DisplayQtyField => Some(v)
    case _ => scala.Option.empty[DisplayQtyField]
  } 
}
