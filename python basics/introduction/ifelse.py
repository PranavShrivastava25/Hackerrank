#!/bin/python
'''
given a number n :
if:
If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
'''

import math
import os
import random
import re
import sys



n=input();
if n%2 is not 0:
    print "Weird"
elif n%2 is  0 and n<=20 and n>=6:
    print "Weird"
else :
    print "Not Weird"

