package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * O/P:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
    	at com.gsrao.scala.examples.ExceptionHandle.devide(40ExceptionHandling.scala:12)
    	at com.gsrao.scala.examples.ExceptionHandling$.main(40ExceptionHandling.scala:53)
    	at com.gsrao.scala.examples.ExceptionHandling.main(40ExceptionHandling.scala)
 */
class ExceptionHandle(){
  def devide(a:Int, b:Int) = {
    a/b
  }
}

/**
 * O/P:
 * 	Catched Exception is :java.lang.ArithmeticException: / by zero
		================
 */
class ExceptionHandleTryCatch(){
  def devide(a:Int, b:Int) = {   
    try{
       a/b
    }catch{
      case e: ArithmeticException => println("Catched Exception is :"+e)
    }
  }
}

/**
 * O/P:
 * 	Other Exception: java.lang.ArrayIndexOutOfBoundsException: 10
		================
 */
class MultipleExceptionCatch(){
  def devide(a:Int, b:Int) = {
    try{
      var arr = Array(1,2,3)
      arr(10)
    }catch{
      case e: Exception => println("Other Exception: "+e)
    }
  }
}

/**
 * O/P:
 * 	Exception caught: java.lang.ArrayIndexOutOfBoundsException: 10
    I am from Finally !!
    I am always prints !!
    ================
 */
class FinallyCatchException{
  def devide(a:Int, b:Int){
    try{
      var arr = Array(1,2)
      arr(10)
    }catch{
      case e: Exception => println("Exception caught: "+e)
    }
    finally{
      println("I am from Finally !!")
    }
    println("I am always prints !!")
  }
}

object ExceptionHandling {
  def main(args:Array[String]){
    var et = new ExceptionHandleTryCatch()
    et.devide(100,0)
    println("================")
      
    var m = new MultipleExceptionCatch()
    m.devide(100, 0)
    println("================")
    
    var f = new FinallyCatchException()
    f.devide(100, 0)
    println("================")
    
    var e = new ExceptionHandle()
    e.devide(100, 0);   
    println("================")
       
  }
}