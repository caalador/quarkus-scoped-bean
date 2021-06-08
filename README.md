Execute `mvn clean package` --> test fails due to `Cannot delegate to an abstract method`

Change MyBean from `ApplicationScoped` to `Singleton` rerun `mvn clean package` see that tests pass