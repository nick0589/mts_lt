package ru.mts.perf.mts.cases

import scala.util.Random
import io.gatling.http.Predef._
import io.gatling.core.Predef._



object Cities {

  //val cityId: Int = Random.nextInt (169) + 1

  val getCities = http("GET /Cities")
    .get("/Cities")
    .check(status is 200)
   // .check(jsonPath("$[*].id").findRandom.saveAs("cityId"))


  val getCitiesId = http("GET /Cities/{id}")
    .get("/Cities/#{cityId}")
    .check(status is 200)
   

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