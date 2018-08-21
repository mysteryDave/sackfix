package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class GrossTradeAmtField(override val value: Float) extends SfFieldFloat(381, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(381)GrossTradeAmt=(").append(value).append(")")
}

object GrossTradeAmtField {
  val TagId = 381  
  def apply(value: String) = try {
    new GrossTradeAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new GrossTradeAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[GrossTradeAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[GrossTradeAmtField]
  }

  def decode(a: Any) : Option[GrossTradeAmtField] = a match {
    case v: String => Some(GrossTradeAmtField(v))
    case v: Float => Some(GrossTradeAmtField(v))
    case v: Double => Some(GrossTradeAmtField(v.toFloat))
    case v: Int => Some(GrossTradeAmtField(v.toFloat))
    case v: GrossTradeAmtField => Some(v)
    case _ => scala.Option.empty[GrossTradeAmtField]
  } 
}
