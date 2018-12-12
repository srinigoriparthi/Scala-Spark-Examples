package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Multilevel Inheritance Example
 */

/**
 * O/P:
 * 	Salary1:=100
		Salary2:=200
 * 
 */

class A{
  var sal1:Int = 100
}

class B extends A{
  var sal2:Int = 200
}

class C extends B{
  def show(){
    println("Salary1:="+sal1)
    println("Salary2:="+sal2)
  }
}

object ClassMultiLevelInheritance {
  def main(args:Array[String]){
    var c = new C();
    c.show()
  }
}