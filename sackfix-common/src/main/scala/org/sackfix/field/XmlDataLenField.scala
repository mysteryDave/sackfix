package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class XmlDataLenField(override val value: Int) extends SfFieldInt(212, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(212)XmlDataLen=(").append(value).append(")")
}

object XmlDataLenField {
  val TagId = 212  
  def apply(value: String) = try {
    new XmlDataLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new XmlDataLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[XmlDataLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[XmlDataLenField]
  }

  def decode(a: Any) : Option[XmlDataLenField] = a match {
    case v: String => Some(XmlDataLenField(v))
    case v: Int => Some(XmlDataLenField(v))
    case v: XmlDataLenField => Some(v)
    case _ => scala.Option.empty[XmlDataLenField]
  } 
}
