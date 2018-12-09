package com.gsrao.scala.examples

object CallingFunction {
  def main(args: Array[String]){
    println("Hello World Program")
    var result = 100
    result = checkingFunction(result)
    println("Result is:"+result)
  }
  
  def checkingFunction(a:Int) = if (a>0) 1 else -1;
}