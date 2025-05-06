package scripts.test

import io.ft.builder.*
import io.ft.{Script, ScriptObj}
import scala.language.postfixOps

class XmlTest extends Script {
  val load = Load(
    Http("/", "lh")
    , Xpath("/html/body", "==", "Hello world!")
  )

  val name = "The XmlTest script "
}

object XmlTest extends ScriptObj {
  def apply() = new XmlTest
}
