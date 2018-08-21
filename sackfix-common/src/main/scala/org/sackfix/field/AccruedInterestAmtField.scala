package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class AccruedInterestAmtField(override val value: Float) extends SfFieldFloat(159, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(159)AccruedInterestAmt=(").append(value).append(")")
}

object AccruedInterestAmtField {
  val TagId = 159  
  def apply(value: String) = try {
    new AccruedInterestAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AccruedInterestAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AccruedInterestAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AccruedInterestAmtField]
  }

  def decode(a: Any) : Option[AccruedInterestAmtField] = a match {
    case v: String => Some(AccruedInterestAmtField(v))
    case v: Float => Some(AccruedInterestAmtField(v))
    case v: Double => Some(AccruedInterestAmtField(v.toFloat))
    case v: Int => Some(AccruedInterestAmtField(v.toFloat))
    case v: AccruedInterestAmtField => Some(v)
    case _ => scala.Option.empty[AccruedInterestAmtField]
  } 
}
