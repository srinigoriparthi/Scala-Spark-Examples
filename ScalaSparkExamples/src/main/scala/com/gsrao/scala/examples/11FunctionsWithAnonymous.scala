package com.gsrao.scala.examples

/**
 * @author gsrao 
 */

/**
 * 	Anonymous function is a function that has no name but works as a function. 
		It is good to create an anonymous function when you don't want to reuse it latter.
 */
object FunctionsWithAnonymous {
  
  def main(args: Array[String]){
    var result = (a:Int, b:Int) => a+b
    println("Anonymouse Function Result: "+result(20,20))
    
  }
}