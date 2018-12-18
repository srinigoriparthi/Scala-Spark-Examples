package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Trait
	A trait is like an interface with a partial implementation. 
	In scala, trait is a collection of abstract and non-abstract methods. 
	You can create trait that can have all abstract methods or some abstract and some non-abstract methods.

	A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait. 
	Any variable which is declared by using val or var but not initialized is considered abstract.
	Traits are compiled into Java interfaces with corresponding implementation classes that hold any methods implemented in the traits.
 */

/**
 * O/P:
 *  Hello Printable !!
    Showable Traint Printing !!
    Show Printing !!!
 * 
 */

trait Printable{
  def print();
}

class Hello extends Printable{
  def print(){
    println("Hello Printable !!")
  }
}

trait Showable{
  def print()
}

/**
 * The below class Show should be declare as abstract if you don't define the method of trait Showable.
 * Otherwise Program won't compile.
 * 
 */
abstract class Show extends Showable{
  def printing(){
    println("Show Printing !!!")
  }
}

class Showing extends Show{
  def print(){
    println("Showable Traint Printing !!")
  }
}

object TraitExample {  
  def main(args: Array[String]){
    var h = new Hello()
    h.print()
    
    var s = new Showing()
    s.print()
    s.printing()
  }
}