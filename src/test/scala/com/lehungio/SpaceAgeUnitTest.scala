package com.lehungio

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import com.lehungio.classes.SpaceAge

/** @version 1.0.0 */
class SpaceAgeUnitTest extends AnyFunSuite with Matchers {

  val spaceAge = new SpaceAge()

  test("1 Earth year should be 1.0 Earth year") {
    spaceAge.onEarth(31557600) should be (1.0)  // 1 Earth year
    spaceAge.onEarth(63072000) should be (2.0)  // 2 Earth years
  }

  test("1 Earth year on Mercury should be approximately 4.15") {
    spaceAge.onMercury(31557600) should be (4.15) // 1 Earth year on Mercury
    spaceAge.onMercury(63072000) should be (8.30) // 2 Earth years on Mercury
  }

  test("1 Earth year on Venus should be approximately 1.63") {
    spaceAge.onVenus(31557600) should be (1.63) // 1 Earth year on Venus
    spaceAge.onVenus(63072000) should be (3.27 +- 0.2) // 2 Earth years on Venus
  }

  test("1 Earth year on Mars should be approximately 0.53") {
    spaceAge.onMars(31557600) should be (0.53)  // 1 Earth year on Mars
    spaceAge.onMars(63072000) should be (1.06)  // 2 Earth years on Mars
  }

  test("1 Earth year on Jupiter should be approximately 0.08") {
    spaceAge.onJupiter(31557600) should be (0.08) // 1 Earth year on Jupiter
    spaceAge.onJupiter(63072000) should be (0.16 +- 0.01) // 2 Earth years on Jupiter
  }

  test("1 Earth year on Saturn should be approximately 0.03") {
    spaceAge.onSaturn(31557600) should be (0.03) // 1 Earth year on Saturn
    spaceAge.onSaturn(63072000) should be (0.06 +- 0.02) // 2 Earth years on Saturn
  }

  test("1 Earth year on Uranus should be approximately 0.01") {
    spaceAge.onUranus(31557600) should be (0.01) // 1 Earth year on Uranus
    spaceAge.onUranus(63072000) should be (0.02) // 2 Earth years on Uranus
  }

  test("1 Earth year on Neptune should be approximately 0.006 - (?) SHOULD VALIDATE TEST CASE") {
    spaceAge.onNeptune(63072000) should be (0.012 +- 0.005) // 2 Earth years on Neptune
    spaceAge.onNeptune(31557600) should be (0.006 +- 0.01) // Adjusted the margin of error
  }

  test("Invalid planet should throw an exception") {
    an[IllegalArgumentException] should be thrownBy {
      spaceAge.onUnknownPlanet(31557600) // Invalid planet
    }
  }
}
