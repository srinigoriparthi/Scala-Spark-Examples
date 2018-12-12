package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * 
Scala Method Overloading Example by using Different Data Type
	In the following example, we have created two add method having same number of parameters but different data types.
 */

/**
 * O/P:
    Add Method with Two Params:30
    Add Method with Three Params:600.0
 * 
 */
class ArithmeticByType{
  def add(a:Int, b:Int){
    println("Add Method with Two Params:"+ (a+b))
  }
  def add(a:Double, b:Double, c:Double){
    println("Add Method with Three Params:"+ (a+b+c))
  }
}
object MethodOverloadingByType {
  
  def main(args:Array[String]){    
    var a = new ArithmeticByType()
       a.add(10,20)
       a.add(100.0,200.0,300.0)
  }
}