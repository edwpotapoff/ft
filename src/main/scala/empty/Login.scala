package empty

import io.ft.{Script, ScriptObj, builder}

class Login extends Script {
  def name = Login.name

  def step0() = {
    //log.info(s"--- $name")
    empty
  }

  val load = builder.LoadSteps(step0)
}

object Login extends ScriptObj {
  val name = "login"

  def apply() = new Login
}