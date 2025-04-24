package scripts.test

import io.ft.builder.*
import io.ft.{Script, ScriptObj}

import scala.language.postfixOps


class Http2Test extends Script {

  val check = () =>
    asserts

  val load = Load(
    Http("https://127.0.0.1:8443/"),
    check
  )

  val name = "The HttpTest script "
}

object Http2Test extends ScriptObj {
  def apply() = new Http2Test
}
