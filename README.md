# Introduction

Using the [Rats! parser generator](http://cs.nyu.edu/rgrimm/xtc/rats-intro.html)
from [xtc](http://cs.nyu.edu/rgrimm/xtc/) project with Maven.

The example is based on the article [Introduction to the Rats! Parser Generator](http://cs.nyu.edu/courses/fall11/CSCI-GA.2130-001/rats-intro.pdf).

See the generated parser in action:

- `mvn compile exec:java -Dexec.args=9-3+5` to convert the provided argument from infix to postfix notation.

Note: Only digits are supported (no numbers). The grammar is kept as simple as possible for demonstration purposes.
