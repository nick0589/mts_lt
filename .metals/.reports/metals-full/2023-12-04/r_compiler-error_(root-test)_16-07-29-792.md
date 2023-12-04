file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/Forecast.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/Forecast.scala
text:
```scala
package ru.mts.perf.mts.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._


object Forecast {
  val getForecast = http("GET /Forecast")
    .get("/Forecast")
    .check(status is 200)
    .check(jsonPath("$[*].id").findRandom.saveAs("forecastId"))
  //  .check(jsonPath("$[*].cityId").findRandom.saveAs("forecastcityId"))
  //  пытался вытащить cityId из выбранного id в таблице, но как то не получилось.

  val updateForecastById = http("PUT /Forecast/{id}")
    .put("/Forecast/#{forecastId}")
    .body(StringBody("""
{
 "id" : #{forecastId},
 "cityId": 777,
 "dateTime": 202311301130,
 "temperature": 99,
 "summary": "okey"
}
    """.stripMargin))
    .asJson
    .check(status is 200)


  //   val postForecastById = http("POST /Forecast/{cityId}")
  //  .put("/Forecast/#{forecastcityId}")
  //  .body(StringBody("""
  //    |{
  //    | "id" : #{forecastId},
  //    | "cityId": forecastcityId,
  //    | "dateTime": 202311301130,
  //    | "temperature": 99,
  //    | "summary": "okey"
  //    |}
  //  """.stripMargin))
  //  .asJson
    //.check(status is 200)

      }
```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef