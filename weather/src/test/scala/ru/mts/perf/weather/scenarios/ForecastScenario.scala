package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.Forecast


object ForecastScenario {

  val scn: ScenarioBuilder = scenario("Forecast Scenario")
  
    .exec(Forecast.getForecast)
    .exec(Forecast.updateForecastById)
    .exec(Forecast.postForecastById)
}
