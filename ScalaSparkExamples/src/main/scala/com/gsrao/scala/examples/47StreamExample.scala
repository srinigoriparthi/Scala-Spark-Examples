package com.gsrao.scala.examples
import scala.collection.immutable._

/**
 * @author gsrao
 */
/**
 * Scala Stream
    	Stream is a lazy list. 
    	It evaluates elements only when they are required. 
    	This is a feature of scala. Scala supports lazy computation. 
    	It increases performance of your program.
 */
object StreamExample {
  def main(args:Array[String]){
    var st = 10 #:: 20 #:: Stream.Empty
    println("=======Stream=========")
    println(st)
    var st2 = (1 to 10).toStream
    println("=======S2=========")
    println(st2)
    println("=======Stream Head=========")
    println(st2.head)
    println(st.map(_*500))
  }
}