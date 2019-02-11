# gauge-testsuite-java
An example test suite to practice the use of gauge as a test framework

This suite is set to work using a remote selenium without downloading any driver.

## Using it with SeleniumHQ-Docker
1. Download and start selenium using docker 
    ```
    docker pull selenium/standalone-chrome-debug:latest
    docker run -d -p 4444:4444 -p 5901:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug
    ``` 
2. Run the test suite using the maven *test* goal and specifying 
    ```
        mvn test 
    ```
As per default chrome will be used in this project. 
