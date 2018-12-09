package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * 	Scala is a first class function language which means it allows you to passing 
 						function, returning function, composing function, nested function etc. 
		An example below explain about how to define and call nested functions...
 */
object FunctionsNested {
  
  def main(args: Array[String]){    
    var result = addingFunction(20,10,10)
    println("Result is: "+result)
  }
  
  def addingFunction(a:Int, b:Int, c:Int):Int = {
    a+anotherNestedFunction(b,c)
  }
  
  def anotherNestedFunction(b:Int, c:Int):Int = {
    b+c
  }
  
}