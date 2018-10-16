package com.hmrc.service

class Checkout(itemList: List[Item]) {

  def totalShoppingCost = {
    Pricing.totalCost(itemList)
  }

}

object Checkout{
  def apply(itemList: List[Item]) = {
    new Checkout(itemList)
  }
}

