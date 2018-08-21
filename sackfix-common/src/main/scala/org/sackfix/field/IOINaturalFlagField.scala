package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class IOINaturalFlagField(override val value: Boolean) extends SfFieldBoolean(130, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(130)IOINaturalFlag=(").append({if (value) "Y" else "N"}).append(")")
}

object IOINaturalFlagField {
  val TagId = 130  
  def apply(value: String) = try {
    new IOINaturalFlagField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("IOINaturalFlag.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new IOINaturalFlag("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[IOINaturalFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOINaturalFlagField]
  }

  def decode(a: Any) : Option[IOINaturalFlagField] = a match {
    case v: String => Some(IOINaturalFlagField(v))
    case v: Boolean => Some(IOINaturalFlagField(v))
    case v: IOINaturalFlagField => Some(v)
    case _ => scala.Option.empty[IOINaturalFlagField]
  } 
}
