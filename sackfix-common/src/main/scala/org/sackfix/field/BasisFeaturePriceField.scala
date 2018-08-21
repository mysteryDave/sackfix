package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class BasisFeaturePriceField(override val value: Float) extends SfFieldFloat(260, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(260)BasisFeaturePrice=(").append(value).append(")")
}

object BasisFeaturePriceField {
  val TagId = 260  
  def apply(value: String) = try {
    new BasisFeaturePriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BasisFeaturePrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BasisFeaturePriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BasisFeaturePriceField]
  }

  def decode(a: Any) : Option[BasisFeaturePriceField] = a match {
    case v: String => Some(BasisFeaturePriceField(v))
    case v: Float => Some(BasisFeaturePriceField(v))
    case v: Double => Some(BasisFeaturePriceField(v.toFloat))
    case v: Int => Some(BasisFeaturePriceField(v.toFloat))
    case v: BasisFeaturePriceField => Some(v)
    case _ => scala.Option.empty[BasisFeaturePriceField]
  } 
}
