#!/bin/bash

MSYS_NO_PATHCONV=1 docker run -it --rm -v "$PWD:/usr/src/mymaven" -v "$HOME/.m2:/root/.m2" -w "/usr/src/mymaven" prod-dtr-ca.sunlifecorp.com/devops/maven:3.8.1-jdk-8 ./mvnw clean package