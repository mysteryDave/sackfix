package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegPutOrCallField(override val value: Int) extends SfFieldInt(1358, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1358)LegPutOrCall=(").append(value).append(")")
}

object LegPutOrCallField {
  val TagId = 1358  
  def apply(value: String) = try {
    new LegPutOrCallField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegPutOrCall("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegPutOrCallField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPutOrCallField]
  }

  def decode(a: Any) : Option[LegPutOrCallField] = a match {
    case v: String => Some(LegPutOrCallField(v))
    case v: Int => Some(LegPutOrCallField(v))
    case v: LegPutOrCallField => Some(v)
    case _ => scala.Option.empty[LegPutOrCallField]
  } 
}
