package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoStrikeRulesField(override val value: Int) extends SfNumInGroup(1201, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1201)NoStrikeRules=(").append(value).append(")")
}

object NoStrikeRulesField {
  val TagId = 1201  
  def apply(value: String) = try {
    new NoStrikeRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoStrikeRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoStrikeRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoStrikeRulesField]
  }

  def decode(a: Any) : Option[NoStrikeRulesField] = a match {
    case v: String => Some(NoStrikeRulesField(v))
    case v: Int => Some(NoStrikeRulesField(v))
    case v: NoStrikeRulesField => Some(v)
    case _ => scala.Option.empty[NoStrikeRulesField]
  } 
}
