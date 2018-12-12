package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * 
Scala Method Overloading
	Scala provides method overloading feature which allows us to define methods of same name but having different parameters or data types. It helps to optimize code.
Scala Method Overloading Example by using Different Parameters
	In the following example, we have define two add methods with different number of parameters but having same data type.
 */
/**
 * O/P:
    Add Method with Two Params:30
    Add Method with Three Params:60
 * 
 */
class Arithmetic{
  def add(a:Int, b:Int){
    println("Add Method with Two Params:"+ (a+b))
  }
  def add(a:Int, b:Int, c:Int){
    println("Add Method with Three Params:"+ (a+b+c))
  }
}
object MethodOverloading {
  
  def main(args:Array[String]){
    
    var a = new Arithmetic()
       a.add(10,20)
       a.add(10,20,30)
  }
}