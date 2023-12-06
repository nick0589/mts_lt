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


object ForecastScenario {

  val scn: ScenarioBuilder = scenario("Forecast Scenario")
  .randomSwitch(
  10.0 -> exec(Forecast.getForecast),
  40.0 -> exec(Forecast.getForecastById),
  40.0 -> exec(Forecast.postForecastById),
  10.0 -> exec(Forecast.updateForecastById)
  )
}
```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef