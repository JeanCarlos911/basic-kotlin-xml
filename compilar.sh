#!/bin/bash

# compile a file
kotlinc file.kt -include-runtime -d output.jar

# execute the output
java -jar output.jar
