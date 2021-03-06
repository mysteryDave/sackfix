package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecurityRequestResultField(override val value: Int) extends SfFieldInt(560, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(560)SecurityRequestResult=(").append(value).append(")").append(SecurityRequestResultField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityRequestResultField {
  val TagId = 560 
  val ValidRequest=0
  val InvalidOrUnsupportedRequest=1
  val NoInstrumentsFoundThatMatchSelectionCriteria=2
  val NotAuthorizedToRetrieveInstrumentData=3
  val InstrumentDataTemporarilyUnavailable=4
  val RequestForInstrumentDataNotSupported=5
  lazy val fixDescriptionByValue = Map(0->"VALID_REQUEST",1->"INVALID_OR_UNSUPPORTED_REQUEST",
    2->"NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA",3->"NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA",4->"INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE",
    5->"REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED")
 
  def apply(value: String) = try {
    new SecurityRequestResultField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityRequestResult("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityRequestResultField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityRequestResultField]
  }

  def decode(a: Any) : Option[SecurityRequestResultField] = a match {
    case v: String => Some(SecurityRequestResultField(v))
    case v: Int => Some(SecurityRequestResultField(v))
    case v: SecurityRequestResultField => Some(v)
    case _ => scala.Option.empty[SecurityRequestResultField]
  } 
}
