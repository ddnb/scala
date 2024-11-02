# Programming Challenge: [Space Age][space-age]

## Introduction

The year is 2525, and you've just embarked on a journey to visit all the planets in the Solar System: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune. Your first stop is Mercury, where customs require you to fill out a form. As you hand over the form to the customs officer, they scrutinize it and frown. 

"Do you really expect me to believe you're just 50 years old? You must be closer to 200 years old!"

Amused, you wait for the customs officer to start laughing, but they appear to be dead serious. You realize that you've entered your age in Earth years, but the officer expected it in Mercury years! With Mercury's orbital period around the sun being significantly shorter than Earth's, you're actually a lot older in Mercury years. After some quick calculations, you're able to provide your age in Mercury years. The customs officer smiles, satisfied, and waves you through. You make a mental note to pre-calculate your planet-specific age before future customs checks to avoid such mix-ups.

## Instructions

Given an age in seconds, calculate how old someone would be on a planet in our Solar System.

- One Earth year equals 365.25 Earth days, or 31,557,600 seconds. For instance, if someone is 1,000,000,000 seconds old, their age would be approximately 31.69 Earth years.

### Planetary Orbital Periods

For the other planets, you have to account for their orbital period in Earth years:

| Planet   | Orbital Period in Earth Years |
|----------|-------------------------------|
| Mercury  | 0.2408467                     |
| Venus    | 0.61519726                    |
| Earth    | 1.0                           |
| Mars     | 1.8808158                     |
| Jupiter  | 11.862615                     |
| Saturn   | 29.447498                     |
| Uranus   | 84.016846                     |
| Neptune  | 164.79132                     |

### Notes

- The actual length of one complete orbit of the Earth around the sun is closer to 365.256 days (1 sidereal year). The Gregorian calendar has, on average, 365.2425 days. While not entirely accurate, 365.25 is the value used in this exercise. For more information, see [Year on Wikipedia](https://en.wikipedia.org/wiki/Year).

### Directory Structure
project_folder/
└── src/
    ├── main/
    │   └── scala/
    │       └── com/
    │           └── lehungio/
    │               └── classes/
    │                   └── SpaceAge.scala
    │               └── objects/
    │                   └── SpaceAge.scala
    └── test/
        └── scala/
            └── com/
                └── lehungio/
                    └── SpaceAgeUnitTest.scala

## Reference

For additional context and details about this challenge, please visit [Year on Wikipedia](https://en.wikipedia.org/wiki/Year).