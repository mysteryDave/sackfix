package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class RefApplExtIDField(override val value: Int) extends SfFieldInt(1406, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1406)RefApplExtID=(").append(value).append(")")
}

object RefApplExtIDField {
  val TagId = 1406  
  def apply(value: String) = try {
    new RefApplExtIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RefApplExtID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RefApplExtIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefApplExtIDField]
  }

  def decode(a: Any) : Option[RefApplExtIDField] = a match {
    case v: String => Some(RefApplExtIDField(v))
    case v: Int => Some(RefApplExtIDField(v))
    case v: RefApplExtIDField => Some(v)
    case _ => scala.Option.empty[RefApplExtIDField]
  } 
}
