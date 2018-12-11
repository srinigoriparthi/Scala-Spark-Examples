package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Case Classes and Case Object
    Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
    It uses equal method to compare instance structurally. It does not use new keyword to instantiate object.
    All the parameters listed in the case class are public and immutable by default.
 */

case class student(id:Int, name:String);
object CaseClassExample {
  
  def main(args: Array[String]){
    var s = student(100,"gsrao")
    println("Student ID:"+s.id);
    println("Student Name:"+s.name);
  }
  
}