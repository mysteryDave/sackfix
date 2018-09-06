package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class IOIOthSvcField(override val value: String) extends SfFieldString(24, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(24)IOIOthSvc=(").append(value).append(")")
}

object IOIOthSvcField {
  val TagId = 24  
  def decode(a: Option[Any]) : Option[IOIOthSvcField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOIOthSvcField]
  }

  def decode(a: Any) : Option[IOIOthSvcField] = a match {
    case v: String => Some(IOIOthSvcField(v))
    case v: Char => Some(IOIOthSvcField(v.toString))
    case v: IOIOthSvcField => Some(v)
    case _ => scala.Option.empty[IOIOthSvcField]
  } 
}
