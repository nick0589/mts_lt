package ru.mts.perf.mts.cases


import io.gatling.http.Predef._
import io.gatling.core.Predef._

object Cities {

  val getCities = http("GET /Cities")
    .get("/Cities")
    .check(status is 200)
    .check(jsonPath("$[*].id").findRandom.saveAs("cityId"))


  val updateCityById = http("PUT /Cities/{id}")
    .put("/Cities/#{cityId}")
    .body(StringBody("""
      |{
      | "id" : #{cityId},
      | "name" : "#{randomAlphanumeric(8)}"
      |}
    """.stripMargin))
    .asJson
    .check(status is 200)

      }