package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoUnderlyingLegSecurityAltIDField(override val value: Int) extends SfNumInGroup(1334, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1334)NoUnderlyingLegSecurityAltID=(").append(value).append(")")
}

object NoUnderlyingLegSecurityAltIDField {
  val TagId = 1334  
  def apply(value: String) = try {
    new NoUnderlyingLegSecurityAltIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoUnderlyingLegSecurityAltID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoUnderlyingLegSecurityAltIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoUnderlyingLegSecurityAltIDField]
  }

  def decode(a: Any) : Option[NoUnderlyingLegSecurityAltIDField] = a match {
    case v: String => Some(NoUnderlyingLegSecurityAltIDField(v))
    case v: Int => Some(NoUnderlyingLegSecurityAltIDField(v))
    case v: NoUnderlyingLegSecurityAltIDField => Some(v)
    case _ => scala.Option.empty[NoUnderlyingLegSecurityAltIDField]
  } 
}
