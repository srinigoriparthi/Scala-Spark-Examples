package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Singleton Object
      Singleton object is an object which is declared by using object keyword instead by class. 
      No object is required to call methods declared inside singleton object.
      
      In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
      If you don't create singleton object, your code will compile successfully but will not produce any output. 
      Methods declared inside Singleton Object are accessible globally. 
      A singleton object can extend classes and traits.
 */
object Singleton {
  
  def main(args: Array[String]){
    SingletonObject.hello()
  }
}

object SingletonObject{
  
  def hello(){
    println("I am from Singleton Object !!")
  }
}