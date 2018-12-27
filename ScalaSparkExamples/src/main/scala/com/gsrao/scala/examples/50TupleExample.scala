package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Tuples
  	A tuple is a collection of elements in ordered form. 
  	If there is no element present, it is called empty tuple. 
  	You can use tuple to store any type of data. 
  	You can store similar type or mix type data also. 
  	You can use it to return multiple values from a function.

	Scala Tuple Example: Accessing Tuple Elements
  	In this example, we are accessing tuple elements by using index. 
  	Here, we are using productIterator for iterating tuple elements.
  	You can return multiple values by using tuple. 
  	Function does not return multiple values but you can do this with the help of tuple
 */
object TupleExample {
  def main(args:Array[String]){
    var t = (4,2,1.5,"Srini")
    var t2 = ("Srini", "Rao", "Vasa")
    println("==============")
    t.productIterator.foreach{ x => println(x) }
    println("==============")
    println(t)
    println("==============")
    println(t2)
    println("==============")
    println("First Element:"+t._1)
    println("First Element:"+t._3)
    println("=====Thru Function========")
    var t3 = myTupleFunction()
    t3.productIterator.foreach { x => println(x) }
  }
  
  def myTupleFunction() = {
    var t = (1,3,5,7)
    t
  }
}