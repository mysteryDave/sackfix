package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlmntTypField(override val value: String) extends SfFieldString(63, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(63)SettlmntTyp=(").append(value).append(")").append(SettlmntTypField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlmntTypField {
  val TagId = 63 
  val Regular="0"
  val Cash="1"
  val NextDay="2"
  val TPlus2="3"
  val TPlus3="4"
  val TPlus4="5"
  val Future="6"
  val WhenAndIfIssued="7"
  val SellersOption="8"
  val TPlus5="9"
  val TPlus1="A"
  lazy val fixDescriptionByValue = Map("0"->"REGULAR","1"->"CASH",
    "2"->"NEXT_DAY","3"->"T_PLUS_2","4"->"T_PLUS_3",
    "5"->"T_PLUS_4","6"->"FUTURE","7"->"WHEN_AND_IF_ISSUED",
    "8"->"SELLERS_OPTION","9"->"T_PLUS_5","A"->"T_PLUS_1")
 
  def decode(a: Option[Any]) : Option[SettlmntTypField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlmntTypField]
  }

  def decode(a: Any) : Option[SettlmntTypField] = a match {
    case v: String => Some(SettlmntTypField(v))
    case v: Char => Some(SettlmntTypField(v.toString))
    case v: SettlmntTypField => Some(v)
    case _ => scala.Option.empty[SettlmntTypField]
  } 
}
