package com.gsrao.scala.examples
import scala.collection.immutable.SortedSet
import scala.collection.immutable.HashSet
import scala.collection.immutable.BitSet
import scala.collection.immutable.ListSet
/**
 * @author gsrao
 */
/**
 *  It is used to store unique elements in the set. 
    It does not maintain any order for storing elements. 
    You can apply various operations on them. 
    It is defined in the Scala.collection.immutable package.
 */


object SetExamples {
  
  def main(args:Array[String]){
    var s1 = Set("Cricket", "Apple", "Golf")
    var s2 = Set("Boxing", "Volly Ball", "Tennis","Apple")
    println("Basic Set with all Elements are: "+s1)
    s1+="Hello"
    println("Adding new Element:"+s1)
    s2-="Boxing"
    println("Removing Element:"+s2)
    println("Basic Set Head is: "+s1.head)
    println("Basic Set Tail is: "+s1.tail)
    println("Intersection of both Sets are: "+s1.intersect(s2))
    println("Intersection of both Sets are: "+(s1 & s2))
    println("Union of both Sets are: "+(s1.union(s2)))
    
    println("\n-----S1 with For Loop-----")
    for(e <- s1){
      println(e)
    }
    
    println("\n----S2 with For Each-----")
    s2.foreach { e => println(e) }
    
    println("\n-------------Sorted Set displays the elements in sequential Order-----------------")
    var s3:SortedSet[Int] = SortedSet(4,3,7,2,1)
    s3.foreach { (x:Int) => println(x) }
    
    println("\n-------------- Hash Set neither keeps the elements in Insertion order nor in Ascending order ----------------")
    var hs = HashSet(4,2,6,1,0)
    hs.foreach((e:Int) => println("Hash Set Element is:"+e))
    
    println("\n-------------- Bit Set maintains non -ve values and displayes in Ascending order ----------------")
    var bs = BitSet(4,2,6,1,0)
    bs.foreach((e:Int) => println("Bit Set Element is:"+e))
    bs+=100
    println("Bit Set after adding new Element:"+bs)
    
    println("\n-------------- List Set displays elements in the reverse insertion Order ----------------")
    var ls = ListSet(4,2,6,1,0)
    ls.foreach((e:Int) => println("List Set Element is:"+e))
    ls+=100
    println("List Set after adding new Element:"+ls)
    
  }
}