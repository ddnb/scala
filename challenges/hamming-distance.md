# Programming Challenge: [Calculate the Hamming Distance Between Two DNA Strands][hamming-distance]

## Overview

Welcome to the **Hamming Distance Programming Challenge**! This challenge is designed to help you understand how to compare two sequences of DNA and calculate the number of differences between them. This is known as the "Hamming distance".

## Challenge Description

The objective of this challenge is to create a function that calculates the Hamming distance between two DNA strands. The Hamming distance is only defined for sequences of equal length, so an attempt to calculate it between sequences of different lengths should not work.

### Requirements

1. Create a function named `hammingDistance`.
2. The function should take two strings as input, representing the DNA strands.
3. The function should return an `Option[Int]` indicating the Hamming distance if the strands are of equal length, or `None` if they are of different lengths.

### Example

Given the following DNA strands:
```
GAGCCTACTAACGGGAT CATCGTAATGACGGCCT
```

Please find out how the code block can be applied to the editor. Provide the code changes in the format as described above.

The function should return `Some(7)`.

### Example Code

Here is a sample implementation in Scala:

```scala
def hammingDistance(strand1: String, strand2: String): Option[Int] = {
  if (strand1.length != strand2.length) None
  else Some(strand1.zip(strand2).count { case (a, b) => a != b })
}
```

## Reference

The Calculating Point Mutations problem at [Rosalind](http://rosalind.info/problems/hamm/)