# Scala Challenges

## Overview

Welcome to the **Scala Challenges Package**! This package is designed to help beginners and intermediate developers learn Scala through hands-on coding exercises and challenges. Whether you're new to Scala or looking to refine your skills, this package offers a range of functions and challenges that will deepen your understanding of Scala.

## Features

- **Master Scala Basics**: Discover essential concepts with straightforward examples.
- **Programming Challenges**: Solve curated challenges to build your problem-solving skills and reinforce learning.
- **Organized Codebase**: Each challenge is designed with clean, well-structured code for clarity and ease of understanding.
- **Testing with ScalaTest**: Integrated tests to verify your solutions and ensure code quality.

## Installation

Add the package to your `build.sbt` file:

```scala
libraryDependencies += "com.lehungio" %% "scala-challenges" % "0.1.0"
```

## Usage

To utilize the functions provided in this package, import them into your Scala code:

```scala
// Import specific classes
import com.lehungio.challenges.{HelloWorld, DoorPassword}

// Instantiate classes
val helloWorld = new HelloWorld()
helloWorld.greet() // Output: "Hello, World!"
```

## Programming Challenges

This package includes a collection of programming challenges that allow you to practice Scala concepts and techniques.

### Example Challenge

**Challenge:** Write a function that takes a list of integers and returns the sum.

**Solution:**

```scala
def sumList(nums: List[Int]): Int = nums.sum
```

## Running Tests

To verify that everything works as expected, run the tests included with the package. Make sure you have ScalaTest installed, then run:

```bash
sbt test
```

## Contributing

Contributions are welcome! If you have ideas for new features, challenges, or improvements, feel free to open a pull request or an issue.

## License

This project is licensed under the MIT License. See the LICENSE file for more information.

## Contact

If you have any questions or feedback, please get in touch!

- **Email**: me@lehungio.com
- **GitHub**: [@lehungio](https://github.com/lehungio)
- **Challenge Me**: [Submit a new challenge](https://github.com/ddnb/scala-challenges/issues/new?assignees=&labels=new&projects=&template=DEFAULT.md&title=Programming+Challenge%3A+%5BChallenge+Name%5D%5BNamespace%5D)
