package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoDistribInstsField(override val value: Int) extends SfNumInGroup(510, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(510)NoDistribInsts=(").append(value).append(")")
}

object NoDistribInstsField {
  val TagId = 510  
  def apply(value: String) = try {
    new NoDistribInstsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDistribInsts("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDistribInstsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDistribInstsField]
  }

  def decode(a: Any) : Option[NoDistribInstsField] = a match {
    case v: String => Some(NoDistribInstsField(v))
    case v: Int => Some(NoDistribInstsField(v))
    case v: NoDistribInstsField => Some(v)
    case _ => scala.Option.empty[NoDistribInstsField]
  } 
}
