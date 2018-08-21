package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180821
  */
case class NoCapacitiesField(override val value: Int) extends SfNumInGroup(862, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(862)NoCapacities=(").append(value).append(")")
}

object NoCapacitiesField {
  val TagId = 862  
  def apply(value: String) = try {
    new NoCapacitiesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoCapacities("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoCapacitiesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoCapacitiesField]
  }

  def decode(a: Any) : Option[NoCapacitiesField] = a match {
    case v: String => Some(NoCapacitiesField(v))
    case v: Int => Some(NoCapacitiesField(v))
    case v: NoCapacitiesField => Some(v)
    case _ => scala.Option.empty[NoCapacitiesField]
  } 
}
