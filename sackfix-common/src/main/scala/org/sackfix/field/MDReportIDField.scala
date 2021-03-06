package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class MDReportIDField(override val value: Int) extends SfFieldInt(963, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(963)MDReportID=(").append(value).append(")")
}

object MDReportIDField {
  val TagId = 963  
  def apply(value: String) = try {
    new MDReportIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDReportID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDReportIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDReportIDField]
  }

  def decode(a: Any) : Option[MDReportIDField] = a match {
    case v: String => Some(MDReportIDField(v))
    case v: Int => Some(MDReportIDField(v))
    case v: MDReportIDField => Some(v)
    case _ => scala.Option.empty[MDReportIDField]
  } 
}
