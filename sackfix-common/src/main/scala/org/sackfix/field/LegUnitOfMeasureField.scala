package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegUnitOfMeasureField(override val value: String) extends SfFieldString(999, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(999)LegUnitOfMeasure=(").append(value).append(")")
}

object LegUnitOfMeasureField {
  val TagId = 999  
  def decode(a: Option[Any]) : Option[LegUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegUnitOfMeasureField]
  }

  def decode(a: Any) : Option[LegUnitOfMeasureField] = a match {
    case v: String => Some(LegUnitOfMeasureField(v))
    case v: LegUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[LegUnitOfMeasureField]
  } 
}
