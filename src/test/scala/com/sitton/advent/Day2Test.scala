package com.sitton.advent

import org.scalatest.FunSuite

class Day2Test extends FunSuite {

  test("day2 solution1 test1") {
    assert(Day2.solution1(List(
      List(5, 1, 9, 5),
      List(7, 5, 3),
      List(2, 4, 6, 8))) == 18)
  }

  test("day2 solution1 test2") {
    assert(Day2.solution1(List(
      List(10, 1),
      List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
      List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))) == 28)
  }

  test("day2 solution2 test1") {
    assert(Day2.solution2(List(
      List(5, 9, 2, 8),
      List(9, 4, 7, 3),
      List(3, 8, 6, 5))) == 9)
  }
}
