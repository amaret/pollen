#!/usr/bin/env bash

export POLLEN=`pwd`/translator/build/libs/pollen.jar 
echo "ejs $POLLEN"
cd test/pollen.test/bin && ./testPollen

