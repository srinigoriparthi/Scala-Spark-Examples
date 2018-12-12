package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Constructor Calling by using this keyword
  	In the following example this is used to call constructor. 
  	It illustrates how we can call constructor from other constructor. 
  	You must make sure that this must be first statement in the constructor while calling to other constructor otherwise compiler throws an error
  */

class EmployeeContructor(name:String){
  def this(id:Int, name:String){
    this(name)
    println("ID:"+ id+ " Name:"+name)
  }
}

object ConstructorCallingByThis {  
  def main(args:Array[String]){
    var e = new EmployeeContructor(10,"Srini")
  }
}