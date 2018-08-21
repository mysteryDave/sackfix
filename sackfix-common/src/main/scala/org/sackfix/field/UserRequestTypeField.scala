package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class UserRequestTypeField(override val value: Int) extends SfFieldInt(924, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(924)UserRequestType=(").append(value).append(")").append(UserRequestTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object UserRequestTypeField {
  val TagId = 924 
  val Logonuser=1
  val Logoffuser=2
  val Changepasswordforuser=3
  val RequestIndividualUserStatus=4
  lazy val fixDescriptionByValue = Map(1->"LOGONUSER",2->"LOGOFFUSER",
    3->"CHANGEPASSWORDFORUSER",4->"REQUEST_INDIVIDUAL_USER_STATUS")
 
  def apply(value: String) = try {
    new UserRequestTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UserRequestType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UserRequestTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UserRequestTypeField]
  }

  def decode(a: Any) : Option[UserRequestTypeField] = a match {
    case v: String => Some(UserRequestTypeField(v))
    case v: Int => Some(UserRequestTypeField(v))
    case v: UserRequestTypeField => Some(v)
    case _ => scala.Option.empty[UserRequestTypeField]
  } 
}
