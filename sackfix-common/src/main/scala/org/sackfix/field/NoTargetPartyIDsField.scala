package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoTargetPartyIDsField(override val value: Int) extends SfNumInGroup(1461, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1461)NoTargetPartyIDs=(").append(value).append(")")
}

object NoTargetPartyIDsField {
  val TagId = 1461  
  def apply(value: String) = try {
    new NoTargetPartyIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTargetPartyIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTargetPartyIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTargetPartyIDsField]
  }

  def decode(a: Any) : Option[NoTargetPartyIDsField] = a match {
    case v: String => Some(NoTargetPartyIDsField(v))
    case v: Int => Some(NoTargetPartyIDsField(v))
    case v: NoTargetPartyIDsField => Some(v)
    case _ => scala.Option.empty[NoTargetPartyIDsField]
  } 
}
