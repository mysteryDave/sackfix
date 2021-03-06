package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class MaturityMonthYearIncrementUnitsField(override val value: Int) extends SfFieldInt(1302, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1302)MaturityMonthYearIncrementUnits=(").append(value).append(")").append(MaturityMonthYearIncrementUnitsField.fixDescriptionByValue.getOrElse(value,""))
}

object MaturityMonthYearIncrementUnitsField {
  val TagId = 1302 
  val Months=0
  val Days=1
  val Weeks=2
  val Years=3
  lazy val fixDescriptionByValue = Map(0->"MONTHS",1->"DAYS",
    2->"WEEKS",3->"YEARS")
 
  def apply(value: String) = try {
    new MaturityMonthYearIncrementUnitsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaturityMonthYearIncrementUnits("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaturityMonthYearIncrementUnitsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaturityMonthYearIncrementUnitsField]
  }

  def decode(a: Any) : Option[MaturityMonthYearIncrementUnitsField] = a match {
    case v: String => Some(MaturityMonthYearIncrementUnitsField(v))
    case v: Int => Some(MaturityMonthYearIncrementUnitsField(v))
    case v: MaturityMonthYearIncrementUnitsField => Some(v)
    case _ => scala.Option.empty[MaturityMonthYearIncrementUnitsField]
  } 
}
