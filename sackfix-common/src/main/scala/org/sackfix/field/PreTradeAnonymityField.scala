package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class PreTradeAnonymityField(override val value: Boolean) extends SfFieldBoolean(1091, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1091)PreTradeAnonymity=(").append({if (value) "Y" else "N"}).append(")")
}

object PreTradeAnonymityField {
  val TagId = 1091  
  def apply(value: String) = try {
    new PreTradeAnonymityField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("PreTradeAnonymity.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PreTradeAnonymity("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PreTradeAnonymityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PreTradeAnonymityField]
  }

  def decode(a: Any) : Option[PreTradeAnonymityField] = a match {
    case v: String => Some(PreTradeAnonymityField(v))
    case v: Boolean => Some(PreTradeAnonymityField(v))
    case v: PreTradeAnonymityField => Some(v)
    case _ => scala.Option.empty[PreTradeAnonymityField]
  } 
}
