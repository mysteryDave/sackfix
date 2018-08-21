package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class MaxFloorIntField(override val value: Int) extends SfFieldInt(111, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(111)MaxFloorInt=(").append(value).append(")")
}

object MaxFloorIntField {
  val TagId = 111  
  def apply(value: String) = try {
    new MaxFloorIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaxFloorInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaxFloorIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaxFloorIntField]
  }

  def decode(a: Any) : Option[MaxFloorIntField] = a match {
    case v: String => Some(MaxFloorIntField(v))
    case v: Int => Some(MaxFloorIntField(v))
    case v: MaxFloorIntField => Some(v)
    case _ => scala.Option.empty[MaxFloorIntField]
  } 
}
