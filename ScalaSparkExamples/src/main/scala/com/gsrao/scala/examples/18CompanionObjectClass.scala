package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Companion Object
    In scala, when you have a class with same name as singleton object, it is called companion class and the singleton object is called companion object.
    The companion class and its companion object both must be defined in the same source file.
 */
class CompanionObject{
  
  def hello(){
    println("I am from Companion Class !!")
  }
}

object CompanionObject {
  
  def main(args: Array[String]){
    new CompanionObject().hello()
  }
}