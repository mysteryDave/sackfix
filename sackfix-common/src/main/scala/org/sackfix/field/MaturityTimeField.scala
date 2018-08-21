package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldTzTimeOnly
import java.time.OffsetTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class MaturityTimeField(override val value: OffsetTime) extends SfFieldTzTimeOnly(1079, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1079)MaturityTime=(").append(value).append(")")
}

object MaturityTimeField {
  val TagId = 1079  
  def apply(value: String) = try {
    new MaturityTimeField(OffsetTime.from(SfFixDateFormats.tzTimeOnly.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaturityTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaturityTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaturityTimeField]
  }

  def decode(a: Any) : Option[MaturityTimeField] = a match {
    case v: String => Some(MaturityTimeField(v))
    case v: OffsetTime => Some(MaturityTimeField(v))
    case v: MaturityTimeField => Some(v)
    case _ => scala.Option.empty[MaturityTimeField]
  } 
}
