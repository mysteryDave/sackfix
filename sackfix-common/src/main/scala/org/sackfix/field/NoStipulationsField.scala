package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoStipulationsField(override val value: Int) extends SfNumInGroup(232, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(232)NoStipulations=(").append(value).append(")")
}

object NoStipulationsField {
  val TagId = 232  
  def apply(value: String) = try {
    new NoStipulationsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoStipulations("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoStipulationsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoStipulationsField]
  }

  def decode(a: Any) : Option[NoStipulationsField] = a match {
    case v: String => Some(NoStipulationsField(v))
    case v: Int => Some(NoStipulationsField(v))
    case v: NoStipulationsField => Some(v)
    case _ => scala.Option.empty[NoStipulationsField]
  } 
}
