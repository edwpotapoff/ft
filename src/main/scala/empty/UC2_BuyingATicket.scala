package empty

import io.ft.builder.Load
import io.ft.{Script, ScriptObj}

object UC2_BuyingATicket extends ScriptObj {
  val name = "UC2_BuyingATicket"

  def apply() = new UC2_BuyingATicket
}

class UC2_BuyingATicket extends Script {
  def name = UC2_BuyingATicket.name

  val load = Load(OpenSite, Login, Flights, FindFlights, SelectionFlights, Payment, Logout)
}
