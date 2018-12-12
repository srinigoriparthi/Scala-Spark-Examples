package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala this
		In scala, this is a keyword and used to refer current object. You can call instance variables, methods, constructors by using this keyword.
	Scala this Example
		In the following example, this is used to call instance variables and primary constructotr.
 */

class ThisExample{ 
  
  var id:Int = 0
  var name:String = ""
  
  def this(id:Int, name:String){
    this()
    this.id = id
    this.name = name
  }
  
  def show(){
    println("ID:"+id+ " Name:"+name)
  }
  
}

object ThisExample {
  def main(args:Array[String]){
    var t = new ThisExample(10,"Srini")
    t.show()
  }  
}