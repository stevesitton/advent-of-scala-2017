package com.sitton.advent

import org.scalatest.FunSuite

class Day1Test extends FunSuite {

  test("day1 solution1 - 1122") {
    assert(Day1.solution1("1122".toList) == 3)
  }

  test("day1 solution1 - 1111") {
    assert(Day1.solution1("1111".toList) == 4)
  }

  test("day1 solution1 - 1234") {
    assert(Day1.solution1("1234".toList) == 0)
  }

  test("day1 solution1 - 91212129") {
    assert(Day1.solution1("91212129".toList) == 9)
  }

  test("day1 solution2 - 1212") {
    assert(Day1.solution2("1212".toList) == 6)
  }

  test("day1 solution2 - 1221") {
    assert(Day1.solution2("1221".toList) == 0)
  }

  test("day1 solution2 - 123425") {
    assert(Day1.solution2("123425".toList) == 4)
  }

  test("day1 solution2 - 123123") {
    assert(Day1.solution2("123123".toList) == 12)
  }

  test("day1 solution2 - 12131415") {
    assert(Day1.solution2("12131415".toList) == 4)
  }
}
