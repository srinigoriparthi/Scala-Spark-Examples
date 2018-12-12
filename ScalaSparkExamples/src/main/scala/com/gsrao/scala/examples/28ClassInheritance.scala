package com.gsrao.scala.examples

/**
 * @author gsrao
 */

/**
 * Scala Single Inheritance Example 
 */

/**
 * O/P:
 * 	Bonus:50
		Salary:100
 * 
 */

class EmployeeSalary{
  var salary:Int = 100
}

class EmployeeBonus extends EmployeeSalary {
  var bonus:Int = 50
  println("Bonus:"+bonus)
  println("Salary:"+salary)
}

object ClassInheritance {
  def main(args:Array[String]){
    new EmployeeBonus()
  }
}