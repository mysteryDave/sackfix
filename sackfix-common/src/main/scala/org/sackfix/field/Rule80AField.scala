package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class Rule80AField(override val value: String) extends SfFieldString(47, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(47)Rule80A=(").append(value).append(")").append(Rule80AField.fixDescriptionByValue.getOrElse(value,""))
}

object Rule80AField {
  val TagId = 47 
  val AgencySingleOrder="A"
  val ShortExemptTransactionReferToAType="B"
  val ProgramOrderNonIndexArbForMemberFirm="C"
  val ProgramOrderIndexArbForMemberFirm="D"
  val ShortExemptTransactionForPrincipal="E"
  val ShortExemptTransactionReferToWType="F"
  val ShortExemptTransactionReferToIType="H"
  val IndividualInvestor="I"
  val ProgramOrderIndexArbForIndividualCustomer="J"
  val ProgramOrderNonIndexArbForIndividualCustomer="K"
  val ShortExemptAffiliated="L"
  val ProgramOrderIndexArbForOtherMember="M"
  val ProgramOrderNonIndexArbForOtherMember="N"
  val ProprietaryAffiliated="O"
  val Principal="P"
  val TransactionsNonMember="R"
  val SpecialistTrades="S"
  val TransactionsUnaffiliatedMember="T"
  val ProgramOrderIndexArbForOtherAgency="U"
  val AllOtherOrdersAsAgentForOtherMember="W"
  val ShortExemptNotAffiliated="X"
  val ProgramOrderNonIndexArbForOtherAgency="Y"
  val ShortExemptNonmember="Z"
  lazy val fixDescriptionByValue = Map("A"->"AGENCY_SINGLE_ORDER","B"->"SHORT_EXEMPT_TRANSACTION_REFER_TO_A_TYPE",
    "C"->"PROGRAM_ORDER_NON_INDEX_ARB_FOR_MEMBER_FIRM","D"->"PROGRAM_ORDER_INDEX_ARB_FOR_MEMBER_FIRM","E"->"SHORT_EXEMPT_TRANSACTION_FOR_PRINCIPAL",
    "F"->"SHORT_EXEMPT_TRANSACTION_REFER_TO_W_TYPE","H"->"SHORT_EXEMPT_TRANSACTION_REFER_TO_I_TYPE","I"->"INDIVIDUAL_INVESTOR",
    "J"->"PROGRAM_ORDER_INDEX_ARB_FOR_INDIVIDUAL_CUSTOMER","K"->"PROGRAM_ORDER_NON_INDEX_ARB_FOR_INDIVIDUAL_CUSTOMER","L"->"SHORT_EXEMPT_AFFILIATED",
    "M"->"PROGRAM_ORDER_INDEX_ARB_FOR_OTHER_MEMBER","N"->"PROGRAM_ORDER_NON_INDEX_ARB_FOR_OTHER_MEMBER","O"->"PROPRIETARY_AFFILIATED",
    "P"->"PRINCIPAL","R"->"TRANSACTIONS_NON_MEMBER","S"->"SPECIALIST_TRADES",
    "T"->"TRANSACTIONS_UNAFFILIATED_MEMBER","U"->"PROGRAM_ORDER_INDEX_ARB_FOR_OTHER_AGENCY","W"->"ALL_OTHER_ORDERS_AS_AGENT_FOR_OTHER_MEMBER",
    "X"->"SHORT_EXEMPT_NOT_AFFILIATED","Y"->"PROGRAM_ORDER_NON_INDEX_ARB_FOR_OTHER_AGENCY","Z"->"SHORT_EXEMPT_NONMEMBER")
 
  def decode(a: Option[Any]) : Option[Rule80AField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Rule80AField]
  }

  def decode(a: Any) : Option[Rule80AField] = a match {
    case v: String => Some(Rule80AField(v))
    case v: Char => Some(Rule80AField(v.toString))
    case v: Rule80AField => Some(v)
    case _ => scala.Option.empty[Rule80AField]
  } 
}
