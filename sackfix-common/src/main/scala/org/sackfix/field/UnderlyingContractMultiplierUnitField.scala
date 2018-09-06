package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingContractMultiplierUnitField(override val value: Int) extends SfFieldInt(1437, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1437)UnderlyingContractMultiplierUnit=(").append(value).append(")")
}

object UnderlyingContractMultiplierUnitField {
  val TagId = 1437  
  def apply(value: String) = try {
    new UnderlyingContractMultiplierUnitField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingContractMultiplierUnit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingContractMultiplierUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingContractMultiplierUnitField]
  }

  def decode(a: Any) : Option[UnderlyingContractMultiplierUnitField] = a match {
    case v: String => Some(UnderlyingContractMultiplierUnitField(v))
    case v: Int => Some(UnderlyingContractMultiplierUnitField(v))
    case v: UnderlyingContractMultiplierUnitField => Some(v)
    case _ => scala.Option.empty[UnderlyingContractMultiplierUnitField]
  } 
}
