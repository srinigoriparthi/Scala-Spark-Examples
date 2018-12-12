package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Constructor
  	In scala, constructor is not special method. Scala provides primary and any number of auxiliary constructors. 
  	We have explained each in details in the following example.
	Scala Default Primary Constructor
  	In scala, if you don't specify primary constructor, compiler creates a constructor which is known as primary constructor. 
  	All the statements of class body treated as part of constructor. It is also known as default constructor.
 */

class Employee(id:Int, name:String){
  def showEmployeeDetails(){
    println("Id:"+id+ " Name:"+name)  
  }
}
object ClassConstructorsExample {
  
  def main(args:Array[String]){
     var e = new Employee(100, "Srini")
     e.showEmployeeDetails()
  }
}