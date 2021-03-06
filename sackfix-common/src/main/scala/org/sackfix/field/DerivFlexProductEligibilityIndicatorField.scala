package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class DerivFlexProductEligibilityIndicatorField(override val value: Boolean) extends SfFieldBoolean(1243, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1243)DerivFlexProductEligibilityIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object DerivFlexProductEligibilityIndicatorField {
  val TagId = 1243  
  def apply(value: String) = try {
    new DerivFlexProductEligibilityIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("DerivFlexProductEligibilityIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivFlexProductEligibilityIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivFlexProductEligibilityIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivFlexProductEligibilityIndicatorField]
  }

  def decode(a: Any) : Option[DerivFlexProductEligibilityIndicatorField] = a match {
    case v: String => Some(DerivFlexProductEligibilityIndicatorField(v))
    case v: Boolean => Some(DerivFlexProductEligibilityIndicatorField(v))
    case v: DerivFlexProductEligibilityIndicatorField => Some(v)
    case _ => scala.Option.empty[DerivFlexProductEligibilityIndicatorField]
  } 
}
