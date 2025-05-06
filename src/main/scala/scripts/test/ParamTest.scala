package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.{CloseStep, Load}

import scala.language.postfixOps


class ParamTest extends Script {

  val page = Http(s"lh:/page?p=1&end=3")
    .make()

  val load =
    Load(
      () => page
    )

  val name = "The ParamTest script "
}

object ParamTest extends ScriptObj {
  def apply() = new ParamTest
}