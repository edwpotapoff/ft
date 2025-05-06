package scripts.test

import io.ft.{Script, ScriptObj, builder}

object TesterNum extends ScriptObj {
  def apply() = new TesterNum
}

class TesterNum extends Script {
  val name = "testerNum"

  def check0() = {
    log.info(s"testerNum $testerNum")
    empty
  }

  val load = builder.LoadSteps(check0)
}