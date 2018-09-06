package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class BidForwardPoints2Field(override val value: Float) extends SfFieldFloat(642, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(642)BidForwardPoints2=(").append(value).append(")")
}

object BidForwardPoints2Field {
  val TagId = 642  
  def apply(value: String) = try {
    new BidForwardPoints2Field(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidForwardPoints2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidForwardPoints2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidForwardPoints2Field]
  }

  def decode(a: Any) : Option[BidForwardPoints2Field] = a match {
    case v: String => Some(BidForwardPoints2Field(v))
    case v: Float => Some(BidForwardPoints2Field(v))
    case v: Double => Some(BidForwardPoints2Field(v.toFloat))
    case v: Int => Some(BidForwardPoints2Field(v.toFloat))
    case v: BidForwardPoints2Field => Some(v)
    case _ => scala.Option.empty[BidForwardPoints2Field]
  } 
}
