package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.{CloseStep, Load}

import scala.language.postfixOps


class CloseTest extends Script {

  val rom = Http(s"lh:/users/rom")
    .make()

  val load =
    Load(
      () => rom
      , CloseStep // () => close()
    )

  val name = "The CloseTest script "
}

object CloseTest extends ScriptObj {
  def apply() = new CloseTest
}