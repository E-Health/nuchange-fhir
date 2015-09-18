/**
 * Created by beapen on 15-09-13.
 */

import org.scalatest.FunSuite


class TestAllergy extends FunSuite {

  test("Allergy should return records") {
     assert(Allergy.getAllergyUHN > 1)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }
}