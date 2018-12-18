package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Scala Trait Example: Implementing Multiple Traits in a Class
  	If a class implements multiple traits, it will extend the first trait, class, abstract class. with keyword is used to extend rest of the traits.
  	You can achieve multiple inheritances by using trait.
 */
/**
 * O/P:
    ATrait Printing
    BTrait Printing
 * 
 */
trait ATrait {
  def print()
}

trait BTrait {
  def show()
}

class TraitInheritance extends ATrait with BTrait{
  def print(){
    println("ATrait Printing")
  }
  def show(){
    println("BTrait Printing")
  }
}

object TraitInheritance {
  def main(args: Array[String]){
    var t = new TraitInheritance()
    t.print()
    t.show()
  }
}