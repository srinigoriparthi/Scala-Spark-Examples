package com.gsrao.spark.examples

/**
 * @author gsrao
 */
object FunctionsCalling {
  
  def main(args: Array[String]){    
    var result = somefunction(10,20)
    println("Result from Function: "+result)
        
    var myresult = someResult()
    println("Result from MyResult: "+myresult)
  }
  
  def somefunction(a:Int,b:Int):Int = {
    var c = a+b;
    c 
  }
  
  def someResult():Int = {
    var a = 10 
    a
  }
}