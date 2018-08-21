package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class BidRequestTransTypeField(override val value: String) extends SfFieldString(374, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(374)BidRequestTransType=(").append(value).append(")").append(BidRequestTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object BidRequestTransTypeField {
  val TagId = 374 
  val Cancel="C"
  val New="N"
  lazy val fixDescriptionByValue = Map("C"->"CANCEL","N"->"NEW")
 
  def decode(a: Option[Any]) : Option[BidRequestTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidRequestTransTypeField]
  }

  def decode(a: Any) : Option[BidRequestTransTypeField] = a match {
    case v: String => Some(BidRequestTransTypeField(v))
    case v: Char => Some(BidRequestTransTypeField(v.toString))
    case v: BidRequestTransTypeField => Some(v)
    case _ => scala.Option.empty[BidRequestTransTypeField]
  } 
}
