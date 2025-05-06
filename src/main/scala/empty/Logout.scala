package empty

import io.ft.{Script, ScriptObj, builder}


class Logout extends Script {
  val name = Logout.name

  def step0() = {
    //log.info(s"--- $name")
    empty
  }

  val load = builder.LoadSteps(step0)
}

object Logout extends ScriptObj {
  val name = "logout"

  def apply() = new Logout
}