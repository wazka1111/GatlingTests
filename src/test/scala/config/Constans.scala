package config

import com.typesafe.config._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Constans {

  val loadConfig = ConfigFactory.load("env_local.properties")
  val baseURLAWS = loadConfig.getString("baseURLAWS")
  val getStudent = loadConfig.getString("getStudent")

  val xmlResultPattern = loadConfig.getString("xmlResultPattern")
  val users = loadConfig.getInt("users")
  val statusOK = loadConfig.getInt("statusOK")


  var repeatTimes = loadConfig.getInt("repeatTimes")
  var pace = loadConfig.getInt("pace")
  var pause = loadConfig.getInt("pause")

  //Simulation
  val httpProtocol = http.baseUrl(baseURLAWS)

}
