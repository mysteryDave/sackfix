package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegQtyField(override val value: Float) extends SfFieldFloat(687, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(687)LegQty=(").append(value).append(")")
}

object LegQtyField {
  val TagId = 687  
  def apply(value: String) = try {
    new LegQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegQtyField]
  }

  def decode(a: Any) : Option[LegQtyField] = a match {
    case v: String => Some(LegQtyField(v))
    case v: Float => Some(LegQtyField(v))
    case v: Double => Some(LegQtyField(v.toFloat))
    case v: Int => Some(LegQtyField(v.toFloat))
    case v: LegQtyField => Some(v)
    case _ => scala.Option.empty[LegQtyField]
  } 
}
