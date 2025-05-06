package scripts.test

import io.ft._
import io.ft.builder.Http
import io.ft.builder.{Foreach, Load, LoadInit}

import scala.language.postfixOps


class ForeachTest extends Script {
  val users = Array("rom", "anna")

  override val init = LoadInit(() => {
    tc("users") = users
    empty
  })


  var request = () => Http("lh:/users/${user}").make()


  val check = () => {
    subStr("user".tc.string)
    asserts
  }

  val check2 = () => {
    subStr("user".tc.string)
    log.info(s"user ${tc("user")}, age ${tc("age")}")
    asserts
  }

  val load = Load(
    Foreach(users, "user")(request, check)
    , Foreach(
      Map(
        "user" -> Seq("rom", "anna")
        , "age" -> Seq(31, 32))
    )(request, check2)
    , Foreach("users", "user")(request, check)
  )


  val name = "The ForeachTest script "
}

object ForeachTest extends ScriptObj {

  def apply() = new ForeachTest
}