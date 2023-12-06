file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/scenarios/ForecastScenario.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file:///C:/GitHub/mts_lt-1/weather/src/test/scala/ru/mts/perf/weather/scenarios/ForecastScenario.scala
text:
```scala
package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.Forecast
import scala.util.Random


object ForecastScenario {

  val scn: ScenarioBuilder = scenario("Forecast Scenario")
  .exec(session => session.set("forecastId", Random.nextInt(350) + 1))
  .exec(session => session.set("forecastcityId", Random.nextInt(169) + 1))
  .randomSwitch(
  10.0 -> exec(Forecast.getForecast),
  70.0 -> exec(Forecast.getForecastById),
  10.0 -> exec(Forecast.postForecastById),
  10.0 -> exec(Forecast.updateForecastById)
  )
}
```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef