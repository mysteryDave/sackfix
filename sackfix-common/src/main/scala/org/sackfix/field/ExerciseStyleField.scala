package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class ExerciseStyleField(override val value: Int) extends SfFieldInt(1194, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1194)ExerciseStyle=(").append(value).append(")").append(ExerciseStyleField.fixDescriptionByValue.getOrElse(value,""))
}

object ExerciseStyleField {
  val TagId = 1194 
  val European=0
  val American=1
  val Bermuda=2
  lazy val fixDescriptionByValue = Map(0->"EUROPEAN",1->"AMERICAN",
    2->"BERMUDA")
 
  def apply(value: String) = try {
    new ExerciseStyleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExerciseStyle("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExerciseStyleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExerciseStyleField]
  }

  def decode(a: Any) : Option[ExerciseStyleField] = a match {
    case v: String => Some(ExerciseStyleField(v))
    case v: Int => Some(ExerciseStyleField(v))
    case v: ExerciseStyleField => Some(v)
    case _ => scala.Option.empty[ExerciseStyleField]
  } 
}
