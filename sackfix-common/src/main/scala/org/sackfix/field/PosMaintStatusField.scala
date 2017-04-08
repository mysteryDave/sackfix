package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class PosMaintStatusField(override val value: Int) extends SfFieldInt(722, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(722)PosMaintStatus=(").append(value).append(")").append(PosMaintStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object PosMaintStatusField {
  val TagId = 722 
  val Accepted=0
  val AcceptedWithWarnings=1
  val Rejected=2
  val Completed=3
  val CompletedWithWarnings=4
  lazy val fixDescriptionByValue = Map(0->"ACCEPTED",1->"ACCEPTED_WITH_WARNINGS",
    2->"REJECTED",3->"COMPLETED",4->"COMPLETED_WITH_WARNINGS")
 
  def apply(value: String) = try {
    new PosMaintStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosMaintStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosMaintStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosMaintStatusField]
  }

  def decode(a: Any) : Option[PosMaintStatusField] = a match {
    case v: String => Some(PosMaintStatusField(v))
    case v: Int => Some(PosMaintStatusField(v))
    case v: PosMaintStatusField => Some(v)
    case _ => scala.Option.empty[PosMaintStatusField]
  } 
}