package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class PutOrCallField(override val value: Int) extends SfFieldInt(201, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(201)PutOrCall=(").append(value).append(")").append(PutOrCallField.fixDescriptionByValue.getOrElse(value,""))
}

object PutOrCallField {
  val TagId = 201 
  val Put=0
  val Call=1
  lazy val fixDescriptionByValue = Map(0->"PUT",1->"CALL")
 
  def apply(value: String) = try {
    new PutOrCallField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PutOrCall("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PutOrCallField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PutOrCallField]
  }

  def decode(a: Any) : Option[PutOrCallField] = a match {
    case v: String => Some(PutOrCallField(v))
    case v: Int => Some(PutOrCallField(v))
    case v: PutOrCallField => Some(v)
    case _ => scala.Option.empty[PutOrCallField]
  } 
}
