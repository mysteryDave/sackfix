package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldTzTimeOnly
import java.time.OffsetTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingLegMaturityTimeField(override val value: OffsetTime) extends SfFieldTzTimeOnly(1405, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1405)UnderlyingLegMaturityTime=(").append(value).append(")")
}

object UnderlyingLegMaturityTimeField {
  val TagId = 1405  
  def apply(value: String) = try {
    new UnderlyingLegMaturityTimeField(OffsetTime.from(SfFixDateFormats.tzTimeOnly.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingLegMaturityTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingLegMaturityTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegMaturityTimeField]
  }

  def decode(a: Any) : Option[UnderlyingLegMaturityTimeField] = a match {
    case v: String => Some(UnderlyingLegMaturityTimeField(v))
    case v: OffsetTime => Some(UnderlyingLegMaturityTimeField(v))
    case v: UnderlyingLegMaturityTimeField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegMaturityTimeField]
  } 
}
