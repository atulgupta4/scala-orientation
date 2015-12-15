package com.test.scala

object FunctionProgrammingTest {
  
  def oncePerSecond(callback: () => Unit) {
    var i=10; 
    while(i ==10){
      callback();
      //Thread sleep 1000;
      i= i + 1;
    }
  }
  def timeFlies(): Unit = {
    println(" i am being called");
  }
  
  def main(args: Array[String]): Unit = {
    //oncePerSecond(timeFlies);
    oncePerSecond(() => println("doing it annonymously"));
  }
}