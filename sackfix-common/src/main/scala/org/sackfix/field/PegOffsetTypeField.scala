package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class PegOffsetTypeField(override val value: Int) extends SfFieldInt(836, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(836)PegOffsetType=(").append(value).append(")").append(PegOffsetTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PegOffsetTypeField {
  val TagId = 836 
  val Price=0
  val BasisPoints=1
  val Ticks=2
  val PriceTierLevel=3
  lazy val fixDescriptionByValue = Map(0->"PRICE",1->"BASIS_POINTS",
    2->"TICKS",3->"PRICE_TIER_LEVEL")
 
  def apply(value: String) = try {
    new PegOffsetTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PegOffsetType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PegOffsetTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PegOffsetTypeField]
  }

  def decode(a: Any) : Option[PegOffsetTypeField] = a match {
    case v: String => Some(PegOffsetTypeField(v))
    case v: Int => Some(PegOffsetTypeField(v))
    case v: PegOffsetTypeField => Some(v)
    case _ => scala.Option.empty[PegOffsetTypeField]
  } 
}
