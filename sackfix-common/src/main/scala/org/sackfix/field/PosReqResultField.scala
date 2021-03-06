package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class PosReqResultField(override val value: Int) extends SfFieldInt(728, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(728)PosReqResult=(").append(value).append(")").append(PosReqResultField.fixDescriptionByValue.getOrElse(value,""))
}

object PosReqResultField {
  val TagId = 728 
  val ValidRequest=0
  val InvalidOrUnsupportedRequest=1
  val NoPositionsFoundThatMatchCriteria=2
  val NotAuthorizedToRequestPositions=3
  val RequestForPositionNotSupported=4
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"VALID_REQUEST",1->"INVALID_OR_UNSUPPORTED_REQUEST",
    2->"NO_POSITIONS_FOUND_THAT_MATCH_CRITERIA",3->"NOT_AUTHORIZED_TO_REQUEST_POSITIONS",4->"REQUEST_FOR_POSITION_NOT_SUPPORTED",
    99->"OTHER")
 
  def apply(value: String) = try {
    new PosReqResultField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosReqResult("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosReqResultField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosReqResultField]
  }

  def decode(a: Any) : Option[PosReqResultField] = a match {
    case v: String => Some(PosReqResultField(v))
    case v: Int => Some(PosReqResultField(v))
    case v: PosReqResultField => Some(v)
    case _ => scala.Option.empty[PosReqResultField]
  } 
}
