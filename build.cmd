docker run -it --rm -v "%cd%:/usr/src/mymaven" -v "%HOMEDRIVE%%HOMEPATH%\.m2:/root/.m2" -w /usr/src/mymaven prod-dtr-ca.sunlifecorp.com/devopstoolchain/maven:3.8.1-openjdk-8 ./mvnw clean install