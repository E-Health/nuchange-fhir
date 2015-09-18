/**
 * Created by beapen on 15-09-13.
 */

import org.scalatest.FlatSpec

class TestAllergy extends FlatSpec {

  behavior of "An empty Set"

  it should "have size 0" in {
    assert(Set.empty.size === 1)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }
}