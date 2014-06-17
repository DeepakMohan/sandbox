package com.deepak.sandbox

object ComplexNumbers {

  def main(args: Array[String]) {
	  val complex = new Complex(1.5, 2.5);
	  println("Imaginery part: " + complex.im);
	  println("Complex number: " + complex);
	  
	  val complex2 = new Complex(1.5, -2.5);
	  println("Imaginery part: " + complex2.im);
	  println("Complex number: " + complex2);
  }
}