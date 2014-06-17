package com.deepak.sandbox

import java.util.Date
import java.text.DateFormat
import java.lang.Long
import java.util.Locale

object DateExample {

  def main(args: Array[String]) {
    val now = new Date();
    val frDateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
    println(frDateFormat format now);
  }
}