package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class BuyVolumeField(override val value: Float) extends SfFieldFloat(330, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(330)BuyVolume=(").append(value).append(")")
}

object BuyVolumeField {
  val TagId = 330  
  def apply(value: String) = try {
    new BuyVolumeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BuyVolume("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BuyVolumeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BuyVolumeField]
  }

  def decode(a: Any) : Option[BuyVolumeField] = a match {
    case v: String => Some(BuyVolumeField(v))
    case v: Float => Some(BuyVolumeField(v))
    case v: Double => Some(BuyVolumeField(v.toFloat))
    case v: Int => Some(BuyVolumeField(v.toFloat))
    case v: BuyVolumeField => Some(v)
    case _ => scala.Option.empty[BuyVolumeField]
  } 
}
