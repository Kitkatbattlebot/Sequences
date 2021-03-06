## Sequences

A Java program that compares several DNA strands and looks for
common subsequences among the strands. Each DNA strand consists of a sequence
of bases (A, G, C, U) and is represented as a line of characters in an input
file. For example, this would represent four DNA strands:

GAGUACUCGGAUG
UUAUACUCGUCUG
UCUUACUCGGAUG
GAGCACUCGCCUG

A common subsequence is a sequence of characters where the same sequence of
characters appears at the same location in the strands. With the above
example, a common subsequence is "ACUCG" and starts at the 5th position in the
string. We will only consider common subsequences that are at least 3
characters longs. That is, we wouldn't count the "UG" common subsequence at
the very end of the strands.

In order to qualify as a common subsequence the same sequences of characters
must appear in the same position in all of the DNA strands. Even though "GAG"
appears in the first position for both the first and fourth strands, since it
doesn't also appear in the other strands, it is not a common subsequence.

Your program will need to find all of the subsequences and then print them out
in order from longest to shortest. See the output.txt file for the exact
format and values. In order to do the longest-to-shortest sorting you will
need to use the Comparable interface in Java.

This assignment includes several data files containing DNA strands. All of the
data files, except for verysmall.txt, have the same subsequences in their DNA
strands so the results from your program will be the same on all of the files
(exactly what is in output.txt).
