package scripts.test

import io.ft.{Script, ScriptObj, builder}

object ScriptRom extends ScriptObj {
  def apply() = new ScriptRom
}

class ScriptRom extends Script {
  val name = "rom"

  val req =
    """{
       type: "send"
       send.endpoint.url: "http://localhost:8080/users/rom"
       send.endpoint.headers:{
         type: GET
         status: 200
         holder: "rcvdBody"
         keep-alive: true
       }
     }""".http //         timeout: 56 ms


  def step1() = req

  val load = builder.LoadSteps(step1)
}
