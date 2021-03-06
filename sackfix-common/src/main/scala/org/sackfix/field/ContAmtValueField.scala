package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class ContAmtValueField(override val value: Float) extends SfFieldFloat(520, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(520)ContAmtValue=(").append(value).append(")")
}

object ContAmtValueField {
  val TagId = 520  
  def apply(value: String) = try {
    new ContAmtValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContAmtValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContAmtValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContAmtValueField]
  }

  def decode(a: Any) : Option[ContAmtValueField] = a match {
    case v: String => Some(ContAmtValueField(v))
    case v: Float => Some(ContAmtValueField(v))
    case v: Double => Some(ContAmtValueField(v.toFloat))
    case v: Int => Some(ContAmtValueField(v.toFloat))
    case v: ContAmtValueField => Some(v)
    case _ => scala.Option.empty[ContAmtValueField]
  } 
}
