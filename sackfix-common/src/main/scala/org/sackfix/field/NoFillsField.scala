package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoFillsField(override val value: Int) extends SfNumInGroup(1362, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1362)NoFills=(").append(value).append(")")
}

object NoFillsField {
  val TagId = 1362  
  def apply(value: String) = try {
    new NoFillsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoFills("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoFillsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoFillsField]
  }

  def decode(a: Any) : Option[NoFillsField] = a match {
    case v: String => Some(NoFillsField(v))
    case v: Int => Some(NoFillsField(v))
    case v: NoFillsField => Some(v)
    case _ => scala.Option.empty[NoFillsField]
  } 
}
