package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LastForwardPoints2Field(override val value: Float) extends SfFieldFloat(641, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(641)LastForwardPoints2=(").append(value).append(")")
}

object LastForwardPoints2Field {
  val TagId = 641  
  def apply(value: String) = try {
    new LastForwardPoints2Field(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastForwardPoints2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastForwardPoints2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastForwardPoints2Field]
  }

  def decode(a: Any) : Option[LastForwardPoints2Field] = a match {
    case v: String => Some(LastForwardPoints2Field(v))
    case v: Float => Some(LastForwardPoints2Field(v))
    case v: Double => Some(LastForwardPoints2Field(v.toFloat))
    case v: Int => Some(LastForwardPoints2Field(v.toFloat))
    case v: LastForwardPoints2Field => Some(v)
    case _ => scala.Option.empty[LastForwardPoints2Field]
  } 
}
