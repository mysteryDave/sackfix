package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoComplexEventsField(override val value: Int) extends SfNumInGroup(1483, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1483)NoComplexEvents=(").append(value).append(")")
}

object NoComplexEventsField {
  val TagId = 1483  
  def apply(value: String) = try {
    new NoComplexEventsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoComplexEvents("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoComplexEventsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoComplexEventsField]
  }

  def decode(a: Any) : Option[NoComplexEventsField] = a match {
    case v: String => Some(NoComplexEventsField(v))
    case v: Int => Some(NoComplexEventsField(v))
    case v: NoComplexEventsField => Some(v)
    case _ => scala.Option.empty[NoComplexEventsField]
  } 
}
