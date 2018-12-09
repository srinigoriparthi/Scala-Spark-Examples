package com.gsrao.scala.examples

object CasePatternMatching {
  
  def main(args: Array[String]){
    var result = search(1)
    println(result)
    println("===========")
    result = search("Hello")
    println(result)
    println("===========")
    result = search("Yes")
    println(result)
    println("===========")
  }
  
  def search(a:Any):Any = a match{
    case 1 => println("One")
    case "Hello" => println("Hello")
    case _ => {
      println("Nothing")
      "srini"
    }
  }
}