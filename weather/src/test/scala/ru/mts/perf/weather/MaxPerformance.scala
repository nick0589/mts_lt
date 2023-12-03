package ru.mts.perf.mts

import io.gatling.core.Predef._
import ru.tinkoff.gatling.config.SimulationConfig._
import ru.tinkoff.gatling.influxdb.Annotations
import scala.concurrent.duration._
import scenarios.CitiesScenario
import scenarios.ForecastScenario
import scenarios.WeatherForecastScenario
import ru.mts.perf.mts.cases.Forecast
import ru.mts.perf.mts.cases.Cities

class MaxPerformance extends Simulation with Annotations {

  setUp(
    CitiesScenario.scn.inject(
      rampUsersPerSec(0) to 5 during(1 minute),
      constantUsersPerSec(250) during(3 minutes)
    ),
  ).protocols(
    httpProtocol,
    // общая длительность теста
  ).maxDuration(10 minutes)

}
