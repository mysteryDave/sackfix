package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class AggregatedBookField(override val value: Boolean) extends SfFieldBoolean(266, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(266)AggregatedBook=(").append({if (value) "Y" else "N"}).append(")")
}

object AggregatedBookField {
  val TagId = 266  
  def apply(value: String) = try {
    new AggregatedBookField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("AggregatedBook.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AggregatedBook("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AggregatedBookField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AggregatedBookField]
  }

  def decode(a: Any) : Option[AggregatedBookField] = a match {
    case v: String => Some(AggregatedBookField(v))
    case v: Boolean => Some(AggregatedBookField(v))
    case v: AggregatedBookField => Some(v)
    case _ => scala.Option.empty[AggregatedBookField]
  } 
}
