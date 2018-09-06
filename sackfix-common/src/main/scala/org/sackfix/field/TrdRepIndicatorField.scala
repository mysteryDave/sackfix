package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class TrdRepIndicatorField(override val value: Boolean) extends SfFieldBoolean(1389, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1389)TrdRepIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object TrdRepIndicatorField {
  val TagId = 1389  
  def apply(value: String) = try {
    new TrdRepIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("TrdRepIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TrdRepIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TrdRepIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TrdRepIndicatorField]
  }

  def decode(a: Any) : Option[TrdRepIndicatorField] = a match {
    case v: String => Some(TrdRepIndicatorField(v))
    case v: Boolean => Some(TrdRepIndicatorField(v))
    case v: TrdRepIndicatorField => Some(v)
    case _ => scala.Option.empty[TrdRepIndicatorField]
  } 
}
