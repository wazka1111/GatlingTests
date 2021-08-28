package simulation

import config.Constans
import io.gatling.core.Predef._
import _root_.scenario.StudentScenario

import scala.concurrent.duration._

class StudentSimulation extends Simulation {
  setUp(StudentScenario.scnStudentGet
    .inject(constantConcurrentUsers(Constans.users) during( 10 seconds), rampConcurrentUsers(5) to (7) during(10 seconds)))
    .protocols(Constans.httpProtocol).maxDuration(10 seconds)
    .assertions(global.successfulRequests.percent.is(100))


}
