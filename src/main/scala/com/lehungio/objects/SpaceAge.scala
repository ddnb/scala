package com.lehungio.objects

object SpaceAge {
  private val earthToSeconds: Double = 31557600
  private val earth: Double = 1
  private val mercuryToEarth: Double = 0.2408467
  private val venusToEarth: Double = 0.61519726
  private val marsToEarth: Double = 1.8808158
  private val jupiterToEarth: Double = 11.862615
  private val saturnToEarth: Double = 29.447498
  private val uranusToEarth: Double = 84.016846
  private val neptuneToEarth: Double = 164.79132

  private def yearsFromSeconds(seconds: Double, planetToEarth: Double): Double = {
    seconds / earthToSeconds / planetToEarth
  }

  def onMercury(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, mercuryToEarth)
  }

  def onVenus(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, venusToEarth)
  }

  def onEarth(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, earth)
  }

  def onMars(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, marsToEarth)
  }

  def onJupiter(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, jupiterToEarth)
  }

  def onSaturn(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, saturnToEarth)
  }

  def onUranus(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, uranusToEarth)
  }

  def onNeptune(seconds: Double): Double = {
    require(seconds >= 0, "Seconds must be non-negative")
    yearsFromSeconds(seconds, neptuneToEarth)
  }
} 

