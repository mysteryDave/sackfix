package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlInstTransTypeField(override val value: String) extends SfFieldString(163, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(163)SettlInstTransType=(").append(value).append(")").append(SettlInstTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlInstTransTypeField {
  val TagId = 163 
  val New="N"
  val Cancel="C"
  val Replace="R"
  val Restate="T"
  lazy val fixDescriptionByValue = Map("N"->"NEW","C"->"CANCEL",
    "R"->"REPLACE","T"->"RESTATE")
 
  def decode(a: Option[Any]) : Option[SettlInstTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlInstTransTypeField]
  }

  def decode(a: Any) : Option[SettlInstTransTypeField] = a match {
    case v: String => Some(SettlInstTransTypeField(v))
    case v: Char => Some(SettlInstTransTypeField(v.toString))
    case v: SettlInstTransTypeField => Some(v)
    case _ => scala.Option.empty[SettlInstTransTypeField]
  } 
}
