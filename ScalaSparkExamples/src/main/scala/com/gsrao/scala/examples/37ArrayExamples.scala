package com.gsrao.scala.examples
/**
 * @author gsrao
 */

/**
 * Scala Single Dimensional Array
  	Single dimensional array is used to store elements in linear order. 
  	Array elements are stored in contiguous memory space. So, if you have any index of an array, you can easily traverse all the elements of the array.
 * 
 * O/P:
 *	2nd Element is:3
    SingleDimention Array Value:1
    SingleDimention Array Value:2
    SingleDimention Array Value:3
    SingleDimention Array Value:4
    SingleDimention Array Value:5
    ==============
 */

class SingleDimension{
  var a = Array(1,2,3,4,5)
  def show(){
    for(i <- a){
    println("SingleDimention Array Value:"+i)
    }  
  }
  println("2nd Element is:"+a(2))  
}

/**
 * Scala Single Dimensional
    	In this example, we have created an array by using new keyword which is used to initialize memory for array. 
    	The entire array elements are set to default value, you can assign that later in your code.
 * 
 * O/P:
 * 	ArrayInt:0
    ArrayInt:0
    ArrayInt:0
    ArrayInt:0
    ArrayInt:0
    2nd Element is:100
    ==============
 */
class ArrayInt{
  var a = new Array[Int](5)
  for(i <- a){
    println("ArrayInt:"+i)
  }
  a(2)=100
  println("2nd Element is:"+a(2))
}
/**
 * Scala Passing Array into Function
    	You can pass array as an argument to function during function call. 
    	Following example illustrate the process how we can pass an array to the function.
 * 
 * O/P:
 * 	ArrayFunction:10
    ArrayFunction:11
    ArrayFunction:12
    ==============
 */
class ArrayFunction(arr:Array[Int]){
  for(i <- arr){
    println("ArrayFunction:"+i)
  }
}

/**
 * Scala Array Example: Iterating By using Foreach Loop
		You can also iterate array elements by using foreach loop.
 * O/P:
 * 	ForEachLoop:1
    ForEachLoop:2
    ForEachLoop:3
    ForEachLoop:4
    ForEachLoop:5
    ==============
 */
class ForEachLoop{
  var f = Array(1,2,3,4,5)
  f.foreach { x => println("ForEachLoop:"+x) }
}

/**
 * O/P:
 *   0
     0
     200
     0
    MultiDimentional Third Element:200
    ==============
 */
class MultiDimentional{
  var ad = Array.ofDim[Int](2,2)
  ad(1)(0)=200
  for(i <- 0 to 1){
    for(j <- 0 to 1){
      println(" "+ad(i)(j))
    }
  }
  println("MultiDimentional Third Element:"+ad(1)(0))
}

/**
 * O/P:
 *   1
     2
     3
     4
     5
    
     6
     7
     8
     9
     10
    
    ==============
 */
class ArrayOfArray{
  var aa = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
  for(i <- 0 to 1){
    for(j <- 0 to 4){
      println(" "+aa(i)(j))
    }
    println()
  }
}

object ArrayExamples {
  
  def main(args:Array[String]){
    var s = new SingleDimension()
    s.show()
    println("==============")
    
    var a = new ArrayInt()
    println("==============")
    
    var af = Array(10,11,12)
     var f = new ArrayFunction(af)
    println("==============")
    
    new ForEachLoop()
    println("==============")
    
    new MultiDimentional()
    println("==============")
    
    new ArrayOfArray()
    println("==============")
  }
}