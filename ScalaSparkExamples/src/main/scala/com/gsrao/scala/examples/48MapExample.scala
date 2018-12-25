package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * 
 	Scala Maps
  	Map is used to store elements. 
  	It stores elements in pairs of key and values. 
  	In scala, you can create map by using two ways either by using comma separated pairs or by using rocket operator.

  Scala Map Example: Adding and Removing Elements
  	You can add and remove new elements in maps. 
  	Scala provides you lots of predefined method. 
  	You can use them to perform operations on the Maps. 
  	In the following example, we have created a new Map.
 */
object MapExample {
  def main(args:Array[String]){
    var mp1 = Map(("A","APPLE"),("B","BOY"))
    println("=== Map 1 ======")
    println(mp1)
    var mp2 = Map("A" -> "Apple", "B" -> "Boy")
    println("=== Map 2 ======")    
    println(mp2)    
    var mp3:Map[String,String] = Map.empty
    mp3 = Map("S" -> "Srini")
    println("=== Map 3 ======")    
    println(mp3)
    println("=== Adding New Element ====")
    mp1 = mp1 + ("C" -> "CAT")
    println(mp1)
    println("=== Subtract an Element ====")
    mp1 = mp1 - "B"
    println(mp1)
  }
}