package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ConfirmTypeField(override val value: Int) extends SfFieldInt(773, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(773)ConfirmType=(").append(value).append(")").append(ConfirmTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ConfirmTypeField {
  val TagId = 773 
  val Status=1
  val Confirmation=2
  val ConfirmationRequestRejected=3
  lazy val fixDescriptionByValue = Map(1->"STATUS",2->"CONFIRMATION",
    3->"CONFIRMATION_REQUEST_REJECTED")
 
  def apply(value: String) = try {
    new ConfirmTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ConfirmType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ConfirmTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ConfirmTypeField]
  }

  def decode(a: Any) : Option[ConfirmTypeField] = a match {
    case v: String => Some(ConfirmTypeField(v))
    case v: Int => Some(ConfirmTypeField(v))
    case v: ConfirmTypeField => Some(v)
    case _ => scala.Option.empty[ConfirmTypeField]
  } 
}
