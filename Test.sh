#!/usr/bin/env bash

export POLLEN_JAR="../../translator/build/libs/pollen.jar"
#clean masters and test results
pollen-test/bin/testPollen -cleanall
#create masters
pollen-test/bin/testPollen
#test
echo "running tests..."
pollen-test/bin/testPollen
echo "...tests complete"

