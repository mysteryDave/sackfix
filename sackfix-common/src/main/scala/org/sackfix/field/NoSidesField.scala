package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoSidesField(override val value: Int) extends SfNumInGroup(552, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(552)NoSides=(").append(value).append(")").append(NoSidesField.fixDescriptionByValue.getOrElse(value,""))
}

object NoSidesField {
  val TagId = 552 
  val OneSide=1
  val BothSides=2
  lazy val fixDescriptionByValue = Map(1->"ONE_SIDE",2->"BOTH_SIDES")
 
  def apply(value: String) = try {
    new NoSidesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSides("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSidesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSidesField]
  }

  def decode(a: Any) : Option[NoSidesField] = a match {
    case v: String => Some(NoSidesField(v))
    case v: Int => Some(NoSidesField(v))
    case v: NoSidesField => Some(v)
    case _ => scala.Option.empty[NoSidesField]
  } 
}
