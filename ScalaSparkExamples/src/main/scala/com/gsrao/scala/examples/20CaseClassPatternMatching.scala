package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Case Class and Pattern Matching Example
    A case class which has no arguments is declared as case object instead of case class. 
    case object is serializeable by default.
 */


trait StudentTrait;
case class student1(id:Int, name:String) extends StudentTrait;
case class student2(id:Int) extends StudentTrait;

object CaseClassPatternMatching {
  
  def main(args:Array[String]){    
    callStudent(student1(111,"Srini"));
    callStudent(student2(120));    
  }
  
  def callStudent(f:StudentTrait) = f match {
    case student1(id,name) => println("Id:"+id+ " Name:"+name)
    case student2(id) => println("Id:"+id)
  }
}