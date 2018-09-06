package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class RiskFreeRateField(override val value: Float) extends SfFieldFloat(1190, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1190)RiskFreeRate=(").append(value).append(")")
}

object RiskFreeRateField {
  val TagId = 1190  
  def apply(value: String) = try {
    new RiskFreeRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RiskFreeRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RiskFreeRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RiskFreeRateField]
  }

  def decode(a: Any) : Option[RiskFreeRateField] = a match {
    case v: String => Some(RiskFreeRateField(v))
    case v: Float => Some(RiskFreeRateField(v))
    case v: Double => Some(RiskFreeRateField(v.toFloat))
    case v: Int => Some(RiskFreeRateField(v.toFloat))
    case v: RiskFreeRateField => Some(v)
    case _ => scala.Option.empty[RiskFreeRateField]
  } 
}
