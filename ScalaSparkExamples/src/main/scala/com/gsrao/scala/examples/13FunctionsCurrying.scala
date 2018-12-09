package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * It is a technique of transforming a function that takes multiple arguments into a function that takes a single argument.
 */
object FunctionsCurrying {
  
  def main(args: Array[String]){
    
    var result = addIt(10)(10)
    println("Result is: "+result)
    
    var result1 = addIt(10)_ 
    var result2 = result1(3)
    println("Result 2 is: "+result2)
    
  }
  
  def addIt(a:Int)(b:Int):Int ={
    a+b
  }
    
}