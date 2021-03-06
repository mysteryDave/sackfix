package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class PoolField(override val value: String) extends SfFieldString(691, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(691)Pool=(").append(value).append(")")
}

object PoolField {
  val TagId = 691  
  def decode(a: Option[Any]) : Option[PoolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PoolField]
  }

  def decode(a: Any) : Option[PoolField] = a match {
    case v: String => Some(PoolField(v))
    case v: PoolField => Some(v)
    case _ => scala.Option.empty[PoolField]
  } 
}
