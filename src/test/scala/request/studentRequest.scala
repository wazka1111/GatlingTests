package request

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import config._

object studentRequest {
  val student_basic_get = exec(http("auth_Student")
    .get(Constans.getStudent)
    .check(status.is(Constans.statusOK)))


}
