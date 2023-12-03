package ru.mts.perf.mts

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import ru.tinkoff.gatling.config.SimulationConfig._
import scenarios.CitiesScenario
import scenarios.ForecastScenario

class Debug extends Simulation {

  // proxy is required on localhost:8888

  setUp(CitiesScenario.scn.inject(atOnceUsers(20))).protocols(httpProtocol).maxDuration(testDuration)
  //setUp(ForecastScenario.scn.inject(atOnceUsers(1))).protocols(httpProtocol).maxDuration(testDuration)

}
