package com.gsrao.scala.examples

/**
 * @author gsrao
 */

class StringExample{
  var s1="Scala String Example"
  
  /**
 * O/P:
 * 	Scala String Example
		===============
 */
  def show(){
    println(s1)
  }

  /**
   * O/P:
   *  manipulation: Scala String Example
			===============
   */

  def manipulation(){
    "Srini"+s1
    println("manipulation: "+s1)
  }
  
  /**
   * O/P:
   * 	appendString: Rao Scala String Example
			===============
   */
  def appendString(){
    s1="Rao "+s1
    println("appendString: "+s1)
  }
  
  var s2 = "GSRAO"
  var s3 = "Srini"
  var s4 = "GSRAO"
  /**
   * O/P:
   *  false
      true
      ===============
   */
  def boolString(){
    println(s2==s3)
    println(s2==s4)
  }
}


object StringExamples {
 
  def main(args:Array[String]){
    var s=new StringExample()
    s.show()
    println("===============")
    
    s.manipulation()
    println("===============")
    
    s.appendString()
    println("===============")
    
    s.boolString()
    println("===============")    
    
  }
}