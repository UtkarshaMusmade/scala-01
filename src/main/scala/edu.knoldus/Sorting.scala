package edu.knoldus

class Sorting {

 
  def insertionSort(list: List[Int]): List[Int] = {
    def insert(x: Int, xs: List[Int]): List[Int] = xs match {
      case List() => List(x)
      case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
    }

    list match {
      case List() => List()
      case y :: ys => insert(y, insertionSort(ys))
    }
  }

  def selectionSort(xs: List[Int]): List[Int] =
    if(xs.isEmpty) List()
    else {
      val ys = minimum(xs)
      if(ys.tail.isEmpty)
        ys
      else
        ys.head :: selectionSort(ys.tail)
    }
  def minimum(xs: List[Int]): List[Int] =
    (List(xs.head) /: xs.tail) {
      (ys, x) =>
        if(x < ys.head) (x :: ys)
        else            (ys.head :: x :: ys.tail)
    }

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
