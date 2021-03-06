package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LotTypeField(override val value: String) extends SfFieldString(1093, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1093)LotType=(").append(value).append(")").append(LotTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object LotTypeField {
  val TagId = 1093 
  val OddLot="1"
  val RoundLot="2"
  val BlockLot="3"
  lazy val fixDescriptionByValue = Map("1"->"ODD_LOT","2"->"ROUND_LOT",
    "3"->"BLOCK_LOT")
 
  def decode(a: Option[Any]) : Option[LotTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LotTypeField]
  }

  def decode(a: Any) : Option[LotTypeField] = a match {
    case v: String => Some(LotTypeField(v))
    case v: Char => Some(LotTypeField(v.toString))
    case v: LotTypeField => Some(v)
    case _ => scala.Option.empty[LotTypeField]
  } 
}
