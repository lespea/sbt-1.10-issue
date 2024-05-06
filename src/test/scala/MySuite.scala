import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Tests extends AnyWordSpec with Matchers {
  "a simple test" should {
    "work" in {
      mylib.Lib.MyString shouldEqual "test"
    }
  }
}
