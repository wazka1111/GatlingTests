package scenario

import config._
import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import request.studentRequest

object StudentScenario {

  def studentGetScenario(name: String, chains: ChainBuilder*): ScenarioBuilder = {
    if(Constans.repeatTimes >0) {
      scenario(name).repeat(Constans.repeatTimes){
        pace(Constans.pace).exec(chains).pause(Constans.pause)
      }
    }else {
      scenario(name).forever(){
        pace(Constans.pace).exec(chains).pause(Constans.pause)
      }
    }
  }

  val scnStudentGet = studentGetScenario(Constans.getStudent, studentRequest.student_basic_get)
}
