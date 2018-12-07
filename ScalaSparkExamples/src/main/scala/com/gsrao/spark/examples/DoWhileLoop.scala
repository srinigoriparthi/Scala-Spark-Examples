package com.gsrao.spark.examples

object DoWhileLoop {
  
  def main(args: Array[String]){
    var a = 10;
    do{
      println(a)
      a+=1;
    }while(a<=20)
  }
}