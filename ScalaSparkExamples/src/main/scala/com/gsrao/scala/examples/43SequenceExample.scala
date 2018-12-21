package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Seq
  	Seq is a trait which represents indexed sequences that are guaranteed immutable. 
  	You can access elements by using their indexes. It maintains insertion order of elements.
  	Sequences support a number of methods to find occurrences of elements or subsequences. It returns a list.
  	You can also access elements in reverse order by using reverse method.
 */
object SequenceExample {
  def main(args:Array[String]){
    var seq:Seq[Int] = Seq(5,2,7,1,3)
    seq.foreach((e:Int) => println("Seq Element is:"+e))
    println("\n is Seq Empty:"+seq.isEmpty)
    println("\n Seq in reverse:"+seq.reverse)
    println("\n Seq Contains:"+seq.contains(2))
    println("\n Seq Index Of:"+seq.indexOf(1))
    println("\n Seq Ends with:"+seq.endsWith(Seq(1,3)))
  }
}