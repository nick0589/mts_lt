file://<WORKSPACE>/weather/src/test/scala/ru/mts/perf/weather/Debug.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/weather/src/test/scala/ru/mts/perf/weather/Debug.scala
text:
```scala
package ru.mts.perf.mts

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import ru.tinkoff.gatling.config.SimulationConfig._
import scenarios.CitiesScenario
import scenarios.ForecastScenario

class Debug extends Simulation {

  // proxy is required on localhost:8888

  //setUp(CitiesScenario.scn.inject(atOnceUsers(20))).protocols(httpProtocol).maxDuration(testDuration)
  //setUp(ForecastScenario.scn.inject(atOnceUsers(1))).protocols(httpProtocol).maxDuration(testDuration)

}

```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Predef