package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegProductField(override val value: Int) extends SfFieldInt(607, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(607)LegProduct=(").append(value).append(")")
}

object LegProductField {
  val TagId = 607  
  def apply(value: String) = try {
    new LegProductField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegProduct("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegProductField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegProductField]
  }

  def decode(a: Any) : Option[LegProductField] = a match {
    case v: String => Some(LegProductField(v))
    case v: Int => Some(LegProductField(v))
    case v: LegProductField => Some(v)
    case _ => scala.Option.empty[LegProductField]
  } 
}
