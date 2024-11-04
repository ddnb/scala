package com.lehungio.objects

object HammingDistance {
  def calculate(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = 
    if (dnaStrandOne.length == dnaStrandTwo.length)
      Some(dnaStrandOne zip dnaStrandTwo count { case (a, b) => a != b })
    else
      None
}