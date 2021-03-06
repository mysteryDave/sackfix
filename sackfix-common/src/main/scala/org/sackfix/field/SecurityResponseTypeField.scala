package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecurityResponseTypeField(override val value: Int) extends SfFieldInt(323, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(323)SecurityResponseType=(").append(value).append(")").append(SecurityResponseTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityResponseTypeField {
  val TagId = 323 
  val AcceptSecurityProposalAsIs=1
  val AcceptSecurityProposalWithRevisionsAsIndicatedInTheMessage=2
  val ListOfSecurityTypesReturnedPerRequest=3
  val ListOfSecuritiesReturnedPerRequest=4
  val RejectSecurityProposal=5
  val CanNotMatchSelectionCriteria=6
  lazy val fixDescriptionByValue = Map(1->"ACCEPT_SECURITY_PROPOSAL_AS_IS",2->"ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE",
    3->"LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST",4->"LIST_OF_SECURITIES_RETURNED_PER_REQUEST",5->"REJECT_SECURITY_PROPOSAL",
    6->"CAN_NOT_MATCH_SELECTION_CRITERIA")
 
  def apply(value: String) = try {
    new SecurityResponseTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityResponseType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityResponseTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityResponseTypeField]
  }

  def decode(a: Any) : Option[SecurityResponseTypeField] = a match {
    case v: String => Some(SecurityResponseTypeField(v))
    case v: Int => Some(SecurityResponseTypeField(v))
    case v: SecurityResponseTypeField => Some(v)
    case _ => scala.Option.empty[SecurityResponseTypeField]
  } 
}
