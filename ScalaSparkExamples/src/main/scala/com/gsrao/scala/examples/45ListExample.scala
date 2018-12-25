package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala List
    	List is used to store ordered elements. 
    	It extends LinearSeq trait. 
    	It is a class for immutable linked lists. 
    	This class is good for last-in-first-out (LIFO), stack-like access patterns.
    	It maintains order of elements and can contain duplicates elements also.
 */
object ListExample {
  
  def main(args: Array[String]){
    var l1 = List(3,1,5,2,6,2)
    var l2:List[Int] = List(5,4,8,1,3,4)
    println("=========List L1===========")
    l1.foreach((x:Int) => println(x))
    println("========List L2============")
    l2.foreach((x:Int) => println(x))
    println("==========L1+L2==========")
    var l3:List[Int] = l1 ++ l2;
    l3.foreach((x:Int) => println(x))
    println("=========L1 Revers==========")
    l1 = l1.reverse    
    l1.foreach((x:Int) => println(x))
    
  }
  
}