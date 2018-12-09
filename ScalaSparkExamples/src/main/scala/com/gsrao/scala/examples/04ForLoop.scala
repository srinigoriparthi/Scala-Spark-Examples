package com.gsrao.scala.examples

object ForLoop {
  
  def main(args: Array[String]){
   
    println("====For Loop in Range======")
    for(a <- 1 to 5 ){
      println(a)
    }
    
    println("====For Loop in Range with Until=====")    
    for(a <- 10 until 15){
      println(a)
    }    
    
    println("====For Loop in Range with Condition =====")
    for(a <- 1 to 10 if a%2==0){
      println(a)
    }
        
    //For Loop Example with Yield
    println("====For Loop in Range =====")
    var result = for(a <- 1 to 5) yield a
    for(i <- result){
       println(i)      
    }
      
    // For Loop with List
    println("===For Loop in List=====")
    var list = List(5,6,7,8,9)
    for(i <- list){
      println(i);
    }
        
    //For each Loop
    println("====For Loop with For Each=====")
    var list1 = List(3,4,5,6,7,8)
    list1.foreach { x => println(x) }
    
   println("=====For Loop with By =====")
   for(i <- 1 to 10 by 2){
     println(i)
   }
    
  }
}