package com.test.scala

class ComplexClass(real:Double, imaginary:Double) {
  
 
  def re() =real;
  def img() = imaginary;
  
  def newMethod(): Unit ={
    
  }
  
  def functionAsArgument(callback :()  => Unit){
    val x= 5;
    val y:Double=8.0;
    
    
  }
  
  
  
  def newFunction():String={
    
    ""
    
  }
  def main(args: Array[String]): Unit = {
    
    val x= new ComplexClass(2.0,4.0)
    x.functionAsArgument {newMethod };
    
    
  }
  
  
}