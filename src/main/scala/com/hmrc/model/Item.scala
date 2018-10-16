package com.hmrc.model

sealed trait Item {
  def cost: BigDecimal
}

case object Apple extends Item{
  val cost: BigDecimal = 0.60
}

case object Orange extends Item{
  val cost: BigDecimal = 0.25
}
