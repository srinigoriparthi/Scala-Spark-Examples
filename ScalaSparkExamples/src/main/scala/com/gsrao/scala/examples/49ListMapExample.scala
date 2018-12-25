package com.gsrao.scala.examples

import scala.collection.mutable._

/**
 * @author gsrao
 */
/**
 * Scala ListMap
  	This class implements immutable maps by using a list-based data structure. 
  	It maintains insertion order and returns ListMap. 
  	This collection is suitable for small elements.
		You can create empty ListMap either by calling its constructor or using ListMap.empty method.
 */
object ListMapExample {
  def main(args: Array[String]){
    var lm = ListMap("S"->"Srini", "A"->"Apple", "G" -> "Goriparthi")
    lm.foreach{
      case (k,v) => println("Key:"+k+" Value:"+v)
     }    
    println("===========")
    var lm2 = ListMap.empty    
    println("Empty Map:"+ lm2)
    println("===========")
    var lm3 = lm +( "R"->"Rao")
     lm3.foreach{
      case (k,v) => println("Key:"+k+" Value:"+v)
     }  
  }
}