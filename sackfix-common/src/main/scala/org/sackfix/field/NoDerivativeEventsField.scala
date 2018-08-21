package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoDerivativeEventsField(override val value: Int) extends SfNumInGroup(1286, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1286)NoDerivativeEvents=(").append(value).append(")")
}

object NoDerivativeEventsField {
  val TagId = 1286  
  def apply(value: String) = try {
    new NoDerivativeEventsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDerivativeEvents("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDerivativeEventsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDerivativeEventsField]
  }

  def decode(a: Any) : Option[NoDerivativeEventsField] = a match {
    case v: String => Some(NoDerivativeEventsField(v))
    case v: Int => Some(NoDerivativeEventsField(v))
    case v: NoDerivativeEventsField => Some(v)
    case _ => scala.Option.empty[NoDerivativeEventsField]
  } 
}
