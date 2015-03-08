#!/usr/bin/env bash

CPY_FILE=/tmp/copyright-file.txt;
LIC_LINE_1="Copyright Amaret, Inc 2011-2015"
LIC_LINE_2="See https://github.com/amaret/pollen/blob/master/LICENSE"
JAVA_COMMENT="//"
BASH_COMMENT="#"

for file in $(find . -type f -name \*.java); do
  echo "$JAVA_COMMENT $LIC_LINE_1" > $CPY_FILE;
  echo "$JAVA_COMMENT $LIC_LINE_2" >> $CPY_FILE;
  echo "" >> $CPY_FILE;
  cat $file >> $CPY_FILE;
  mv $CPY_FILE $file;
done

