package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.Load

import scala.language.postfixOps


class FormParamTest extends Script {

  val page = Http(s"lhp:/new", POST, body = "flightID=210297424-100296-JB&2=on")
    .make()

  val load =
    Load(
      () => page
    )

  val name = "The FormParamTest script"
}

object FormParamTest extends ScriptObj {
  def apply() = new FormParamTest
}