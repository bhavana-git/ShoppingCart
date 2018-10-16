package com.hmrc.service

import org.scalatest.FunSuite

class CheckoutTest extends FunSuite {

  test("total cost of items is calculated"){
    val itemList = List(Apple, Orange)
    val checkoutSysUnderTest = Checkout(itemList)
    assert(checkoutSysUnderTest.totalShoppingCost == 0.85)
  }

  test("total cost of items considering offer on Apple is calculated"){
    val itemList = List(Apple, Apple, Orange, Orange)
    val checkoutSysUnderTest = Checkout(itemList)
    assert(checkoutSysUnderTest.totalShoppingCost == 1.1)
  }

  test("total cost of items considering offer on Apples and Oranges is calculated"){
    val itemList = List(Apple, Apple, Apple, Orange, Orange, Orange)
    val checkoutSysUnderTest = Checkout(itemList)
    assert(checkoutSysUnderTest.totalShoppingCost == 1.7)
  }
}
