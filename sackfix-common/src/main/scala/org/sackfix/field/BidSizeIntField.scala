package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class BidSizeIntField(override val value: Int) extends SfFieldInt(134, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(134)BidSizeInt=(").append(value).append(")")
}

object BidSizeIntField {
  val TagId = 134  
  def apply(value: String) = try {
    new BidSizeIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidSizeInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidSizeIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidSizeIntField]
  }

  def decode(a: Any) : Option[BidSizeIntField] = a match {
    case v: String => Some(BidSizeIntField(v))
    case v: Int => Some(BidSizeIntField(v))
    case v: BidSizeIntField => Some(v)
    case _ => scala.Option.empty[BidSizeIntField]
  } 
}
