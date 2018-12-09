package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * 	In scala, functions can be composed from other functions. 
		It is a process of composing in which a function represents the application of two composed functions.
 */
object FunctionComposing {
  
  def main(args: Array[String]){
    for (i <- 10 to 12){
      var result = composingFunction(innerFunction(i))
      println("Final Composing Function Result: "+result)  
    }
    
  }
  
  def composingFunction(a:Int):Int = {
    a*2
  }
  
  def innerFunction(a:Int):Int = {
    a+2
  }
}