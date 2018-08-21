package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class MidYieldField(override val value: Float) extends SfFieldFloat(633, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(633)MidYield=(").append(value).append(")")
}

object MidYieldField {
  val TagId = 633  
  def apply(value: String) = try {
    new MidYieldField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MidYield("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MidYieldField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MidYieldField]
  }

  def decode(a: Any) : Option[MidYieldField] = a match {
    case v: String => Some(MidYieldField(v))
    case v: Float => Some(MidYieldField(v))
    case v: Double => Some(MidYieldField(v.toFloat))
    case v: Int => Some(MidYieldField(v.toFloat))
    case v: MidYieldField => Some(v)
    case _ => scala.Option.empty[MidYieldField]
  } 
}
