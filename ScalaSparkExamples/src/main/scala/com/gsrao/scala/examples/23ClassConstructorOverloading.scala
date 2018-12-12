package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Example: Constructor Overloading
		In scala, you can overload constructor. Let's see an example.
 */

/**
 * O/P:
      Id:100
      Id:100 Name:Rao
      Id:200
 * 
 */
class EmployeeConOverLoad(id:Int){
  def this(id:Int, name:String) = {
    this(id)
    println("Id:"+id+ " Name:"+name)
  }
  println("Id:"+id)
}

object ClassConstructorOverloading {  
  def main(args:Array[String]){
    new EmployeeConOverLoad(100,"Rao")
    new EmployeeConOverLoad(200)    
  }
}