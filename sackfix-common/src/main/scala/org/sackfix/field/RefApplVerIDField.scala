package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RefApplVerIDField(override val value: String) extends SfFieldString(1130, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1130)RefApplVerID=(").append(value).append(")")
}

object RefApplVerIDField {
  val TagId = 1130  
  def decode(a: Option[Any]) : Option[RefApplVerIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefApplVerIDField]
  }

  def decode(a: Any) : Option[RefApplVerIDField] = a match {
    case v: String => Some(RefApplVerIDField(v))
    case v: RefApplVerIDField => Some(v)
    case _ => scala.Option.empty[RefApplVerIDField]
  } 
}
