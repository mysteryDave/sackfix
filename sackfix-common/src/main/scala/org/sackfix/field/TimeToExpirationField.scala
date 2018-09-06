package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class TimeToExpirationField(override val value: Float) extends SfFieldFloat(1189, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1189)TimeToExpiration=(").append(value).append(")")
}

object TimeToExpirationField {
  val TagId = 1189  
  def apply(value: String) = try {
    new TimeToExpirationField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TimeToExpiration("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TimeToExpirationField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TimeToExpirationField]
  }

  def decode(a: Any) : Option[TimeToExpirationField] = a match {
    case v: String => Some(TimeToExpirationField(v))
    case v: Float => Some(TimeToExpirationField(v))
    case v: Double => Some(TimeToExpirationField(v.toFloat))
    case v: Int => Some(TimeToExpirationField(v.toFloat))
    case v: TimeToExpirationField => Some(v)
    case _ => scala.Option.empty[TimeToExpirationField]
  } 
}
