package com.lehungio.classes

import scala.language.dynamics
import scala.math.BigDecimal.RoundingMode

class SpaceAge extends Dynamic {
  val Periods = Map(
    "Earth" -> 1.0,
    "Mercury" -> 0.2408467,
    "Venus" -> 0.61519726,
    "Mars" -> 1.8808158,
    "Jupiter" -> 11.862615,
    "Saturn" -> 29.447498,
    "Uranus" -> 84.016846,
    "Neptune" -> 164.79132
  )
  
  val SecondsPerEarthYear = BigDecimal(31557600)

  def applyDynamic(methodName: String)(age: Double): Double = {
    // Extract planet name from method name (skip the "on")
    val planet = methodName.substring(2)
    // Get the period factor
    val period = Periods.getOrElse(planet, throw new IllegalArgumentException(s"Unknown planet: $planet"))
    
    // Calculate the result using BigDecimal for better precision
    val exactAge = BigDecimal(age) / (BigDecimal(period) * SecondsPerEarthYear)
    
    // Round to two decimal places
    exactAge.setScale(2, RoundingMode.HALF_UP).toDouble
  }
}
