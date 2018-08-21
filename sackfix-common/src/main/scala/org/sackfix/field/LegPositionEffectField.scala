package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegPositionEffectField(override val value: String) extends SfFieldString(564, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(564)LegPositionEffect=(").append(value).append(")")
}

object LegPositionEffectField {
  val TagId = 564  
  def decode(a: Option[Any]) : Option[LegPositionEffectField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPositionEffectField]
  }

  def decode(a: Any) : Option[LegPositionEffectField] = a match {
    case v: String => Some(LegPositionEffectField(v))
    case v: Char => Some(LegPositionEffectField(v.toString))
    case v: LegPositionEffectField => Some(v)
    case _ => scala.Option.empty[LegPositionEffectField]
  } 
}
