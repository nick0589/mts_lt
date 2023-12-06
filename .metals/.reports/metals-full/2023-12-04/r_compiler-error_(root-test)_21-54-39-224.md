file://<WORKSPACE>/weather/src/test/scala/ru/mts/perf/weather/scenarios/CitiesScenario.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/weather/src/test/scala/ru/mts/perf/weather/scenarios/CitiesScenario.scala
text:
```scala
package ru.mts.perf.mts.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.mts.perf.mts.cases.Cities

object CitiesScenario {

  val scn: ScenarioBuilder = scenario("Cities Scenario")
    .randomSwitch(
    20.0 -> exec(Cities.getCities),
    75.0 -> exec(Cities.getCitiesId),
    5.0 -> exec(Cities.updateCityById)
    )
   //.exec(Cities.getCities)
   //.exec(Cities.updateCityById)

}


```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef