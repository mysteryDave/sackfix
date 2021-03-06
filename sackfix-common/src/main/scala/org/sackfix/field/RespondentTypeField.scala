package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class RespondentTypeField(override val value: Int) extends SfFieldInt(1172, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1172)RespondentType=(").append(value).append(")").append(RespondentTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object RespondentTypeField {
  val TagId = 1172 
  val AllMarketParticipants=1
  val SpecifiedMarketParticipants=2
  val AllMarketMakers=3
  val PrimaryMarketMaker=4
  lazy val fixDescriptionByValue = Map(1->"ALL_MARKET_PARTICIPANTS",2->"SPECIFIED_MARKET_PARTICIPANTS",
    3->"ALL_MARKET_MAKERS",4->"PRIMARY_MARKET_MAKER")
 
  def apply(value: String) = try {
    new RespondentTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RespondentType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RespondentTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RespondentTypeField]
  }

  def decode(a: Any) : Option[RespondentTypeField] = a match {
    case v: String => Some(RespondentTypeField(v))
    case v: Int => Some(RespondentTypeField(v))
    case v: RespondentTypeField => Some(v)
    case _ => scala.Option.empty[RespondentTypeField]
  } 
}
