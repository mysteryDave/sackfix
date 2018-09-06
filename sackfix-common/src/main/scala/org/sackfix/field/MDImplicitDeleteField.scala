package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class MDImplicitDeleteField(override val value: Boolean) extends SfFieldBoolean(547, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(547)MDImplicitDelete=(").append({if (value) "Y" else "N"}).append(")")
}

object MDImplicitDeleteField {
  val TagId = 547  
  def apply(value: String) = try {
    new MDImplicitDeleteField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("MDImplicitDelete.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDImplicitDelete("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDImplicitDeleteField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDImplicitDeleteField]
  }

  def decode(a: Any) : Option[MDImplicitDeleteField] = a match {
    case v: String => Some(MDImplicitDeleteField(v))
    case v: Boolean => Some(MDImplicitDeleteField(v))
    case v: MDImplicitDeleteField => Some(v)
    case _ => scala.Option.empty[MDImplicitDeleteField]
  } 
}
