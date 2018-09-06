package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class AdvSideField(override val value: String) extends SfFieldString(4, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(4)AdvSide=(").append(value).append(")").append(AdvSideField.fixDescriptionByValue.getOrElse(value,""))
}

object AdvSideField {
  val TagId = 4 
  val Buy="B"
  val Sell="S"
  val Cross="X"
  val Trade="T"
  lazy val fixDescriptionByValue = Map("B"->"BUY","S"->"SELL",
    "X"->"CROSS","T"->"TRADE")
 
  def decode(a: Option[Any]) : Option[AdvSideField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AdvSideField]
  }

  def decode(a: Any) : Option[AdvSideField] = a match {
    case v: String => Some(AdvSideField(v))
    case v: Char => Some(AdvSideField(v.toString))
    case v: AdvSideField => Some(v)
    case _ => scala.Option.empty[AdvSideField]
  } 
}
