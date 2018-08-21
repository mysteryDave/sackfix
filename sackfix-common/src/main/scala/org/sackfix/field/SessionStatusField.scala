package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class SessionStatusField(override val value: Int) extends SfFieldInt(1409, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1409)SessionStatus=(").append(value).append(")").append(SessionStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object SessionStatusField {
  val TagId = 1409 
  val SessionActive=0
  val SessionPasswordChanged=1
  val SessionPasswordDueToExpire=2
  val NewSessionPasswordDoesNotComplyWithPolicy=3
  val SessionLogoutComplete=4
  val InvalidUsernameOrPassword=5
  val AccountLocked=6
  val LogonsAreNotAllowedAtThisTime=7
  val PasswordExpired=8
  lazy val fixDescriptionByValue = Map(0->"SESSION_ACTIVE",1->"SESSION_PASSWORD_CHANGED",
    2->"SESSION_PASSWORD_DUE_TO_EXPIRE",3->"NEW_SESSION_PASSWORD_DOES_NOT_COMPLY_WITH_POLICY",4->"SESSION_LOGOUT_COMPLETE",
    5->"INVALID_USERNAME_OR_PASSWORD",6->"ACCOUNT_LOCKED",7->"LOGONS_ARE_NOT_ALLOWED_AT_THIS_TIME",
    8->"PASSWORD_EXPIRED")
 
  def apply(value: String) = try {
    new SessionStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SessionStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SessionStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SessionStatusField]
  }

  def decode(a: Any) : Option[SessionStatusField] = a match {
    case v: String => Some(SessionStatusField(v))
    case v: Int => Some(SessionStatusField(v))
    case v: SessionStatusField => Some(v)
    case _ => scala.Option.empty[SessionStatusField]
  } 
}
