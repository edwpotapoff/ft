package scenarios.test

import io.ft.Max
import io.ft.api.annotation.ShowScenario
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

@ShowScenario
class MaxEmptyProfile extends Max {
  val scenario = EmptyProfile
  val stepsNumber = 4
  val stepDuration = 30 seconds
  val startK = 2
  val stepK = 3
}
