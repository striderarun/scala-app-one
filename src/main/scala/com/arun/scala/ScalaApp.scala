package com.arun.scala

import scala.math._;

object ScalaApp {
  def main(args: Array[String]) {
    
    /** Making an immutable object of a class Student
     * 
     */
    val student = new Student("Arun",26);
    student.printStudentDetails();  
    
    /** Operators
     * In Scala, primitives are represented as objects. 
     * Since they are objects, operators are simply method calls!
     * So 1 + 2 is simply calling a method named + on the object 1 (an Int literal)
     */
    println("1 + 2 = " + 1.+(5));
    println("10/5 = " + 10./(5));
    
    /** Variables
     * Variables are declared using the var keyword.
     * In many cases, the type information can be omitted, thanks to Scala's type inference
     * To declare a variable with explicit type, put the type after the variable name following a colon 
     * eg: var x: Int = 1 + 2;
     */
    var x = 1 + 2;
    printf("x = %d \n", x);  
    x = 3 * 4; 
    printf("x changed to : %d \n", x);
    
    /** Final variables
     * Final variables are declared using the val keyword.
     * Cannot reassign value to y
     */
    val y = 1 + 2; 
    println("y = " + y);  
    //y = 3 * 4 //error: reassignment to val 
    
    /** String Interpolation
     *  From Scala 2.10, string interpolation is supported.
     *  Use variables in String, Better alternative to printf
     */
    val z = Pi;
    println(s"value of pi is $z");
    println(s"Pi * 2 = ${z * 2}");
        
    /** Collections and Ranges **/
    
    val rangeInclusive = 1 to 10;
    val rangeExclusive = 1 until 10;
    val evenNumbers1to10 = 2 to 10 by 2;
    
    println(s"1 to 10 : $rangeInclusive");
    println(s"1 until 10 : $rangeExclusive");
    println(s"2 to 10 by 2 : $evenNumbers1to10");
    
    /*Convert Range to List*/
    val numberList = rangeInclusive.toList;
    
    /* Map and Filter opearations */
    val greaterThan4List = numberList.filter { x => x >4 };
    val greaterThan4ListShort = numberList.filter(_ > 4);
    val multipliedBy2List = numberList.map { x => x * 2 };
    val multipliedBy2ListShort = numberList.map(_ * 2);

    println(s"List of numbers : $numberList");
    println(s"List of numbers greater than 4 : $greaterThan4ListShort");
    println(s"List of numbers multiplied by 2 : $multipliedBy2ListShort");
    
    /* Chaining operations */
    val numbersGreaterThan2MultipliedBy3List = numberList.filter(_ > 2).map(_ * 3);
    println(s"Numbers greater than 2 multiplied by 3: $numbersGreaterThan2MultipliedBy3List");
    println(s"Even numbers greater than 2 multiplied by 2: ${numberList.filter(_ % 2 == 0).filter(_ > 2).map(_ * 2)}");
    
    val shorthandChaining = numberList filter(_ % 2 == 0) filter(_ > 2) map(_ * 2);
    println(s"Even numbers greater than 2 multiplied by 2 shorthand: $shorthandChaining");

  }
}