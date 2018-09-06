package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class DeskTypeField(override val value: String) extends SfFieldString(1033, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1033)DeskType=(").append(value).append(")").append(DeskTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object DeskTypeField {
  val TagId = 1033 
  val Agency="A"
  val Arbitrage="AR"
  val Derivatives="D"
  val International="IN"
  val Institutional="IS"
  val Other="O"
  val PreferredTrading="PF"
  val Proprietary="PR"
  val ProgramTrading="PT"
  val Sales="S"
  val Trading="T"
  lazy val fixDescriptionByValue = Map("A"->"AGENCY","AR"->"ARBITRAGE",
    "D"->"DERIVATIVES","IN"->"INTERNATIONAL","IS"->"INSTITUTIONAL",
    "O"->"OTHER","PF"->"PREFERRED_TRADING","PR"->"PROPRIETARY",
    "PT"->"PROGRAM_TRADING","S"->"SALES","T"->"TRADING")
 
  def decode(a: Option[Any]) : Option[DeskTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeskTypeField]
  }

  def decode(a: Any) : Option[DeskTypeField] = a match {
    case v: String => Some(DeskTypeField(v))
    case v: DeskTypeField => Some(v)
    case _ => scala.Option.empty[DeskTypeField]
  } 
}
