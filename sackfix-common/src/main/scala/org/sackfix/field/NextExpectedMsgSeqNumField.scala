package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class NextExpectedMsgSeqNumField(override val value: Int) extends SfFieldInt(789, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(789)NextExpectedMsgSeqNum=(").append(value).append(")")
}

object NextExpectedMsgSeqNumField {
  val TagId = 789  
  def apply(value: String) = try {
    new NextExpectedMsgSeqNumField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NextExpectedMsgSeqNum("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NextExpectedMsgSeqNumField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NextExpectedMsgSeqNumField]
  }

  def decode(a: Any) : Option[NextExpectedMsgSeqNumField] = a match {
    case v: String => Some(NextExpectedMsgSeqNumField(v))
    case v: Int => Some(NextExpectedMsgSeqNumField(v))
    case v: NextExpectedMsgSeqNumField => Some(v)
    case _ => scala.Option.empty[NextExpectedMsgSeqNumField]
  } 
}
