package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoTrdRepIndicatorsField(override val value: Int) extends SfNumInGroup(1387, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1387)NoTrdRepIndicators=(").append(value).append(")")
}

object NoTrdRepIndicatorsField {
  val TagId = 1387  
  def apply(value: String) = try {
    new NoTrdRepIndicatorsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTrdRepIndicators("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTrdRepIndicatorsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTrdRepIndicatorsField]
  }

  def decode(a: Any) : Option[NoTrdRepIndicatorsField] = a match {
    case v: String => Some(NoTrdRepIndicatorsField(v))
    case v: Int => Some(NoTrdRepIndicatorsField(v))
    case v: NoTrdRepIndicatorsField => Some(v)
    case _ => scala.Option.empty[NoTrdRepIndicatorsField]
  } 
}
