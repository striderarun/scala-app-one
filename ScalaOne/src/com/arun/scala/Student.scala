package com.arun.scala

class Student(name: String, age: Int) {
  var studentName: String = name;
  var studentAge:Int = age;
  
  def printStudentDetails() {
    println("Student name : " + studentName);
    println("Student age : " + studentAge);
  }
}