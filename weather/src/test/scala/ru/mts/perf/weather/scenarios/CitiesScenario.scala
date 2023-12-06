package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.Cities
import scala.util.Random

object CitiesScenario {

  val scn: ScenarioBuilder = scenario("Cities Scenario")
  
    .exec(session => session.set("cityId", Random.nextInt(169) + 1)) // Устанавливаем значение cityId в сессию
    .randomSwitch(
    20.0 -> exec(Cities.getCities),
    75.0 -> exec(Cities.getCitiesId),
    5.0 -> exec(Cities.updateCityById)
    )

  // .exec(Cities.getCities)
  // .exec(Cities.getCitiesId)
  // .exec(Cities.updateCityById)

}

