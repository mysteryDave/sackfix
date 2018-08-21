package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SideFillStationCdField(override val value: String) extends SfFieldString(1006, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1006)SideFillStationCd=(").append(value).append(")")
}

object SideFillStationCdField {
  val TagId = 1006  
  def decode(a: Option[Any]) : Option[SideFillStationCdField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideFillStationCdField]
  }

  def decode(a: Any) : Option[SideFillStationCdField] = a match {
    case v: String => Some(SideFillStationCdField(v))
    case v: SideFillStationCdField => Some(v)
    case _ => scala.Option.empty[SideFillStationCdField]
  } 
}
