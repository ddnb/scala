package com.lehungio

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import com.lehungio.objects.HammingDistance


/** @version 3.1.0 */
// sbt "testOnly * -- -z distance"
// sbt "testOnly *HamingDistanceObjectTest*"
class HammingDistanceObjectTest extends AnyFunSuite with Matchers {
  
  test("empty strands") {
    HammingDistance.calculate("", "") should be (Some(0))
  }

  test("identical strands") {
    HammingDistance.calculate("A", "A") should be (Some(0))
  }

  test("long identical strands") {
    HammingDistance.calculate("GGACTGA", "GGACTGA") should be (Some(0))
  }

  test("complete distance in single nucleotide strands") {
    HammingDistance.calculate("A", "G") should be (Some(1))
  }

  test("complete distance in small strands") {
    HammingDistance.calculate("AG", "CT") should be (Some(2))
  }

  test("small distance in small strands") {
    HammingDistance.calculate("AT", "CT") should be (Some(1))
  }

  test("small distance") {
    HammingDistance.calculate("GGACG", "GGTCG") should be (Some(1))
  }

  test("small distance in long strands") {
    HammingDistance.calculate("ACCAGGG", "ACTATGG") should be (Some(2))
  }

  test("non-unique character in first strand") {
    HammingDistance.calculate("AAG", "AAA") should be (Some(1))
  }

  test("non-unique character in second strand") {
    HammingDistance.calculate("AAA", "AAG") should be (Some(1))
  }

  test("same nucleotides in different positions") {
    HammingDistance.calculate("TAG", "GAT") should be (Some(2))
  }

  test("large distance") {
    HammingDistance.calculate("GATACA", "GCATAA") should be (Some(4))
  }

  test("large distance in off-by-one strand") {
    HammingDistance.calculate("GGACGGATTCTG", "AGGACGGATTCT") should be (Some(9))
  }

  test("disallow first strand longer") {
    HammingDistance.calculate("AATG", "AAA") should be (None)
  }

  test("disallow second strand longer") {
    HammingDistance.calculate("ATA", "AGTG") should be (None)
  }

  test("check SCALA and it palindrome") {
    HammingDistance.calculate("SCALA", "ALACS") should be (Some(4))
  }
}
