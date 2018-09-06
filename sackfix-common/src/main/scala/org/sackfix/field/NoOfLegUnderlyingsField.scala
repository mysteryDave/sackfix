package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoOfLegUnderlyingsField(override val value: Int) extends SfNumInGroup(1342, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1342)NoOfLegUnderlyings=(").append(value).append(")")
}

object NoOfLegUnderlyingsField {
  val TagId = 1342  
  def apply(value: String) = try {
    new NoOfLegUnderlyingsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoOfLegUnderlyings("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoOfLegUnderlyingsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoOfLegUnderlyingsField]
  }

  def decode(a: Any) : Option[NoOfLegUnderlyingsField] = a match {
    case v: String => Some(NoOfLegUnderlyingsField(v))
    case v: Int => Some(NoOfLegUnderlyingsField(v))
    case v: NoOfLegUnderlyingsField => Some(v)
    case _ => scala.Option.empty[NoOfLegUnderlyingsField]
  } 
}
