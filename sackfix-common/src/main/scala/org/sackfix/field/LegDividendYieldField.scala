package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegDividendYieldField(override val value: Float) extends SfFieldFloat(1381, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1381)LegDividendYield=(").append(value).append(")")
}

object LegDividendYieldField {
  val TagId = 1381  
  def apply(value: String) = try {
    new LegDividendYieldField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegDividendYield("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegDividendYieldField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegDividendYieldField]
  }

  def decode(a: Any) : Option[LegDividendYieldField] = a match {
    case v: String => Some(LegDividendYieldField(v))
    case v: Float => Some(LegDividendYieldField(v))
    case v: Double => Some(LegDividendYieldField(v.toFloat))
    case v: Int => Some(LegDividendYieldField(v.toFloat))
    case v: LegDividendYieldField => Some(v)
    case _ => scala.Option.empty[LegDividendYieldField]
  } 
}
