package com.gsrao.scala.examples
import java.io._
import scala.io.Source

/**
 * @author gsrao
 */
/**
 * Scala File handling
  	Scala provides predefined methods to deal with file. 
  	You can create, open, write and read file. 
  	Scala provides a complete package scala.io for file handling.
  
  	In this chapter, we will discuss all these file operations in detail.
  	Scala doesn't provide file writing methods. 
  	So, you have to use the Java PrintWriter or FileWriter methods.
  	The above code will create a text file ScalaFile.txt. 
  	After creating file printwriter is used to write content to this file.
 * 
 */
object FileHandling {
  def main(args: Array[String]){
    //Writing the content to File
    var f= new File("D://DEVWORK//GIT-REPO//ScalaSparkExamples//src//main//resources//FileExample.txt")
    var pw = new PrintWriter(f)
    pw.println("Hello Srini !!")
    pw.println("Hi GSRao !!")
    pw.close()    
    
    //Reading from File
    var fr = Source.fromFile(f)
    for (line <- fr.getLines()){
      println(line)
    }
    fr.close()
    
  }
}