package com.hmrc.service

object Pricing {
  def totalCost(itemList: Seq[Item]): BigDecimal = {
    val appleCount = itemList.count(_ == Apple)
    val orangesCount = itemList.count(_ == Orange)
    Apple.price(appleCount) + Orange.price(orangesCount)
  }

}


sealed trait Item {
  def unitCost: BigDecimal
  def price(noOfItems: Int): BigDecimal
  def nForThePriceOfm(n : Int, m : Int)(count : Int) : BigDecimal =
    unitCost * (count / n * m + count % n)
}

case object Apple extends Item{
  val unitCost: BigDecimal = 0.60
  def price(noOfItems: Int): BigDecimal = nForThePriceOfm(2, 1)(noOfItems)
}

case object Orange extends Item{
  val unitCost: BigDecimal = 0.25
  def price(noOfItems: Int): BigDecimal = nForThePriceOfm(3, 2)(noOfItems)
}
