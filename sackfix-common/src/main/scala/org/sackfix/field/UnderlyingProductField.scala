package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingProductField(override val value: Int) extends SfFieldInt(462, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(462)UnderlyingProduct=(").append(value).append(")")
}

object UnderlyingProductField {
  val TagId = 462  
  def apply(value: String) = try {
    new UnderlyingProductField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingProduct("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingProductField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingProductField]
  }

  def decode(a: Any) : Option[UnderlyingProductField] = a match {
    case v: String => Some(UnderlyingProductField(v))
    case v: Int => Some(UnderlyingProductField(v))
    case v: UnderlyingProductField => Some(v)
    case _ => scala.Option.empty[UnderlyingProductField]
  } 
}
