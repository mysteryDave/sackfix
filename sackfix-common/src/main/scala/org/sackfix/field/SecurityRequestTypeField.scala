package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityRequestTypeField(override val value: Int) extends SfFieldInt(321, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(321)SecurityRequestType=(").append(value).append(")").append(SecurityRequestTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityRequestTypeField {
  val TagId = 321 
  val RequestSecurityIdentityAndSpecifications=0
  val RequestSecurityIdentityForTheSpecificationsProvided=1
  val RequestListSecurityTypes=2
  val RequestListSecurities=3
  lazy val fixDescriptionByValue = Map(0->"REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS",1->"REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED",
    2->"REQUEST_LIST_SECURITY_TYPES",3->"REQUEST_LIST_SECURITIES")
 
  def apply(value: String) = try {
    new SecurityRequestTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityRequestType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityRequestTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityRequestTypeField]
  }

  def decode(a: Any) : Option[SecurityRequestTypeField] = a match {
    case v: String => Some(SecurityRequestTypeField(v))
    case v: Int => Some(SecurityRequestTypeField(v))
    case v: SecurityRequestTypeField => Some(v)
    case _ => scala.Option.empty[SecurityRequestTypeField]
  } 
}
