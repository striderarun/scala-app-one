package com.arun.inheritance

object InheritanceClient {

  def main(args: Array[String]) {
    val lion = new Lion;
    lion.eat();
    lion.drink();

    val zebra = new Zebra;
    zebra.eat();
    zebra.drink();

  }
}