package com.test.scala

object BeanTest {
  
   def beanT(data: String):String  ="ds";
   
   def baanTT(data: String):String ="";
   
   def beaan:String ="";
   
   def three:Int=1+2;
   
   def jkjkak(sdf:Int):Int=3+1;
   
   def three1=3+4;
   
  
   def addOne = (x :Int) => x + 1;
   
   def testing(x:String):String ="dfas";
   
   def testing1= (x:String)=>x+"";
   
   def testing3(x:String, y:String):String = {
     x+y;
   }
   

   def addone1= (x:Int) => x+1;
   
   
   {
     i:Int => 
       i*2;
   }
   
    val concateString =testing3("3" ,_:String);
    
    val dzatat= concateString("sdfs");
    
    def multiply(x:Int,y:Int):Int={
      x+y;
    }
    
    val multiCurried=multiply(2,_:Int);
    
    
    val valure=multiCurried(4);
    
    
    // function with repeatative param with same type
    def capitalizeAll(args: String*) = {
    
      args.map { arg =>arg.capitalize }
    }

    
    
    
    
    
   
}