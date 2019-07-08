package edu.knoldus

class Sorting {

  /*def insertionSort(list: List[Int]): List[Int] = {


  }

  def selectionSort(list: List[Int]): List[Int] = {
    for (i <- 0 until list.length) {
      var minPos = i

      for (j <- i + 1 until list.length)
        if (list(j) < list(minPos))
          minPos = j

      if (minPos != i) {
        val temp = list(i)
        list(i) = list(minPos)
        list(minPos) = list(i)
      }
    }

    list
  }*/

  def bubbleSort(list: List[Int]): List[Int] = {

    def sort(list: List[Int], bs: List[Int]): List[Int] =
      if (list.isEmpty) bs
      else bubble(list, Nil, bs)

    def bubble(list: List[Int], zs: List[Int], bs: List[Int]): List[Int] = list match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs)
        else bubble(h2 :: t, h1 :: zs, bs)
      case h1 :: Nil => sort(zs, h1 :: bs)
    }

    sort(list, Nil)

  }
}