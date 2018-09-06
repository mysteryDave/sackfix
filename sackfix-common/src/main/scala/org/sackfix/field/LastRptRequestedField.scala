package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class LastRptRequestedField(override val value: Boolean) extends SfFieldBoolean(912, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(912)LastRptRequested=(").append({if (value) "Y" else "N"}).append(")")
}

object LastRptRequestedField {
  val TagId = 912  
  def apply(value: String) = try {
    new LastRptRequestedField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("LastRptRequested.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastRptRequested("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastRptRequestedField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastRptRequestedField]
  }

  def decode(a: Any) : Option[LastRptRequestedField] = a match {
    case v: String => Some(LastRptRequestedField(v))
    case v: Boolean => Some(LastRptRequestedField(v))
    case v: LastRptRequestedField => Some(v)
    case _ => scala.Option.empty[LastRptRequestedField]
  } 
}
