package scenarios.test


import io.ft.Max
import io.ft.api.annotation.ShowScenario
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

@ShowScenario
class MaxRomAnna extends Max {
  val scenario = RomAnnaScenario
  val stepsNumber = 1
  val stepDuration = 30 seconds
  val startK = 1
  val stepK = 1
}
