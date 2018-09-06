package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class MarketDepthField(override val value: Int) extends SfFieldInt(264, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(264)MarketDepth=(").append(value).append(")")
}

object MarketDepthField {
  val TagId = 264  
  def apply(value: String) = try {
    new MarketDepthField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MarketDepth("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MarketDepthField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarketDepthField]
  }

  def decode(a: Any) : Option[MarketDepthField] = a match {
    case v: String => Some(MarketDepthField(v))
    case v: Int => Some(MarketDepthField(v))
    case v: MarketDepthField => Some(v)
    case _ => scala.Option.empty[MarketDepthField]
  } 
}
