package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class PossResendField(override val value: Boolean) extends SfFieldBoolean(97, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(97)PossResend=(").append({if (value) "Y" else "N"}).append(")")
}

object PossResendField {
  val TagId = 97  
  def apply(value: String) = try {
    new PossResendField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("PossResend.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PossResend("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PossResendField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PossResendField]
  }

  def decode(a: Any) : Option[PossResendField] = a match {
    case v: String => Some(PossResendField(v))
    case v: Boolean => Some(PossResendField(v))
    case v: PossResendField => Some(v)
    case _ => scala.Option.empty[PossResendField]
  } 
}
