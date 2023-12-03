package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.WeatherForecast


object WeatherForecastScenario {

  val scn: ScenarioBuilder = scenario("WeatherForecast Scenario")
  
    .exec(WeatherForecast.WeatherFc)

}
