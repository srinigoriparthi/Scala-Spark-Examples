package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * Field Overriding
    	In scala, you must use either override keyword or override annotation when you are overriding methods or fields of super class. 
    	If you don't do this, compiler reports an error and stops execution of program.
    	
    	O/P:
    		Deposit:2000    		
 */
class Bank{
  val deposit:Int = 1000
}

class Sbi extends Bank{
  override val deposit:Int = 2000
  def show(){
    println("Deposit:"+deposit)
  }
}

object FieldOverriding {
  def main(args:Array[String]){
    var s = new Sbi()
    s.show()  
  }
}