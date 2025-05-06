package empty

import io.ft.{Script, ScriptObj, builder}

class OpenSite extends Script {
  def name = OpenSite.name

  def step0() = {
    //log.info(s"--- $name")
    empty
  }

  val load = builder.LoadSteps(step0)
}

object OpenSite extends ScriptObj {
  val name = "open site"

  def apply() = new OpenSite
}