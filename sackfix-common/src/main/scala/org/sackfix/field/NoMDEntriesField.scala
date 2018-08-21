package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoMDEntriesField(override val value: Int) extends SfNumInGroup(268, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(268)NoMDEntries=(").append(value).append(")")
}

object NoMDEntriesField {
  val TagId = 268  
  def apply(value: String) = try {
    new NoMDEntriesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoMDEntries("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoMDEntriesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoMDEntriesField]
  }

  def decode(a: Any) : Option[NoMDEntriesField] = a match {
    case v: String => Some(NoMDEntriesField(v))
    case v: Int => Some(NoMDEntriesField(v))
    case v: NoMDEntriesField => Some(v)
    case _ => scala.Option.empty[NoMDEntriesField]
  } 
}
