package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class TargetStrategyPerformanceField(override val value: Float) extends SfFieldFloat(850, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(850)TargetStrategyPerformance=(").append(value).append(")")
}

object TargetStrategyPerformanceField {
  val TagId = 850  
  def apply(value: String) = try {
    new TargetStrategyPerformanceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TargetStrategyPerformance("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TargetStrategyPerformanceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TargetStrategyPerformanceField]
  }

  def decode(a: Any) : Option[TargetStrategyPerformanceField] = a match {
    case v: String => Some(TargetStrategyPerformanceField(v))
    case v: Float => Some(TargetStrategyPerformanceField(v))
    case v: Double => Some(TargetStrategyPerformanceField(v.toFloat))
    case v: Int => Some(TargetStrategyPerformanceField(v.toFloat))
    case v: TargetStrategyPerformanceField => Some(v)
    case _ => scala.Option.empty[TargetStrategyPerformanceField]
  } 
}
