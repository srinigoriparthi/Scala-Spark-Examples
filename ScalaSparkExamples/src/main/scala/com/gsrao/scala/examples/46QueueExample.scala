package com.gsrao.scala.examples

import scala.collection.immutable._

object QueueExample {
  def main(args:Array[String]){
    var q1 = Queue(2,1,4,2,5,2,7)
    println("=========Q1=========")
    q1.foreach((x:Int) =>  println(x))
    println("=========Q1 Front=========")
    println("First Element:"+q1.front)
    var q2=q1.enqueue(100)
    println("=========Q2=========")
    q2.foreach((x:Int) =>  println(x))
    var q3=q2.dequeue
    println("=========Q3=========")
    println(q3)
    
  }
}