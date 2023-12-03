package ru.mts.perf.mts.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object WeatherForecast {

  val WeatherFc = http("GET /WeatherForecast")
    .get("/WeatherForecast")
    .check(status is 200)
 

      }