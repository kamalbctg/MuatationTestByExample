# Maven Command
- mvn clean install                                       
- mvn test                                       
- mvn org.pitest:pitest-maven:mutationCoverage   

# Java Command
- java -cp target/classes:target/test-classes:lib/junit-4.10.jar:lib/pitest-0.25-SNAPSHOT.jar \
    org.pitest.mutationtest.MutationCoverageReport \
    --reportDir target/pit-reports \
    --targetClasses pitexample.* \
    --sourceDirs src/main/java,src/test/java
    
# Ref:
- https://www.infoq.com/presentations/kill-better-test 
- https://xebia.com/blog/mutation-testing-how-good-are-your-unit-tests
