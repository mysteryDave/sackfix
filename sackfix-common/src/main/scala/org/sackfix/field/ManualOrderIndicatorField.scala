package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class ManualOrderIndicatorField(override val value: Boolean) extends SfFieldBoolean(1028, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1028)ManualOrderIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object ManualOrderIndicatorField {
  val TagId = 1028  
  def apply(value: String) = try {
    new ManualOrderIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("ManualOrderIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ManualOrderIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ManualOrderIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ManualOrderIndicatorField]
  }

  def decode(a: Any) : Option[ManualOrderIndicatorField] = a match {
    case v: String => Some(ManualOrderIndicatorField(v))
    case v: Boolean => Some(ManualOrderIndicatorField(v))
    case v: ManualOrderIndicatorField => Some(v)
    case _ => scala.Option.empty[ManualOrderIndicatorField]
  } 
}
