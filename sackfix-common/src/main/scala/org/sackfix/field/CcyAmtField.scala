package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class CcyAmtField(override val value: Float) extends SfFieldFloat(1157, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1157)CcyAmt=(").append(value).append(")")
}

object CcyAmtField {
  val TagId = 1157  
  def apply(value: String) = try {
    new CcyAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CcyAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CcyAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CcyAmtField]
  }

  def decode(a: Any) : Option[CcyAmtField] = a match {
    case v: String => Some(CcyAmtField(v))
    case v: Float => Some(CcyAmtField(v))
    case v: Double => Some(CcyAmtField(v.toFloat))
    case v: Int => Some(CcyAmtField(v.toFloat))
    case v: CcyAmtField => Some(v)
    case _ => scala.Option.empty[CcyAmtField]
  } 
}
