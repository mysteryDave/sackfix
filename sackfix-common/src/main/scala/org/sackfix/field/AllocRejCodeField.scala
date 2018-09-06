package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class AllocRejCodeField(override val value: Int) extends SfFieldInt(88, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(88)AllocRejCode=(").append(value).append(")").append(AllocRejCodeField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocRejCodeField {
  val TagId = 88 
  val UnknownAccount=0
  val IncorrectQuantity=1
  val IncorrectAveragePrice=2
  val UnknownExecutingBrokerMnemonic=3
  val CommissionDifference=4
  val UnknownOrderid=5
  val UnknownListid=6
  val Other=7
  val IncorrectAllocatedQuantity=8
  val CalculationDifference=9
  val UnknownOrStaleExecId=10
  val MismatchedDataValue=11
  val UnknownClordid=12
  val WarehouseRequestRejected=13
  lazy val fixDescriptionByValue = Map(0->"UNKNOWN_ACCOUNT",1->"INCORRECT_QUANTITY",
    2->"INCORRECT_AVERAGE_PRICE",3->"UNKNOWN_EXECUTING_BROKER_MNEMONIC",4->"COMMISSION_DIFFERENCE",
    5->"UNKNOWN_ORDERID",6->"UNKNOWN_LISTID",7->"OTHER",
    8->"INCORRECT_ALLOCATED_QUANTITY",9->"CALCULATION_DIFFERENCE",10->"UNKNOWN_OR_STALE_EXEC_ID",
    11->"MISMATCHED_DATA_VALUE",12->"UNKNOWN_CLORDID",13->"WAREHOUSE_REQUEST_REJECTED")
 
  def apply(value: String) = try {
    new AllocRejCodeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocRejCode("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocRejCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocRejCodeField]
  }

  def decode(a: Any) : Option[AllocRejCodeField] = a match {
    case v: String => Some(AllocRejCodeField(v))
    case v: Int => Some(AllocRejCodeField(v))
    case v: AllocRejCodeField => Some(v)
    case _ => scala.Option.empty[AllocRejCodeField]
  } 
}
