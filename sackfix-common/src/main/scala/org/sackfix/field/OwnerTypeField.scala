package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class OwnerTypeField(override val value: Int) extends SfFieldInt(522, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(522)OwnerType=(").append(value).append(")").append(OwnerTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object OwnerTypeField {
  val TagId = 522 
  val IndividualInvestor=1
  val PublicCompany=2
  val PrivateCompany=3
  val IndividualTrustee=4
  val CompanyTrustee=5
  val PensionPlan=6
  val CustodianUnderGiftsToMinorsAct=7
  val Trusts=8
  val Fiduciaries=9
  val NetworkingSubAccount=10
  val NonProfitOrganization=11
  val CorporateBody=12
  val Nominee=13
  lazy val fixDescriptionByValue = Map(1->"INDIVIDUAL_INVESTOR",2->"PUBLIC_COMPANY",
    3->"PRIVATE_COMPANY",4->"INDIVIDUAL_TRUSTEE",5->"COMPANY_TRUSTEE",
    6->"PENSION_PLAN",7->"CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT",8->"TRUSTS",
    9->"FIDUCIARIES",10->"NETWORKING_SUB_ACCOUNT",11->"NON_PROFIT_ORGANIZATION",
    12->"CORPORATE_BODY",13->"NOMINEE")
 
  def apply(value: String) = try {
    new OwnerTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OwnerType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OwnerTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OwnerTypeField]
  }

  def decode(a: Any) : Option[OwnerTypeField] = a match {
    case v: String => Some(OwnerTypeField(v))
    case v: Int => Some(OwnerTypeField(v))
    case v: OwnerTypeField => Some(v)
    case _ => scala.Option.empty[OwnerTypeField]
  } 
}
