# Metric-App

Metric-App is a spring boot application with the core function of converting units into the following metric systems below:

  - Kelvin to Celsius
  - Pounds to Kilograms
  - Miles to Kilometers


### Installation


Run and execute with unit tests.

```sh
$ mvn clean install
```
Expected Output
```sh
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< com.playsafesa:playsafe-metric-app >-----------------
[INFO] Building playsafe-metric-app 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ playsafe-metric-app ---
[INFO] Deleting /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ playsafe-metric-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ playsafe-metric-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ playsafe-metric-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ playsafe-metric-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ playsafe-metric-app ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests
12:53:10.106 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
12:53:10.160 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
12:53:10.234 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
12:53:10.268 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests], using SpringBootContextLoader
12:53:10.273 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]: class path resource [com/playsafesa/playsafemetricapp/PlaysafeMetricApplicationTests-context.xml] does not exist
12:53:10.274 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]: class path resource [com/playsafesa/playsafemetricapp/PlaysafeMetricApplicationTestsContext.groovy] does not exist
12:53:10.276 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
12:53:10.278 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]: PlaysafeMetricApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
12:53:10.383 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]
12:53:10.542 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target/classes/com/playsafesa/playsafemetricapp/PlaysafeMetricApplication.class]
12:53:10.543 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.playsafesa.playsafemetricapp.PlaysafeMetricApplication for test class com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests
12:53:10.783 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests]: using defaults.
12:53:10.785 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
12:53:10.820 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@a38c7fe, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@6fdbe764, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@51c668e3, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@2e6a8155, org.springframework.test.context.support.DirtiesContextTestExecutionListener@6221a451, org.springframework.test.context.transaction.TransactionalTestExecutionListener@52719fb6, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@3012646b, org.springframework.test.context.event.EventPublishingTestExecutionListener@4a883b15, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@25641d39, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@7b36aa0c, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@5824a83d, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@537f60bf, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@5677323c, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@18df8434]
12:53:10.828 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@6c1a5b54 testClass = PlaysafeMetricApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@1c7696c6 testClass = PlaysafeMetricApplicationTests, locations = '{}', classes = '{class com.playsafesa.playsafemetricapp.PlaysafeMetricApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@1139b2f3, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3f197a46, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@35ef1869, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@6eda5c9, org.springframework.boot.test.context.SpringBootTestArgs@1], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].
12:53:10.899 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-28 12:53:11.405  INFO 659510 --- [           main] c.p.p.PlaysafeMetricApplicationTests     : Starting PlaysafeMetricApplicationTests on renaldo-pc with PID 659510 (started by renaldo in /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app)
2020-09-28 12:53:11.408 DEBUG 659510 --- [           main] c.p.p.PlaysafeMetricApplicationTests     : Running with Spring Boot v2.3.4.RELEASE, Spring v5.2.9.RELEASE
2020-09-28 12:53:11.409  INFO 659510 --- [           main] c.p.p.PlaysafeMetricApplicationTests     : No active profile set, falling back to default profiles: default
2020-09-28 12:53:14.499  INFO 659510 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-09-28 12:53:14.645  INFO 659510 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 73ms. Found 0 JPA repository interfaces.
2020-09-28 12:53:18.156  INFO 659510 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-28 12:53:18.192  INFO 659510 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-09-28 12:53:18.656  INFO 659510 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-09-28 12:53:18.803  INFO 659510 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-09-28 12:53:19.075  INFO 659510 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.21.Final
2020-09-28 12:53:19.793  INFO 659510 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-09-28 12:53:19.870  WARN 659510 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-09-28 12:53:20.308  INFO 659510 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-09-28 12:53:21.717  INFO 659510 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-09-28 12:53:21.769  INFO 659510 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-09-28 12:53:23.110  INFO 659510 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories…
2020-09-28 12:53:23.111  INFO 659510 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-09-28 12:53:23.142  INFO 659510 --- [           main] c.p.p.PlaysafeMetricApplicationTests     : Started PlaysafeMetricApplicationTests in 12.226 seconds (JVM running for 15.96)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.712 s - in com.playsafesa.playsafemetricapp.PlaysafeMetricApplicationTests
[INFO] Running com.playsafesa.playsafemetricapp.controller.MetricControllerTest
2020-09-28 12:53:23.503  INFO 659510 --- [           main] .b.t.a.w.s.WebMvcTestContextBootstrapper : Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.playsafesa.playsafemetricapp.controller.MetricControllerTest], using SpringBootContextLoader
2020-09-28 12:53:23.506  INFO 659510 --- [           main] o.s.t.c.support.AbstractContextLoader    : Could not detect default resource locations for test class [com.playsafesa.playsafemetricapp.controller.MetricControllerTest]: no resource found for suffixes {-context.xml, Context.groovy}.
2020-09-28 12:53:23.507  INFO 659510 --- [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.playsafesa.playsafemetricapp.controller.MetricControllerTest]: MetricControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2020-09-28 12:53:23.578  INFO 659510 --- [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.playsafesa.playsafemetricapp.PlaysafeMetricApplication for test class com.playsafesa.playsafemetricapp.controller.MetricControllerTest
2020-09-28 12:53:23.588  INFO 659510 --- [           main] .b.t.a.w.s.WebMvcTestContextBootstrapper : Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
2020-09-28 12:53:23.608  INFO 659510 --- [           main] .b.t.a.w.s.WebMvcTestContextBootstrapper : Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@4462efe1, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@7c3e4b1a, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@2db4ad1, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@765d55d5, org.springframework.test.context.support.DirtiesContextTestExecutionListener@2513a118, org.springframework.test.context.transaction.TransactionalTestExecutionListener@2bfb583b, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@73ae0257, org.springframework.test.context.event.EventPublishingTestExecutionListener@6fc1020a, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@5762658b, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@2629d5dc, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@2596d7f4, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@42a0501e, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@6aa3bfc, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@6e4599c0]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-28 12:53:23.723  INFO 659510 --- [           main] c.p.p.controller.MetricControllerTest    : Starting MetricControllerTest on renaldo-pc with PID 659510 (started by renaldo in /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app)
2020-09-28 12:53:23.723 DEBUG 659510 --- [           main] c.p.p.controller.MetricControllerTest    : Running with Spring Boot v2.3.4.RELEASE, Spring v5.2.9.RELEASE
2020-09-28 12:53:23.775  INFO 659510 --- [           main] c.p.p.controller.MetricControllerTest    : No active profile set, falling back to default profiles: default
2020-09-28 12:53:26.071  INFO 659510 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-28 12:53:26.937  INFO 659510 --- [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2020-09-28 12:53:26.950  INFO 659510 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2020-09-28 12:53:27.008  INFO 659510 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 56 ms
2020-09-28 12:53:27.153  INFO 659510 --- [           main] c.p.p.controller.MetricControllerTest    : Started MetricControllerTest in 3.527 seconds (JVM running for 19.97)
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.407 s - in com.playsafesa.playsafemetricapp.controller.MetricControllerTest
2020-09-28 12:53:28.048  INFO 659510 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-09-28 12:53:28.052  INFO 659510 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-09-28 12:53:28.053  INFO 659510 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2020-09-28 12:53:28.074  INFO 659510 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-09-28 12:53:28.075  INFO 659510 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-09-28 12:53:28.126  INFO 659510 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ playsafe-metric-app ---
[INFO] Building jar: /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target/playsafe-metric-app-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.3.4.RELEASE:repackage (repackage) @ playsafe-metric-app ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ playsafe-metric-app ---
[INFO] Installing /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/target/playsafe-metric-app-0.0.1-SNAPSHOT.jar to /home/renaldo/.m2/repository/com/playsafesa/playsafe-metric-app/0.0.1-SNAPSHOT/playsafe-metric-app-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/renaldo/Projects/tutorials/playsafesa/playsafe-metric-app/pom.xml to /home/renaldo/.m2/repository/com/playsafesa/playsafe-metric-app/0.0.1-SNAPSHOT/playsafe-metric-app-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  39.553 s
[INFO] Finished at: 2020-09-28T12:53:31+02:00
[INFO] ------------------------------------------------------------------------
```

Run and executing ignoring unit tests.

```sh
$ mvn clean install -DskipTests=true
```

### Access the Service
```sh
http://localhost:8080/api/v1/metric/kelvintocelsius?id=600.0
http://localhost:8080/api/v1/metric/poundstokilograms?id=120.0
http://localhost:8080/api/v1/metric/milestokilometers?id=300.0
```

### Docker

By default, the Docker will expose port 8080, so change this within the Dockerfile if necessary. When ready, simply use the Dockerfile to build the image.

```sh
docker build -t playsafesa/spring-boot-metric-app .
docker run -p 8080:8080 playsafesa/spring-boot-metric-app
```