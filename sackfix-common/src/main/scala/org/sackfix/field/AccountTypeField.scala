package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class AccountTypeField(override val value: Int) extends SfFieldInt(581, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(581)AccountType=(").append(value).append(")").append(AccountTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object AccountTypeField {
  val TagId = 581 
  val AccountIsCarriedOnCustomerSideOfBooks=1
  val AccountIsCarriedOnNonCustomerSideOfBooks=2
  val HouseTrader=3
  val FloorTrader=4
  val AccountIsCarriedOnNonCustomerSideOfBooksAndIsCrossMargined=6
  val AccountIsHouseTraderAndIsCrossMargined=7
  val JointBackofficeAccount=8
  lazy val fixDescriptionByValue = Map(1->"ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS",2->"ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS",
    3->"HOUSE_TRADER",4->"FLOOR_TRADER",6->"ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED",
    7->"ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED",8->"JOINT_BACKOFFICE_ACCOUNT")
 
  def apply(value: String) = try {
    new AccountTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AccountType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AccountTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AccountTypeField]
  }

  def decode(a: Any) : Option[AccountTypeField] = a match {
    case v: String => Some(AccountTypeField(v))
    case v: Int => Some(AccountTypeField(v))
    case v: AccountTypeField => Some(v)
    case _ => scala.Option.empty[AccountTypeField]
  } 
}
