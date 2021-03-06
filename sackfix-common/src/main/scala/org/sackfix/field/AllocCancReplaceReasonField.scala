package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class AllocCancReplaceReasonField(override val value: Int) extends SfFieldInt(796, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(796)AllocCancReplaceReason=(").append(value).append(")").append(AllocCancReplaceReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocCancReplaceReasonField {
  val TagId = 796 
  val OriginalDetailsIncompleteIncorrect=1
  val ChangeInUnderlyingOrderDetails=2
  val Other=99
  lazy val fixDescriptionByValue = Map(1->"ORIGINAL_DETAILS_INCOMPLETE_INCORRECT",2->"CHANGE_IN_UNDERLYING_ORDER_DETAILS",
    99->"OTHER")
 
  def apply(value: String) = try {
    new AllocCancReplaceReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocCancReplaceReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocCancReplaceReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocCancReplaceReasonField]
  }

  def decode(a: Any) : Option[AllocCancReplaceReasonField] = a match {
    case v: String => Some(AllocCancReplaceReasonField(v))
    case v: Int => Some(AllocCancReplaceReasonField(v))
    case v: AllocCancReplaceReasonField => Some(v)
    case _ => scala.Option.empty[AllocCancReplaceReasonField]
  } 
}
