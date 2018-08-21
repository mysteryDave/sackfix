package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityListTypeSourceField(override val value: Int) extends SfFieldInt(1471, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1471)SecurityListTypeSource=(").append(value).append(")").append(SecurityListTypeSourceField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityListTypeSourceField {
  val TagId = 1471 
  val IcbPublishedByDowJonesAndFtseWwwIcbenchmarkCom=1
  val NaicsWwwCensusGovNaicsOrWwwNaicsCom=2
  val GicsPublishedByStandardsPoor=3
  lazy val fixDescriptionByValue = Map(1->"ICB_PUBLISHED_BY_DOW_JONES_AND_FTSE_WWW_ICBENCHMARK_COM",2->"NAICS_WWW_CENSUS_GOV_NAICS_OR_WWW_NAICS_COM_",
    3->"GICS_PUBLISHED_BY_STANDARDS_POOR")
 
  def apply(value: String) = try {
    new SecurityListTypeSourceField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityListTypeSource("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityListTypeSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityListTypeSourceField]
  }

  def decode(a: Any) : Option[SecurityListTypeSourceField] = a match {
    case v: String => Some(SecurityListTypeSourceField(v))
    case v: Int => Some(SecurityListTypeSourceField(v))
    case v: SecurityListTypeSourceField => Some(v)
    case _ => scala.Option.empty[SecurityListTypeSourceField]
  } 
}
