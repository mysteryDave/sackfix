package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class HaltReasonIntField(override val value: Int) extends SfFieldInt(327, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(327)HaltReasonInt=(").append(value).append(")")
}

object HaltReasonIntField {
  val TagId = 327  
  def apply(value: String) = try {
    new HaltReasonIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new HaltReasonInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[HaltReasonIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HaltReasonIntField]
  }

  def decode(a: Any) : Option[HaltReasonIntField] = a match {
    case v: String => Some(HaltReasonIntField(v))
    case v: Int => Some(HaltReasonIntField(v))
    case v: HaltReasonIntField => Some(v)
    case _ => scala.Option.empty[HaltReasonIntField]
  } 
}
