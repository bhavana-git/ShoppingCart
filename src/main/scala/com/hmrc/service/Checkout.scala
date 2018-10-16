package com.hmrc.service

import com.hmrc.model.Item

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

