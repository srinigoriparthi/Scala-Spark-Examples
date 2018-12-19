package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * O/P:
 * 	String Concatination:SriniRao
    ==============
    CompareTo with both equals: 0
    CompareTo with both not equals: 1
    ==============
    Concatinaiton with Plus: SriniRao
    ==============
    Substring: Rao
    ==============
    Tabing: Hello	Srini 
    Rao
    ==============
 */
class StringOperations(){
  var s1 = "Srini"
  var s2 = "Rao"
  var s4 = "Srini"
  def show(){
    var s3 = s1.concat(s2)
    println(s"String Concatination:$s3")    
    println("==============")
    
    println("CompareTo with both equals: "+s1.compareTo(s4))
    println("CompareTo with both not equals: "+s1.compareTo(s2))
    println("==============")
    
    var s6 = s1+s2
    println("Concatinaiton with Plus: "+s6)
    println("==============")
    
    println("Substring: "+s2.substring(0,3))
    println("==============")
    
    var gs = "Hello\tSrini \nRao"
    println("Tabing: "+gs)
    println("==============")
  }  
}

object StringOperations {
  
  def main(args:Array[String]){
    var s = new StringOperations()
    s.show()        
  }
}