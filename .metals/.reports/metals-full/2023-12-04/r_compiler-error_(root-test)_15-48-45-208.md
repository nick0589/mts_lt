file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/WeatherForecast.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/cases/WeatherForecast.scala
text:
```scala
package ru.mts.perf.mts.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object WeatherForecast {

  val WeatherFc = http("GET /WeatherForecast")
    .get("/WeatherForecast")
    .check(status is 200)
  

      }


```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef