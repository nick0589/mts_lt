package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.Cities

object CitiesScenario {

  val scn: ScenarioBuilder = scenario("Cities Scenario")
   // .randomSwitch(
   // 90.0 -> exec(Cities.getCities),
   // 10.0 -> exec(Cities.updateCityById)
   // )
   .exec(Cities.getCities)
   .exec(Cities.updateCityById)

}

