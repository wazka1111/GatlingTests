package config

import com.typesafe.config._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Constans {

  val loadConfig = ConfigFactory.load("env_local.properties")
  val baseURLAWS = loadConfig.getString("baseURLAWS")
  val getStudent = loadConfig.getString("getStudent")
  val Viaconex_scenario = loadConfig.getString("Viaconex_scenario")
  val FDMS_scenario = loadConfig.getString("FDMS_scenario")
  val xmlResultPattern = loadConfig.getString("xmlResultPattern")
  val users = loadConfig.getInt("users")
  val statusOK = loadConfig.getInt("statusOK")
  val Viaconex_RawFile = loadConfig.getString("Viaconex_RawFile")
  val FDMS_RawFile = loadConfig.getString("FDMS_RawFile")
  var repeatTimes = loadConfig.getInt("repeatTimes")
  var pace = loadConfig.getInt("pace")
  var pause = loadConfig.getInt("pause")

  //Simulation
  val httpProtocol = http.baseUrl(baseURLAWS)

}
