package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeInstrAttribTypeField(override val value: Int) extends SfFieldInt(1313, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1313)DerivativeInstrAttribType=(").append(value).append(")")
}

object DerivativeInstrAttribTypeField {
  val TagId = 1313  
  def apply(value: String) = try {
    new DerivativeInstrAttribTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeInstrAttribType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeInstrAttribTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrAttribTypeField]
  }

  def decode(a: Any) : Option[DerivativeInstrAttribTypeField] = a match {
    case v: String => Some(DerivativeInstrAttribTypeField(v))
    case v: Int => Some(DerivativeInstrAttribTypeField(v))
    case v: DerivativeInstrAttribTypeField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrAttribTypeField]
  } 
}