package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlInstSourceField(override val value: String) extends SfFieldString(165, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(165)SettlInstSource=(").append(value).append(")").append(SettlInstSourceField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlInstSourceField {
  val TagId = 165 
  val BrokersInstructions="1"
  val InstitutionsInstructions="2"
  val Investor="3"
  lazy val fixDescriptionByValue = Map("1"->"BROKERS_INSTRUCTIONS","2"->"INSTITUTIONS_INSTRUCTIONS",
    "3"->"INVESTOR")
 
  def decode(a: Option[Any]) : Option[SettlInstSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlInstSourceField]
  }

  def decode(a: Any) : Option[SettlInstSourceField] = a match {
    case v: String => Some(SettlInstSourceField(v))
    case v: Char => Some(SettlInstSourceField(v.toString))
    case v: SettlInstSourceField => Some(v)
    case _ => scala.Option.empty[SettlInstSourceField]
  } 
}
