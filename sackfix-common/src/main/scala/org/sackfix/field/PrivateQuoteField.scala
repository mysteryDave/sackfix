package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class PrivateQuoteField(override val value: Boolean) extends SfFieldBoolean(1171, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1171)PrivateQuote=(").append({if (value) "Y" else "N"}).append(")")
}

object PrivateQuoteField {
  val TagId = 1171  
  def apply(value: String) = try {
    new PrivateQuoteField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("PrivateQuote.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PrivateQuote("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PrivateQuoteField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PrivateQuoteField]
  }

  def decode(a: Any) : Option[PrivateQuoteField] = a match {
    case v: String => Some(PrivateQuoteField(v))
    case v: Boolean => Some(PrivateQuoteField(v))
    case v: PrivateQuoteField => Some(v)
    case _ => scala.Option.empty[PrivateQuoteField]
  } 
}
