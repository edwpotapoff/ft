package scripts.test

import io.ft._
import io.ft.builder.Load


object CountSubaction extends ScriptObj {
  def apply() = new CountSubaction
}

class CountSubaction extends Script {
  val name = "CountSubaction"

  val load = Load(
    () => {
      tc("x") = callIndex();
      empty
    }
    , 10 -> Count2Subaction
  )
}