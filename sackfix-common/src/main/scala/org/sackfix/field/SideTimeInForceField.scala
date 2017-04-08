package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideTimeInForceField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(962, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(962)SideTimeInForce=(").append(value).append(")")
}

object SideTimeInForceField {
  val TagId = 962  
  def apply(value: String) = try {
    new SideTimeInForceField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideTimeInForce("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideTimeInForceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideTimeInForceField]
  }

  def decode(a: Any) : Option[SideTimeInForceField] = a match {
    case v: String => Some(SideTimeInForceField(v))
    case v: LocalDateTime => Some(SideTimeInForceField(v))
    case v: SideTimeInForceField => Some(v)
    case _ => scala.Option.empty[SideTimeInForceField]
  } 
}