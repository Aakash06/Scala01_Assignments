package edu.scala01

import org.scalatest.FunSuite

class SquareQueueTest extends FunSuite {

  test("testing enqueue method"){
    val queue = new SquareQueue(List(1,2,3))
    assert(queue.enqueue(5) == List(1,2,3,25))
  }

  test("testing dequeue method"){
    val queue = new SquareQueue(List(1,2,3))
    assert(queue.dequeue() == List(2,3))
  }

}
