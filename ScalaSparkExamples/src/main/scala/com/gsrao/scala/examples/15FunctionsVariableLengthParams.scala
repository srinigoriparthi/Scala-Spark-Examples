package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * 	In scala, you can define function of variable length parameters. 
		It allows you to pass any number of arguments at the time of calling the function.
 */
object FunctionsVariableLengthParams {
  
  def main(args: Array[String]){
    
    var result = variableLengthFunctions(1,2,3,4,5)
    println("Result is: "+result)
  }
  
  def variableLengthFunctions(args:Int*) = {
    var sum = 0
    for (i <- args){
      sum +=i
    }
    sum
  }
}