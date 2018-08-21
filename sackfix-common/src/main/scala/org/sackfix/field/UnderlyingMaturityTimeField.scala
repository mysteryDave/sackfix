package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldTzTimeOnly
import java.time.OffsetTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingMaturityTimeField(override val value: OffsetTime) extends SfFieldTzTimeOnly(1213, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1213)UnderlyingMaturityTime=(").append(value).append(")")
}

object UnderlyingMaturityTimeField {
  val TagId = 1213  
  def apply(value: String) = try {
    new UnderlyingMaturityTimeField(OffsetTime.from(SfFixDateFormats.tzTimeOnly.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingMaturityTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingMaturityTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingMaturityTimeField]
  }

  def decode(a: Any) : Option[UnderlyingMaturityTimeField] = a match {
    case v: String => Some(UnderlyingMaturityTimeField(v))
    case v: OffsetTime => Some(UnderlyingMaturityTimeField(v))
    case v: UnderlyingMaturityTimeField => Some(v)
    case _ => scala.Option.empty[UnderlyingMaturityTimeField]
  } 
}
