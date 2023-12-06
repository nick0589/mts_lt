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

class Stability extends Simulation with Annotations {

  setUp(
    WeatherForecastScenario.scn.inject(
      // разгон
      rampUsersPerSec(0) to 2 during(10 seconds),
      
      // полка
      constantUsersPerSec(10) during(3 minutes)
    ),
  ).protocols(
    httpProtocol,
    // длительность теста = разгон + полка
  ).maxDuration(10 minutes)

}
