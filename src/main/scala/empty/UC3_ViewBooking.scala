package empty

import io.ft.builder.Load
import io.ft.{Script, ScriptObj}

object UC3_ViewBooking extends ScriptObj {
  val name = "UC3_ViewBooking"

  def apply() = new UC3_ViewBooking
}

class UC3_ViewBooking extends Script {
  def name = UC3_ViewBooking.name

  val load = Load(OpenSite, Login, Itinerary, Logout)
}
