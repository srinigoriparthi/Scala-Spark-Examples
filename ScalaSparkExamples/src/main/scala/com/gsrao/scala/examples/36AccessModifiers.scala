package com.gsrao.scala.examples

/**
 * @author gsrao
 */
/**
 * 
Scala Access Modifier
	Access modifier is used to define accessibility of data and our code to the outside world. 
	You can apply accessibly to classes, traits, data members, member methods and constructors etc. 
	Scala provides least accessibility to access to all. 
	You can apply any access modifier to your code according to your application requirement.

Scala provides only three types of access modifiers, which are given below:
	No modifier
	Protected
	Private
In scala, if you don't mention any access modifier, it is treated as no modifier.

	Following table contains information about accessbilty of access modifiers.
	Modifier			Outside package		Package		Class		Subclass	Companion
	No access modifier	Yes					Yes			Yes			Yes			Yes
	Protected			No					No			Yes			Yes			Yes
	Private				No					No			Yes			No			Yes

Scala Example: Private Access Modifier
	In scala, private access modifier is used to make data accessible only within class in which it is declared. 
	It is most restricted and keeps your data in limited scope. Private data members does not inherit into subclasses.

Scala Example: Protected Access Modifier
	Protected access modifier is accessible only within class, sub class and companion object. 
	Data members declared as protected are inherited in subclass. Let's see an example.
 */
/**
 * O/P:
 * 	Example Show:10
		Hello print:20
		No Access Modifier:30
 * 
 */
class Example{
  private var a:Int = 10;
  def show(){
    println("Example Show:"+a)
  }
}

class AccessExample{
  protected var a:Int = 20
}

class HelloExample extends AccessExample{
  def print(){
    println("Hello print:"+a)
  }
}

class NoAccessModifier{
  var a:Int=30
  def show(){
    println("No Access Modifier:"+a)
  }
}
object AccessModifiers {
  def main(args: Array[String]){
    var e = new Example()
    e.show()
    
    var h = new HelloExample()
    h.print()
   
    var n = new NoAccessModifier()
    n.show()
   
  }
}