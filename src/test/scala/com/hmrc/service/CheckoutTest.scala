package com.hmrc.service

import com.hmrc.model.{Apple, Orange}
import org.scalatest.FunSuite

class CheckoutTest extends FunSuite {
  test("total cost of items is calculated"){
    val itemList = List(Apple, Apple, Orange, Orange)
    val checkoutSysUnderTest = Checkout(itemList)
    assert(checkoutSysUnderTest.totalShoppingCost == 1.70)
  }
}
