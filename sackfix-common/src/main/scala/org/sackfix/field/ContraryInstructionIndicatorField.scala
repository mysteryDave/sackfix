package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class ContraryInstructionIndicatorField(override val value: Boolean) extends SfFieldBoolean(719, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(719)ContraryInstructionIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object ContraryInstructionIndicatorField {
  val TagId = 719  
  def apply(value: String) = try {
    new ContraryInstructionIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("ContraryInstructionIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContraryInstructionIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContraryInstructionIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContraryInstructionIndicatorField]
  }

  def decode(a: Any) : Option[ContraryInstructionIndicatorField] = a match {
    case v: String => Some(ContraryInstructionIndicatorField(v))
    case v: Boolean => Some(ContraryInstructionIndicatorField(v))
    case v: ContraryInstructionIndicatorField => Some(v)
    case _ => scala.Option.empty[ContraryInstructionIndicatorField]
  } 
}
