package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class CollAsgnReasonField(override val value: Int) extends SfFieldInt(895, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(895)CollAsgnReason=(").append(value).append(")").append(CollAsgnReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object CollAsgnReasonField {
  val TagId = 895 
  val Initial=0
  val Scheduled=1
  val TimeWarning=2
  val MarginDeficiency=3
  val MarginExcess=4
  val ForwardCollateralDemand=5
  val EventOfDefault=6
  val AdverseTaxEvent=7
  lazy val fixDescriptionByValue = Map(0->"INITIAL",1->"SCHEDULED",
    2->"TIME_WARNING",3->"MARGIN_DEFICIENCY",4->"MARGIN_EXCESS",
    5->"FORWARD_COLLATERAL_DEMAND",6->"EVENT_OF_DEFAULT",7->"ADVERSE_TAX_EVENT")
 
  def apply(value: String) = try {
    new CollAsgnReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollAsgnReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollAsgnReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollAsgnReasonField]
  }

  def decode(a: Any) : Option[CollAsgnReasonField] = a match {
    case v: String => Some(CollAsgnReasonField(v))
    case v: Int => Some(CollAsgnReasonField(v))
    case v: CollAsgnReasonField => Some(v)
    case _ => scala.Option.empty[CollAsgnReasonField]
  } 
}
