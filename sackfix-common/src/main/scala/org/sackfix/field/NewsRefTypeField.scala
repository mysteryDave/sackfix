package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class NewsRefTypeField(override val value: Int) extends SfFieldInt(1477, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1477)NewsRefType=(").append(value).append(")").append(NewsRefTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object NewsRefTypeField {
  val TagId = 1477 
  val Replacement=0
  val OtherLanguage=1
  val Complimentary=2
  lazy val fixDescriptionByValue = Map(0->"REPLACEMENT",1->"OTHER_LANGUAGE",
    2->"COMPLIMENTARY")
 
  def apply(value: String) = try {
    new NewsRefTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NewsRefType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NewsRefTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NewsRefTypeField]
  }

  def decode(a: Any) : Option[NewsRefTypeField] = a match {
    case v: String => Some(NewsRefTypeField(v))
    case v: Int => Some(NewsRefTypeField(v))
    case v: NewsRefTypeField => Some(v)
    case _ => scala.Option.empty[NewsRefTypeField]
  } 
}
