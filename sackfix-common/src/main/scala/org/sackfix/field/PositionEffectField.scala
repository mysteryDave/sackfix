package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class PositionEffectField(override val value: String) extends SfFieldString(77, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(77)PositionEffect=(").append(value).append(")").append(PositionEffectField.fixDescriptionByValue.getOrElse(value,""))
}

object PositionEffectField {
  val TagId = 77 
  val Open="O"
  val Close="C"
  val Rolled="R"
  val Fifo="F"
  lazy val fixDescriptionByValue = Map("O"->"OPEN","C"->"CLOSE",
    "R"->"ROLLED","F"->"FIFO")
 
  def decode(a: Option[Any]) : Option[PositionEffectField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PositionEffectField]
  }

  def decode(a: Any) : Option[PositionEffectField] = a match {
    case v: String => Some(PositionEffectField(v))
    case v: Char => Some(PositionEffectField(v.toString))
    case v: PositionEffectField => Some(v)
    case _ => scala.Option.empty[PositionEffectField]
  } 
}
