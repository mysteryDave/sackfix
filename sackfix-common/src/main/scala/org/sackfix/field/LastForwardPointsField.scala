package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class LastForwardPointsField(override val value: Float) extends SfFieldFloat(195, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(195)LastForwardPoints=(").append(value).append(")")
}

object LastForwardPointsField {
  val TagId = 195  
  def apply(value: String) = try {
    new LastForwardPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastForwardPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastForwardPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastForwardPointsField]
  }

  def decode(a: Any) : Option[LastForwardPointsField] = a match {
    case v: String => Some(LastForwardPointsField(v))
    case v: Float => Some(LastForwardPointsField(v))
    case v: Double => Some(LastForwardPointsField(v.toFloat))
    case v: Int => Some(LastForwardPointsField(v.toFloat))
    case v: LastForwardPointsField => Some(v)
    case _ => scala.Option.empty[LastForwardPointsField]
  } 
}
