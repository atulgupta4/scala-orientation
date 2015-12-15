package com.test.scala

class FunctioonalObjectTest(x: Double, y:Int) {
  
  val numer=x;
  val demon=y;
  val str1="sdfsdf";
  
  require(y!=0);
  println(x+y);
 
  override def toString = x+"/"+y; 
  val str= "dfsdf";
  
  def add(temp:FunctioonalObjectTest):Double={
    
    temp.numer;
    
  }
  def testing(name_ :String){
    Thread.`yield`();
    println(name_);
    
  }
  
  testing("23532");
}

