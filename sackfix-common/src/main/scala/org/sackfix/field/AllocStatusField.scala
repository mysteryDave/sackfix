package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class AllocStatusField(override val value: Int) extends SfFieldInt(87, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(87)AllocStatus=(").append(value).append(")").append(AllocStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocStatusField {
  val TagId = 87 
  val Accepted=0
  val BlockLevelReject=1
  val AccountLevelReject=2
  val Received=3
  val Incomplete=4
  val RejectedByIntermediary=5
  val AllocationPending=6
  val Reversed=7
  lazy val fixDescriptionByValue = Map(0->"ACCEPTED",1->"BLOCK_LEVEL_REJECT",
    2->"ACCOUNT_LEVEL_REJECT",3->"RECEIVED",4->"INCOMPLETE",
    5->"REJECTED_BY_INTERMEDIARY",6->"ALLOCATION_PENDING",7->"REVERSED")
 
  def apply(value: String) = try {
    new AllocStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocStatusField]
  }

  def decode(a: Any) : Option[AllocStatusField] = a match {
    case v: String => Some(AllocStatusField(v))
    case v: Int => Some(AllocStatusField(v))
    case v: AllocStatusField => Some(v)
    case _ => scala.Option.empty[AllocStatusField]
  } 
}
