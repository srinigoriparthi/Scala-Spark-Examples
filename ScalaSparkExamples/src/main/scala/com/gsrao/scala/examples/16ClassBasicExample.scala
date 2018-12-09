package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * What is Class ?
    Class is a template or a blueprint. It is also known as collection of objects of similar type.
    In scala, a class can contain:
    	Data member
    	Member method
    	Constructor
    	Block
    	Nested class
    	Super class information etc.
    You must initialize all instance variables in the class. There is no default scope. 
    If you don't specify access scope, it is public. There must be an object in which main method is defined. 
    It provides starting point for your program. Here, we have created an example of class.
 */

class Student {
  var id:Int = 100
  var name:String = "Srini"
}

class StudentConstructor(id:Int, name:String){
  def show(){
    println("StudentConstructor ==> Student Id:"+id+" Student Name:"+name)
  }
}

class StudentRecord(id:Int, name:String){
  def getRecord(){
    println("StudentRecord ==> Student Id:"+id+" Student Name:"+name)
  }
}

class StudentAnonlymous(id:Int, name:String){
  def recordAnonymous(){
    println("StudentAnonlymous ==> Student Id:"+id+" Student Name:"+name)
  }
}

object MainObject{
  
  def main(args: Array[String]){    
    
    //Basic Class Example
    var s =  new Student()
    println("Student ==> Student Id:"+s.id+" Student Name:"+s.name)
    println
    
    //Class Example with Constructor
    var sc =  new StudentConstructor(200, "gsrao")
    sc.show()
    println
    
    //Class Example maintaining POJO's of Records
    var scr1 = new StudentRecord(101, "Srini")
    var scr2 = new StudentRecord(102, "Rao")
    scr1.getRecord()
    scr2.getRecord()
        println
    
    // Class Example with Anonymous
    new StudentAnonlymous(111,"Hello").recordAnonymous()
  }
    
}