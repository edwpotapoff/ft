package scenarios.test

import io.ft.Rel
import io.ft.api.annotation.ShowScenario
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

@ShowScenario
class RelEmptyProfile extends Rel {
  val scenario = EmptyProfile
  val testDuration = 2 minutes
  val startK = 1
}
