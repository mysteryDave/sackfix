package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoLegStipulationsField(override val value: Int) extends SfNumInGroup(683, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(683)NoLegStipulations=(").append(value).append(")")
}

object NoLegStipulationsField {
  val TagId = 683  
  def apply(value: String) = try {
    new NoLegStipulationsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoLegStipulations("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoLegStipulationsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoLegStipulationsField]
  }

  def decode(a: Any) : Option[NoLegStipulationsField] = a match {
    case v: String => Some(NoLegStipulationsField(v))
    case v: Int => Some(NoLegStipulationsField(v))
    case v: NoLegStipulationsField => Some(v)
    case _ => scala.Option.empty[NoLegStipulationsField]
  } 
}
