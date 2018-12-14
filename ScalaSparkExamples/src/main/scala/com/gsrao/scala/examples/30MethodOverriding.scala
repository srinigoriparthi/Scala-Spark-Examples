package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Method Overriding
  	When a subclass has the same name method as defined in the parent class, it is known as method overriding. 
  	When subclass wants to provide a specific implementation for the method defined in the parent class, it overrides method from parent class.
  	In scala, you must use either override keyword or override annotation to override methods from parent class.
 */
/**
 * O/P:
 		This is Bike !!
 */
class Vehicle{
  def show(){
    println("This is Vehicle !!")
  }
}

class Bike extends Vehicle{
  override def show(){
    println("This is Bike !!")
  }
}


object MethodOverriding {
  
  def main(args:Array[String]){
    var b = new Bike()
    b.show()
  }
}