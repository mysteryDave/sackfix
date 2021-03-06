package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoNestedUserDataField(override val value: Int) extends SfFieldInt(9000, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(9000)NoNestedUserData=(").append(value).append(")")
}

object NoNestedUserDataField {
  val TagId = 9000  
  def apply(value: String) = try {
    new NoNestedUserDataField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoNestedUserData("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoNestedUserDataField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoNestedUserDataField]
  }

  def decode(a: Any) : Option[NoNestedUserDataField] = a match {
    case v: String => Some(NoNestedUserDataField(v))
    case v: Int => Some(NoNestedUserDataField(v))
    case v: NoNestedUserDataField => Some(v)
    case _ => scala.Option.empty[NoNestedUserDataField]
  } 
}
