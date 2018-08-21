package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityXMLLenField(override val value: Int) extends SfFieldInt(1184, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1184)SecurityXMLLen=(").append(value).append(")")
}

object SecurityXMLLenField {
  val TagId = 1184  
  def apply(value: String) = try {
    new SecurityXMLLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityXMLLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityXMLLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityXMLLenField]
  }

  def decode(a: Any) : Option[SecurityXMLLenField] = a match {
    case v: String => Some(SecurityXMLLenField(v))
    case v: Int => Some(SecurityXMLLenField(v))
    case v: SecurityXMLLenField => Some(v)
    case _ => scala.Option.empty[SecurityXMLLenField]
  } 
}
