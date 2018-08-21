package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180821
  */
case class PreviouslyReportedField(override val value: Boolean) extends SfFieldBoolean(570, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(570)PreviouslyReported=(").append({if (value) "Y" else "N"}).append(")")
}

object PreviouslyReportedField {
  val TagId = 570  
  def apply(value: String) = try {
    new PreviouslyReportedField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("PreviouslyReported.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PreviouslyReported("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PreviouslyReportedField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PreviouslyReportedField]
  }

  def decode(a: Any) : Option[PreviouslyReportedField] = a match {
    case v: String => Some(PreviouslyReportedField(v))
    case v: Boolean => Some(PreviouslyReportedField(v))
    case v: PreviouslyReportedField => Some(v)
    case _ => scala.Option.empty[PreviouslyReportedField]
  } 
}
