package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class RoutingIDField(override val value: String) extends SfFieldString(217, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(217)RoutingID=(").append(value).append(")")
}

object RoutingIDField {
  val TagId = 217  
  def decode(a: Option[Any]) : Option[RoutingIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RoutingIDField]
  }

  def decode(a: Any) : Option[RoutingIDField] = a match {
    case v: String => Some(RoutingIDField(v))
    case v: RoutingIDField => Some(v)
    case _ => scala.Option.empty[RoutingIDField]
  } 
}
