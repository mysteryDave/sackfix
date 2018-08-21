package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class PaymentMethodField(override val value: Int) extends SfFieldInt(492, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(492)PaymentMethod=(").append(value).append(")").append(PaymentMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object PaymentMethodField {
  val TagId = 492 
  val Crest=1
  val Nscc=2
  val Euroclear=3
  val Clearstream=4
  val Cheque=5
  val TelegraphicTransfer=6
  val Fedwire=7
  val DebitCard=8
  val DirectDebit=9
  val DirectCredit=10
  val CreditCard=11
  val AchDebit=12
  val AchCredit=13
  val Bpay=14
  val HighValueClearingSystem=15
  lazy val fixDescriptionByValue = Map(1->"CREST",2->"NSCC",
    3->"EUROCLEAR",4->"CLEARSTREAM",5->"CHEQUE",
    6->"TELEGRAPHIC_TRANSFER",7->"FEDWIRE",8->"DEBIT_CARD",
    9->"DIRECT_DEBIT",10->"DIRECT_CREDIT",11->"CREDIT_CARD",
    12->"ACH_DEBIT",13->"ACH_CREDIT",14->"BPAY",
    15->"HIGH_VALUE_CLEARING_SYSTEM")
 
  def apply(value: String) = try {
    new PaymentMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PaymentMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PaymentMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PaymentMethodField]
  }

  def decode(a: Any) : Option[PaymentMethodField] = a match {
    case v: String => Some(PaymentMethodField(v))
    case v: Int => Some(PaymentMethodField(v))
    case v: PaymentMethodField => Some(v)
    case _ => scala.Option.empty[PaymentMethodField]
  } 
}
