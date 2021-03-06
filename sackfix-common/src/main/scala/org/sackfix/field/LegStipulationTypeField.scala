package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegStipulationTypeField(override val value: String) extends SfFieldString(688, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(688)LegStipulationType=(").append(value).append(")")
}

object LegStipulationTypeField {
  val TagId = 688  
  def decode(a: Option[Any]) : Option[LegStipulationTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegStipulationTypeField]
  }

  def decode(a: Any) : Option[LegStipulationTypeField] = a match {
    case v: String => Some(LegStipulationTypeField(v))
    case v: LegStipulationTypeField => Some(v)
    case _ => scala.Option.empty[LegStipulationTypeField]
  } 
}
