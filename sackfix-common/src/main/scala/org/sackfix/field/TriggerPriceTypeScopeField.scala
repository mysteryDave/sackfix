package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class TriggerPriceTypeScopeField(override val value: String) extends SfFieldString(1108, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1108)TriggerPriceTypeScope=(").append(value).append(")").append(TriggerPriceTypeScopeField.fixDescriptionByValue.getOrElse(value,""))
}

object TriggerPriceTypeScopeField {
  val TagId = 1108 
  val None="0"
  val Local="1"
  val National="2"
  val Global="3"
  lazy val fixDescriptionByValue = Map("0"->"NONE","1"->"LOCAL",
    "2"->"NATIONAL","3"->"GLOBAL")
 
  def decode(a: Option[Any]) : Option[TriggerPriceTypeScopeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerPriceTypeScopeField]
  }

  def decode(a: Any) : Option[TriggerPriceTypeScopeField] = a match {
    case v: String => Some(TriggerPriceTypeScopeField(v))
    case v: Char => Some(TriggerPriceTypeScopeField(v.toString))
    case v: TriggerPriceTypeScopeField => Some(v)
    case _ => scala.Option.empty[TriggerPriceTypeScopeField]
  } 
}
