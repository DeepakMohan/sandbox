package com.deepak.sandbox

import java.util.Date

object FunctionUsage {

  def oncePerSecond(callbackMethod : () => Unit) {
    while(true) {
      callbackMethod();
      //Thread.sleep(1000);
      Thread sleep 1000;
    }
  }

  def oncePerSecond() {
    println(new Date());
  }
  
  def main(args: Array[String]) {
	 oncePerSecond(
		() => println(new Date())
	 );
  }
  
  //TODO:
  def assignFuncToVar() {
	  
  }
}