package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class AllowableOneSidednessCurrField(override val value: String) extends SfFieldString(767, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(767)AllowableOneSidednessCurr=(").append(value).append(")")
}

object AllowableOneSidednessCurrField {
  val TagId = 767  
  def decode(a: Option[Any]) : Option[AllowableOneSidednessCurrField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllowableOneSidednessCurrField]
  }

  def decode(a: Any) : Option[AllowableOneSidednessCurrField] = a match {
    case v: String => Some(AllowableOneSidednessCurrField(v))
    case v: AllowableOneSidednessCurrField => Some(v)
    case _ => scala.Option.empty[AllowableOneSidednessCurrField]
  } 
}
