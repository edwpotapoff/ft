package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.{Load, LoadInit, StopUserIf}

import scala.language.postfixOps


class StopUserIfTest extends Script {
  val users = Array("rom", "anna")
  var requests: Array[CO] = _

  def fillRequests() = {
    requests = users.map {
      user =>
        Http(s"lh:/users/$user")
          .make()
    }
    tc("condition") = false
    empty
  }

  override val init = LoadInit(fillRequests)

  def check(name: String) = () => {
    subStr(name)
    asserts
  }

  val rom = Load(() => requests(0), check(users(0)))
  val anna = Load(() => requests(1), check(users(1)))

  val load =
    Load(
      rom
      , StopUserIf("condition") // = () => stopUser()
      , anna
    )

  val name = "The StopUserIfTest script"
}

object StopUserIfTest extends ScriptObj {
  def apply() = new StopUserIfTest
}