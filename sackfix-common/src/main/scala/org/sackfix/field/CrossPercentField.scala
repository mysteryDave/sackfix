package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class CrossPercentField(override val value: Float) extends SfFieldFloat(413, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(413)CrossPercent=(").append(value).append(")")
}

object CrossPercentField {
  val TagId = 413  
  def apply(value: String) = try {
    new CrossPercentField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CrossPercent("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CrossPercentField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CrossPercentField]
  }

  def decode(a: Any) : Option[CrossPercentField] = a match {
    case v: String => Some(CrossPercentField(v))
    case v: Float => Some(CrossPercentField(v))
    case v: Double => Some(CrossPercentField(v.toFloat))
    case v: Int => Some(CrossPercentField(v.toFloat))
    case v: CrossPercentField => Some(v)
    case _ => scala.Option.empty[CrossPercentField]
  } 
}
