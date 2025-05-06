package scenarios.test

import io.ft.{FunctionalScenario}
import io.ft.api.annotation.ShowScenario
import scripts.test.GetEDocUFEBSSynapse

@ShowScenario
class GetEDoc extends FunctionalScenario {
  val script = GetEDocUFEBSSynapse
  override val requestsNum = -1 // -1 бесконечный цикл
  val name = "GetEDoc функциональный сценарий"
}