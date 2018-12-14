package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Abstract Class
	A class which is declared with abstract keyword is known as abstract class. 
	An abstract class can have abstract methods and non-abstract methods as well. Abstract class is used to achieve abstraction. 
	Abstraction is a process in which we hide complex implementation details and show only functionality to the user.
	In scala, we can achieve abstraction by using abstract class and trait.
Scala Abstract Class Example
	In this example, we have created a Bike abstract class. It contains an abstract method. 
	A class Hero extends it and provides implementation of its run method.
	A class that extends an abstract class must provide implementation of its all abstract methods. You can't create object of an abstract class.
 */
/**
 * O/P:
    a= 100
    b= 20
    c= 30
    Performance
 */
abstract class Bikes(a:Int){
  var b:Int = 20
  var c:Int = 25
  def run()
  def performance(){
    println("Performance")
  }
}

class Hero(a:Int) extends Bikes(a){
  c =30
  def run(){
    println("a= "+a)
    println("b= "+b)
    println("c= "+c)
  }
}

object AbstractClass {
  def main(args:Array[String]){
    var h = new Hero(100)
    h.run();
    h.performance()
  }
}