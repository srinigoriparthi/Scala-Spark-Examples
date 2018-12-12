package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Secondary (auxiliary) Constructor / Secondary Constructor
  	You can create any number of auxiliary constructors in a class. 
  	You must call primary constructor from inside the auxiliary constructor. 
  	this keyword is used to call constructor from other constructor. 
  	When calling other constructor make it first line in your constructor.
 */

/**
 * O/P:
    Out side id:100
    In side Auxiliary:100 Name:Rao Age:37
    ID:100 Name:Rao Age:0
 * 
 */
class EmployeeAuxilary(id:Int, name:String){
  var age:Int = 0  
  def showDetails(){
    println("ID:"+id+" Name:"+name+" Age:"+age)
  }
  def this(id:Int,name:String,age:Int){
    this(id,name);    
    println("In side Auxiliary:"+id+ " Name:"+name+" Age:"+age)
  }
  println("Out side id:"+id)
}

object ClassAuxiliaryContructor {
  
  def main(args:Array[String]){
    var a = new EmployeeAuxilary(100,"Rao",37)
    a.showDetails()
  }
}


