package scenarios.test

import io.ft.DebugScenario
import io.ft.api.annotation.ShowScenario
import scripts.test.ScriptRom
import scala.language.postfixOps
import scala.concurrent.duration.DurationInt

@ShowScenario
class RomScenario extends DebugScenario {
  val script = ScriptRom
  val testersNum = 1
  val requestsNum = 1
  val name = "RomScenario"
  val openThrottle = 0 seconds
  val runImmediately = false // after opening
  val statPeriod = 10 seconds
}