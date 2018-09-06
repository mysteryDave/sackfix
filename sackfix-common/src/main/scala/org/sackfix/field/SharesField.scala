package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class SharesField(override val value: Float) extends SfFieldFloat(53, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(53)Shares=(").append(value).append(")")
}

object SharesField {
  val TagId = 53  
  def apply(value: String) = try {
    new SharesField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Shares("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SharesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SharesField]
  }

  def decode(a: Any) : Option[SharesField] = a match {
    case v: String => Some(SharesField(v))
    case v: Float => Some(SharesField(v))
    case v: Double => Some(SharesField(v.toFloat))
    case v: Int => Some(SharesField(v.toFloat))
    case v: SharesField => Some(v)
    case _ => scala.Option.empty[SharesField]
  } 
}
