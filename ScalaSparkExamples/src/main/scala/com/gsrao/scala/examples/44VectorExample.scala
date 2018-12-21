package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
  Scala Vector
  	Vector is a general-purpose, immutable data structure. 
  	It provides random access of elements. 
  	It is good for large collection of elements.
  	It extends an abstract class AbstractSeq and IndexedSeq trait.
 */
object VectorExample {
  def main(args:Array[String]){
    var v:Vector[Int] = Vector(3,2,6,1,8,3)
    var v2 = Vector(3,2,17,4,9)
    println(v)
    println(v2)
    println("Vector V2 Head:"+v2.head)
    println("Vector V2 Tail:"+v2.tail)
    println("Vector V2 Drop Element:"+v2.drop(17))
    println("Vector V2 Length:"+v2.length)
    println("Vector V Slice:"+v.slice(0, 3))    
  }
}