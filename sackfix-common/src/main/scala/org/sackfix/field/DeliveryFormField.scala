package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class DeliveryFormField(override val value: Int) extends SfFieldInt(668, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(668)DeliveryForm=(").append(value).append(")").append(DeliveryFormField.fixDescriptionByValue.getOrElse(value,""))
}

object DeliveryFormField {
  val TagId = 668 
  val Bookentry=1
  val Bearer=2
  lazy val fixDescriptionByValue = Map(1->"BOOKENTRY",2->"BEARER")
 
  def apply(value: String) = try {
    new DeliveryFormField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DeliveryForm("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DeliveryFormField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeliveryFormField]
  }

  def decode(a: Any) : Option[DeliveryFormField] = a match {
    case v: String => Some(DeliveryFormField(v))
    case v: Int => Some(DeliveryFormField(v))
    case v: DeliveryFormField => Some(v)
    case _ => scala.Option.empty[DeliveryFormField]
  } 
}
