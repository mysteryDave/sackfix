package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class AdvIdIntField(override val value: Int) extends SfFieldInt(2, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(2)AdvIdInt=(").append(value).append(")")
}

object AdvIdIntField {
  val TagId = 2  
  def apply(value: String) = try {
    new AdvIdIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AdvIdInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AdvIdIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AdvIdIntField]
  }

  def decode(a: Any) : Option[AdvIdIntField] = a match {
    case v: String => Some(AdvIdIntField(v))
    case v: Int => Some(AdvIdIntField(v))
    case v: AdvIdIntField => Some(v)
    case _ => scala.Option.empty[AdvIdIntField]
  } 
}
