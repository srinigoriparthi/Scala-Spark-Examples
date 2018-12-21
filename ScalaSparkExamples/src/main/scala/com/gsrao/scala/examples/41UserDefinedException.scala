package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * O/P:
 * Exception Caught is:com.gsrao.scala.examples.MyOwnException: Your Not Eligible !!
 */
class MyOwnException(g:String) extends Exception(g){}

class CustomException{
   @throws(classOf[MyOwnException])
  def validate(age:Int) = {
    if(age < 18){
      throw new MyOwnException("Your Not Eligible !!")
    }
  }
}

object UserDefinedException {
  def main(args: Array[String]){
    var c = new CustomException()
    try{
      c.validate(10)
    }catch{
      case e: Exception => println("Exception Caught is:"+e)
    }
  }
}