package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class BidYieldField(override val value: Float) extends SfFieldFloat(632, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(632)BidYield=(").append(value).append(")")
}

object BidYieldField {
  val TagId = 632  
  def apply(value: String) = try {
    new BidYieldField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidYield("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidYieldField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidYieldField]
  }

  def decode(a: Any) : Option[BidYieldField] = a match {
    case v: String => Some(BidYieldField(v))
    case v: Float => Some(BidYieldField(v))
    case v: Double => Some(BidYieldField(v.toFloat))
    case v: Int => Some(BidYieldField(v.toFloat))
    case v: BidYieldField => Some(v)
    case _ => scala.Option.empty[BidYieldField]
  } 
}
