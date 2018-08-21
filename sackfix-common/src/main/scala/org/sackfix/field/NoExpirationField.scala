package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoExpirationField(override val value: Int) extends SfNumInGroup(981, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(981)NoExpiration=(").append(value).append(")")
}

object NoExpirationField {
  val TagId = 981  
  def apply(value: String) = try {
    new NoExpirationField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoExpiration("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoExpirationField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoExpirationField]
  }

  def decode(a: Any) : Option[NoExpirationField] = a match {
    case v: String => Some(NoExpirationField(v))
    case v: Int => Some(NoExpirationField(v))
    case v: NoExpirationField => Some(v)
    case _ => scala.Option.empty[NoExpirationField]
  } 
}
