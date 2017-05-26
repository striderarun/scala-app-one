package com.arun.inheritance

trait Pet {
  def speak { println("Yo") }
  def comeToMaster
}

class Dog extends Pet {
  def comeToMaster { ("I'm coming!") }
}

class Cat extends Pet {
  override def speak { ("meow") }
  def comeToMaster { ("That's not gonna happen.") }
}