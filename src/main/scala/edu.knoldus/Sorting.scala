package edu.knoldus

class Sorting {


  def insertionSort(list: List[Int]): List[Int] = {
  val a=list.toArray
  for (i <- 1 until a.length) {
  // A[ i ] is added in the sorted sequence A[0, .. i-1]
  // save A[i] to make a hole at index iHole
  val item = a(i)
  var iHole = i
  // keep moving the hole to next smaller index until A[iHole - 1] is <= item
  while (iHole > 0 && a(iHole - 1) > item) {
  // move hole to next smaller index
  a(iHole) = a(iHole - 1)
  iHole = iHole - 1
}
  // put item in the hole
  a(iHole) = item
}
  a.toList
  }

  /* def insertionSort(list: List[Int]): List[Int] = {
     def insert(x: Int, xs: List[Int]): List[Int] = xs match {
       case List() => List(x)
       case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
     }

     list match {
       case List() => List()
       case y :: ys => insert(y, insertionSort(ys))
     }
   }


   def selectionSort(xs: List[Int]): List[Int] ={
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
     }
 */

  def bubbleSort(list: List[Int]): List[Int] ={
    var a=list.toArray
    for (i <- 1 to a.length - 1) {
      for (j <- (i - 1) to 0 by -1) {
        if (a(j) > a(j + 1)) {
          val temp = a(j + 1)
          a(j + 1) = a(j)
          a(j) = temp
        }
      }
    }
    a.toList
  }

  def selectionSort(list: List[Int]): List[Int] = {
    val array = list.toArray
    for (i <- 0 to array.length - 2) {
      var min = array(i)
      var pos = i
      for (j <- i to array.length - 1)
        if (min > array(j)) {
          min = array(j)
          pos = j
        }
      if (array(i) != min) {
        val temp = array(pos)
        array(pos) = array(i)
        array(i) = temp

      }

    }

    array.toList
  }
  /*def bubbleSort(list: List[Int]): List[Int] = {

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

  }*/
}
