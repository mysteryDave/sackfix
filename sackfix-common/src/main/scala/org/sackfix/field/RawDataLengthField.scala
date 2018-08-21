package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class RawDataLengthField(override val value: Int) extends SfFieldInt(95, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(95)RawDataLength=(").append(value).append(")")
}

object RawDataLengthField {
  val TagId = 95  
  def apply(value: String) = try {
    new RawDataLengthField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RawDataLength("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RawDataLengthField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RawDataLengthField]
  }

  def decode(a: Any) : Option[RawDataLengthField] = a match {
    case v: String => Some(RawDataLengthField(v))
    case v: Int => Some(RawDataLengthField(v))
    case v: RawDataLengthField => Some(v)
    case _ => scala.Option.empty[RawDataLengthField]
  } 
}
