file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/Cities.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/Cities.scala
text:
```scala
package ru.mts.perf.mts.cases

import scala.util.Random
import io.gatling.http.Predef._
import io.gatling.core.Predef._



object Cities {

  val cityId: Int = Random.nextInt (169) + 1

  val getCities = http("GET /Cities")
    .get("/Cities")
    .check(status is 200)
   // .check(jsonPath("$[*].id").findRandom.saveAs("cityId"))


  val getCitiesId = http("GET /Cities/{id}")
    .get("/Cities/#{cityId.toString}")
    .check(status is 200)
   

  val updateCityById = http("PUT /Cities/{id}")
    .put("/Cities/#{cityId.toString}")
    .body(StringBody("""
{
 "id" : #{cityId.toString},
 "name" : "#{randomAlphanumeric(8)}"
}
    """.stripMargin))
    .asJson
    .check(status is 200)
 
      }
    
```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef