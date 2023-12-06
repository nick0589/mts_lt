package ru.mts.perf.mts.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._


object Forecast {
  val getForecast = http("GET /Forecast")
    .get("/Forecast")
    .check(status is 200)


  val getForecastById = http("GET /Forecast/{id}")
    .get("/Forecast/#{forecastId}")
    .check(status is 200)
  

  val updateForecastById = http("PUT /Forecast/{id}")
    .put("/Forecast/#{forecastId}")
    .body(StringBody("""
      |{
      | "id" : #{forecastId},
      | "cityId": #{forecastcityId},
      | "dateTime": 202311301130,
      | "temperature": 99,
      | "summary": "test"
      |}
    """.stripMargin))
    .asJson
    .check(status is 200)


  val postForecastById = http("POST /Forecast/{cityId}")
    .post("/Forecast/#{forecastcityId}")
    .body(StringBody("""
      |{
      | "cityId": #{forecastcityId}
      | "dateTime": 202311301130,
      | "temperature": 99,
      | "summary": "test"
      |}
    """.stripMargin))
    .asJson
    .check(status is 200)

      }