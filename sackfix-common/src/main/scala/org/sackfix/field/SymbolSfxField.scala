package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SymbolSfxField(override val value: String) extends SfFieldString(65, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(65)SymbolSfx=(").append(value).append(")").append(SymbolSfxField.fixDescriptionByValue.getOrElse(value,""))
}

object SymbolSfxField {
  val TagId = 65 
  val WhenIssued="WI"
  val AEucpWithLumpSumInterest="CD"
  lazy val fixDescriptionByValue = Map("WI"->"WHEN_ISSUED","CD"->"A_EUCP_WITH_LUMP_SUM_INTEREST")
 
  def decode(a: Option[Any]) : Option[SymbolSfxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SymbolSfxField]
  }

  def decode(a: Any) : Option[SymbolSfxField] = a match {
    case v: String => Some(SymbolSfxField(v))
    case v: SymbolSfxField => Some(v)
    case _ => scala.Option.empty[SymbolSfxField]
  } 
}
