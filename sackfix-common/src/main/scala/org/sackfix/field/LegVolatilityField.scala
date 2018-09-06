package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegVolatilityField(override val value: Float) extends SfFieldFloat(1379, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1379)LegVolatility=(").append(value).append(")")
}

object LegVolatilityField {
  val TagId = 1379  
  def apply(value: String) = try {
    new LegVolatilityField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegVolatility("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegVolatilityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegVolatilityField]
  }

  def decode(a: Any) : Option[LegVolatilityField] = a match {
    case v: String => Some(LegVolatilityField(v))
    case v: Float => Some(LegVolatilityField(v))
    case v: Double => Some(LegVolatilityField(v.toFloat))
    case v: Int => Some(LegVolatilityField(v.toFloat))
    case v: LegVolatilityField => Some(v)
    case _ => scala.Option.empty[LegVolatilityField]
  } 
}
