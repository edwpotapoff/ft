package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.{Load, LoadInit, Repeat}

import scala.language.postfixOps


class RepeatTest extends Script {
  val users = Array("rom", "anna")
  var requests: Array[CO] = _

  def fillRequests() = {
    requests = users.map {
      user =>
        Http(s"lh:/users/$user")
          .make()
    }
    tc("n") = 5
    empty
  }

  override val init = LoadInit(fillRequests)

  def check(name: String) = () => {
    subStr(name)
    asserts
  }

  val rom = Load(() => requests(0), check(users(0)))
  val anna = Load(() => requests(1), check(users(1)))

  val load = Load(
    Repeat("n", "count")(rom)
    , anna
  )

  val name = "The RepeatTest script "
}

object RepeatTest extends ScriptObj {

  def apply() = new RepeatTest
}