#!/bin/bash

# In the Maven project you can also create a run configuration

# http://cs.nyu.edu/courses/fall11/CSCI-GA.2130-001/rats-intro.pdf
# Put both rats.jar and Simple.rats in the same directory.
# Use Rats! on Simple.rats, which will generate a new file SimpleParser.java

# -verbose
java -ea -cp rats-2.3.1.jar xtc.parser.Rats -lgpl -out ../src/main/java/rats/spike Simple.rats
