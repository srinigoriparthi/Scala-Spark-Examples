package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * 	Higher order function is a function that either takes a function as argument or returns a function.
		In other words we can say a function which works with function is called higher order function.
		Higher order function allows you to create function composition, lambda function or anonymous function etc.	
 */
object FunctionHigherOrder {
  
  def main(args: Array[String]){
    higherOrderFunction(20,multiplywithTwo);
  }
  
  def higherOrderFunction(a:Int, f:Int => AnyVal):Unit = {
    println("Result is: "+f(a))
  }
  
  def multiplywithTwo(a:Int):Int ={
    a*2
  }
}