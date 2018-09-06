package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class ParentMktSegmIDField(override val value: String) extends SfFieldString(1325, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1325)ParentMktSegmID=(").append(value).append(")")
}

object ParentMktSegmIDField {
  val TagId = 1325  
  def decode(a: Option[Any]) : Option[ParentMktSegmIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ParentMktSegmIDField]
  }

  def decode(a: Any) : Option[ParentMktSegmIDField] = a match {
    case v: String => Some(ParentMktSegmIDField(v))
    case v: ParentMktSegmIDField => Some(v)
    case _ => scala.Option.empty[ParentMktSegmIDField]
  } 
}
