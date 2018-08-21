package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class DefaultVerIndicatorField(override val value: Boolean) extends SfFieldBoolean(1410, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1410)DefaultVerIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object DefaultVerIndicatorField {
  val TagId = 1410  
  def apply(value: String) = try {
    new DefaultVerIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("DefaultVerIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DefaultVerIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DefaultVerIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DefaultVerIndicatorField]
  }

  def decode(a: Any) : Option[DefaultVerIndicatorField] = a match {
    case v: String => Some(DefaultVerIndicatorField(v))
    case v: Boolean => Some(DefaultVerIndicatorField(v))
    case v: DefaultVerIndicatorField => Some(v)
    case _ => scala.Option.empty[DefaultVerIndicatorField]
  } 
}
