package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class MatchStatusField(override val value: String) extends SfFieldString(573, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(573)MatchStatus=(").append(value).append(")").append(MatchStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object MatchStatusField {
  val TagId = 573 
  val ComparedMatchedOrAffirmed="0"
  val UncomparedUnmatchedOrUnaffirmed="1"
  val AdvisoryOrAlert="2"
  lazy val fixDescriptionByValue = Map("0"->"COMPARED_MATCHED_OR_AFFIRMED","1"->"UNCOMPARED_UNMATCHED_OR_UNAFFIRMED",
    "2"->"ADVISORY_OR_ALERT")
 
  def decode(a: Option[Any]) : Option[MatchStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MatchStatusField]
  }

  def decode(a: Any) : Option[MatchStatusField] = a match {
    case v: String => Some(MatchStatusField(v))
    case v: Char => Some(MatchStatusField(v.toString))
    case v: MatchStatusField => Some(v)
    case _ => scala.Option.empty[MatchStatusField]
  } 
}
