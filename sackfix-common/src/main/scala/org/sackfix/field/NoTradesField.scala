package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoTradesField(override val value: Int) extends SfNumInGroup(897, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(897)NoTrades=(").append(value).append(")")
}

object NoTradesField {
  val TagId = 897  
  def apply(value: String) = try {
    new NoTradesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTrades("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTradesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTradesField]
  }

  def decode(a: Any) : Option[NoTradesField] = a match {
    case v: String => Some(NoTradesField(v))
    case v: Int => Some(NoTradesField(v))
    case v: NoTradesField => Some(v)
    case _ => scala.Option.empty[NoTradesField]
  } 
}
