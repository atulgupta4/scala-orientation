package com.test.scala

import java.util.{ Date, Locale }
import java.text.DateFormat
import java.text.DateFormat._

object DataTest {
  val multiLineStr="""sdfsf
    sdfsf
    sdfsf""";
  
  val anotherWay ="""
    zcxvzxvzxv
    |zxcvzxvxz""".stripMargin
    
  def value=3
  def greet=println("asdf")
  
  val stringArray=("dfdsf","sdfds","dsfsdf")
  
 def addone1= (x:Int) => x+1;
 /*
  * zxclkzxv
  */

  def maximum(x:Int, y:Int):Int ={
    if(x> y) x
    else y
        
  }
  var sum =0;
  def another(c:Int, y:Int){sum += c+y;}
  
  
  def x = "Dsd"+1
  def listVar= List("gsdsdg","sdfsfgs");
  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree)
  
  listVar.count(s => s.length == 4);
  listVar.drop(4);
  listVar.init
  
  //override def foreach[U](f: String => U): Unit
  
  // Anonymous funtion 
   def z = (x:Int,y:Int) => x+y
   
   var data =Array(1,2,3)

   val dsfks= Array("sdgfsdg","sdfsd","sdgfds");

   
   
  def main(args: Array[String]): Unit = {
     
    
    val now = new Date;
    val df = getDateInstance(LONG, Locale.FRANCE);
    println(df format now);
    args.foreach { arg => println(arg) }
    args.foreach(println)

  }
}