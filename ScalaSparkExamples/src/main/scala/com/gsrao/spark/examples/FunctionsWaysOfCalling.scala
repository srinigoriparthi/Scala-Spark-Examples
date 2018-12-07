package com.gsrao.spark.examples

object FunctionsWaysOfCalling {
  
  
  def main(args: Array[String]){    
    
    var result = somefunction(10,20)
    println("Result from Function: "+result)
        
    var myresult = someResult()
    println("Result from MyResult: "+myresult)
    
    var defaultresult =  someDefaultFunction(2)
    println("Result from default values Function:" + defaultresult)
  }
  
  def somefunction(a:Int,b:Int):Int = {
    var c = a+b;
    c 
  }
  
  def someResult():Int = {
    var a = 10 
    a
  }
  
  def someDefaultFunction(a:Int=0, b:Int=4):Int ={
    a+b
  }

}