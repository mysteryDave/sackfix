package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class DerivativeStrikeMultiplierField(override val value: Float) extends SfFieldFloat(1263, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1263)DerivativeStrikeMultiplier=(").append(value).append(")")
}

object DerivativeStrikeMultiplierField {
  val TagId = 1263  
  def apply(value: String) = try {
    new DerivativeStrikeMultiplierField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeStrikeMultiplier("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeStrikeMultiplierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeStrikeMultiplierField]
  }

  def decode(a: Any) : Option[DerivativeStrikeMultiplierField] = a match {
    case v: String => Some(DerivativeStrikeMultiplierField(v))
    case v: Float => Some(DerivativeStrikeMultiplierField(v))
    case v: Double => Some(DerivativeStrikeMultiplierField(v.toFloat))
    case v: Int => Some(DerivativeStrikeMultiplierField(v.toFloat))
    case v: DerivativeStrikeMultiplierField => Some(v)
    case _ => scala.Option.empty[DerivativeStrikeMultiplierField]
  } 
}
