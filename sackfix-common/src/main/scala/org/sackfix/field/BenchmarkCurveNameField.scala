package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class BenchmarkCurveNameField(override val value: String) extends SfFieldString(221, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(221)BenchmarkCurveName=(").append(value).append(")").append(BenchmarkCurveNameField.fixDescriptionByValue.getOrElse(value,""))
}

object BenchmarkCurveNameField {
  val TagId = 221 
  val Eonia="EONIA"
  val Eurepo="EUREPO"
  val Euribor="Euribor"
  val Futureswap="FutureSWAP"
  val Libid="LIBID"
  val Libor="LIBOR"
  val Muniaaa="MuniAAA"
  val Other="OTHER"
  val Pfandbriefe="Pfandbriefe"
  val Sonia="SONIA"
  val Swap="SWAP"
  val Treasury="Treasury"
  lazy val fixDescriptionByValue = Map("EONIA"->"EONIA","EUREPO"->"EUREPO",
    "Euribor"->"EURIBOR","FutureSWAP"->"FUTURESWAP","LIBID"->"LIBID",
    "LIBOR"->"LIBOR","MuniAAA"->"MUNIAAA","OTHER"->"OTHER",
    "Pfandbriefe"->"PFANDBRIEFE","SONIA"->"SONIA","SWAP"->"SWAP",
    "Treasury"->"TREASURY")
 
  def decode(a: Option[Any]) : Option[BenchmarkCurveNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BenchmarkCurveNameField]
  }

  def decode(a: Any) : Option[BenchmarkCurveNameField] = a match {
    case v: String => Some(BenchmarkCurveNameField(v))
    case v: BenchmarkCurveNameField => Some(v)
    case _ => scala.Option.empty[BenchmarkCurveNameField]
  } 
}
