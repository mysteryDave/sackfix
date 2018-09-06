package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class TradSesStatusField(override val value: Int) extends SfFieldInt(340, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(340)TradSesStatus=(").append(value).append(")").append(TradSesStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object TradSesStatusField {
  val TagId = 340 
  val Unknown=0
  val Halted=1
  val Open=2
  val Closed=3
  val PreOpen=4
  val PreClose=5
  val RequestRejected=6
  lazy val fixDescriptionByValue = Map(0->"UNKNOWN",1->"HALTED",
    2->"OPEN",3->"CLOSED",4->"PRE_OPEN",
    5->"PRE_CLOSE",6->"REQUEST_REJECTED")
 
  def apply(value: String) = try {
    new TradSesStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradSesStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradSesStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradSesStatusField]
  }

  def decode(a: Any) : Option[TradSesStatusField] = a match {
    case v: String => Some(TradSesStatusField(v))
    case v: Int => Some(TradSesStatusField(v))
    case v: TradSesStatusField => Some(v)
    case _ => scala.Option.empty[TradSesStatusField]
  } 
}
