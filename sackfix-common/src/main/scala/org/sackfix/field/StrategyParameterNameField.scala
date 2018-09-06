package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class StrategyParameterNameField(override val value: String) extends SfFieldString(958, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(958)StrategyParameterName=(").append(value).append(")")
}

object StrategyParameterNameField {
  val TagId = 958  
  def decode(a: Option[Any]) : Option[StrategyParameterNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrategyParameterNameField]
  }

  def decode(a: Any) : Option[StrategyParameterNameField] = a match {
    case v: String => Some(StrategyParameterNameField(v))
    case v: StrategyParameterNameField => Some(v)
    case _ => scala.Option.empty[StrategyParameterNameField]
  } 
}
