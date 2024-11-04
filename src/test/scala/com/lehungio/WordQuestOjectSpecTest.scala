package com.lehungio

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.lehungio.objects.WordQuest

class WordQuestObjectSpecTest extends AnyFlatSpec with Matchers {

  "WordQuest" should "transform a single letter" in {
    WordQuest.transform(Map(1 -> Seq("A"))) should be(Map("a" -> 1))
  }

  it should "transform single score with multiple letters" in {
    WordQuest.transform(Map(1 -> Seq("A", "E", "I", "O", "U"))) should be(Map("a" -> 1,
    "e" -> 1, "i" -> 1, "o" -> 1, "u" -> 1))
  }

  it should "transform multiple scores with multiple letters" in {
    WordQuest.transform(Map(1 -> Seq("A", "E"), 2 -> Seq("D", "G"))) should be(Map("a" -> 1,
    "d" -> 2, "e" -> 1, "g" -> 2))
  }

  it should "transform multiple scores with differing numbers of letters" in {
    WordQuest.transform(Map(1 -> Seq("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"),
    2 -> Seq("D", "G"), 3 -> Seq("B", "C", "M", "P"), 4 -> Seq("F", "H", "V", "W", "Y"),
    5 -> Seq("K"), 8 -> Seq("J", "X"), 10 -> Seq("Q", "Z"))) should be(Map("a" -> 1,
    "b" -> 3, "c" -> 3, "d" -> 2, "e" -> 1, "f" -> 4, "g" -> 2, "h" -> 4,
    "i" -> 1, "j" -> 8, "k" -> 5, "l" -> 1, "m" -> 3, "n" -> 1, "o" -> 1, 
    "p" -> 3, "q" -> 10, "r" -> 1, "s" -> 1, "t" -> 1, "u" -> 1, "v" -> 4,
    "w" -> 4, "x" -> 8, "y" -> 4, "z" -> 10))
  }

  it should "handle an empty map" in {
    WordQuest.transform(Map()) should be(Map())
  }

  it should "handle letters with the same score" in {
    WordQuest.transform(Map(1 -> Seq("A", "B", "C", "D"))) should be(Map("a" -> 1,
      "b" -> 1, "c" -> 1, "d" -> 1))
  }

  it should "handle mixed case letters" in {
    WordQuest.transform(Map(1 -> Seq("A", "b", "C", "d"))) should be(Map("a" -> 1,
    "b" -> 1, "c" -> 1, "d" -> 1))
  }

  it should "handle non-alphabetic characters" in {
    WordQuest.transform(Map(1 -> Seq("A", "1", "!", "B"))) should be(Map("a" -> 1,
    "1" -> 1, "!" -> 1, "b" -> 1))
  }
}