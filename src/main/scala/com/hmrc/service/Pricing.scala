package com.hmrc.service

import com.hmrc.model.Item

object Pricing {
  def totalCost(itemList: Seq[Item]): BigDecimal = {
    itemList.map(item => item.cost).sum
  }
}
