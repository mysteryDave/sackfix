package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoLinesOfTextField(override val value: Int) extends SfNumInGroup(33, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(33)NoLinesOfText=(").append(value).append(")")
}

object NoLinesOfTextField {
  val TagId = 33  
  def apply(value: String) = try {
    new NoLinesOfTextField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoLinesOfText("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoLinesOfTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoLinesOfTextField]
  }

  def decode(a: Any) : Option[NoLinesOfTextField] = a match {
    case v: String => Some(NoLinesOfTextField(v))
    case v: Int => Some(NoLinesOfTextField(v))
    case v: NoLinesOfTextField => Some(v)
    case _ => scala.Option.empty[NoLinesOfTextField]
  } 
}
