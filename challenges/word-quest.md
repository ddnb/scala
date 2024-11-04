# Programming Challenge: Change Data Format for [WordQuest][word-quest]

## Introduction

You work for a company that makes an online multiplayer game called WordQuest.

In WordQuest, each player receives 13 letters, which they must rearrange to create words. Different letters have different point values, as it's easier to create words with some letters than others.

The game was originally launched in English, but it has grown popular, and the company now plans to expand to other languages.

Each language will have unique point values for letters, determined by how frequently letters are used in that language.

For example, the letter 'C' is quite common in English, and is worth 3 points, but in Norwegian, where it's rare, it's worth 10 points.

To make it easier to add new languages, your team needs to change how letters and their point values are stored in the game.

## Instructions

Your task is to modify the data format of letters and their point values in WordQuest.

Currently, letters are stored in groups based on their score, using a one-to-many mapping.

```
1 point: "A", "E", "I", "O", "U", "L", "N", "R", "S", "T"
2 points: "D", "G"
3 points: "B", "C", "M", "P"
4 points: "F", "H", "V", "W", "Y"
5 points: "K"
8 points: "J", "X"
10 points: "Q", "Z"
```

This needs to be changed to store each individual letter with its score in a one-to-one mapping, using lowercase letters.

For example:
- "a" is worth 1 point.
- "b" is worth 3 points.
- "c" is worth 3 points.
- "d" is worth 2 points.

## Note

To see how the data structure was previously organized and how it needs to change, refer to the examples in the test suite.

## Source

Based on an exercise by the JumpstartLab team for students at [The Turing School](https://turing.edu/) of Software and Design.
