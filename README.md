# Coding Ninjas DSA with Java

A personal collection of Java programs and notes created while learning Data Structures and Algorithms through the Coding Ninjas curriculum.

The repository currently contains **152 Java practice files**. They cover Java fundamentals, arrays, strings, patterns, object-oriented programming, recursion, searching, sorting, time and space complexity, and an introductory linked-list exercise.

## Topics covered

### Introduction to Java

- Program structure, variables, literals, primitive data types, type casting, and operators
- Conditional statements, ternary operators, and `switch`
- Loops, nested loops, Fibonacci series, prime numbers, and digit operations
- Methods, arguments, return values, call stack, pass-by-value, and overloading
- One-dimensional arrays: traversal, default values, sums, maximum and second-largest values, insertion, reversal, rotation, and shifting
- Two-dimensional arrays: traversal, runtime input, methods, enhanced `for` loops, jagged arrays, largest-column sum, and spiral traversal
- Strings and character arrays: creation, memory, input, methods, word counting, and reversal
- Pattern printing: squares, triangles, pyramids, character patterns, mirror and inverted triangles, and hourglass patterns

### Java Basics and DSA

- Object-oriented programming: classes, objects, encapsulation, inheritance, polymorphism, abstraction, interfaces, generics, and exception handling
- Practice classes: `Student`, `Account`, `Employee`, `Fraction`, `Complex`, `Polynomial`, and a dynamic array
- Recursion: palindrome check, binary search, merge sort, quick sort, and Tower of Hanoi
- Searching: linear and binary search
- Sorting: bubble, insertion, selection, and merge operations
- Time and space complexity exercises: array intersection and equilibrium
- Introductory linked-list exercise using `ArrayList`
- Console projects: calculator and tic-tac-toe

## Repository structure

```text
CN_DSA/
├── introduction_to_java/
│   ├── introduction_to_java/      # First Java programs
│   ├── fundamentals_of_java/      # Variables, literals, and data types
│   ├── operators_in_java/         # Operators and type casting
│   ├── Control_flow/              # Conditions, ternary operator, and switch
│   ├── Loops/                     # Loop-based exercises
│   ├── methods/                   # Methods and method exercises
│   ├── Arrays_1/                  # One-dimensional array fundamentals
│   ├── Arrays_2/                  # Array manipulation exercises
│   ├── 2D_Array/                  # Two-dimensional and jagged-array exercises
│   ├── strings/                   # String and character-array exercises
│   ├── Patterns/                  # Basic star and number patterns
│   └── Patterns_2/                # Advanced character and shape patterns
├── java_basics/
│   ├── OOP_1/                     # Classes, objects, and custom data structures
│   ├── OOP_2/                     # Inheritance, polymorphism, and exceptions
│   ├── OOP_3/                     # Abstraction, interfaces, and generics
│   ├── OOP_4/Projects/            # Calculator and tic-tac-toe projects
│   ├── Linked-list-1/             # Introductory collection exercise
│   ├── recursion/                 # Recursive algorithms and exercises
│   ├── searching_algorithm/       # Linear and binary search
│   ├── sorting_algorithm/         # Bubble, insertion, selection, and merge operations
│   └── Time_and_Space_Complexity/ # Array-based complexity exercises
├── Notes/
│   ├── 2D_array/                  # Spiral traversal explanation and dry run
│   └── Patterns_1/                # Pattern-solving strategy notes
└── README.md
```

## Running a program

These are individual practice files rather than a shared application or build system. Install a Java Development Kit (JDK), then open a terminal in the folder containing the file you want to run.

```bash
javac Hello.java
java Hello
```

Programs that use companion classes must be compiled together. For example:

```bash
javac Student.java Student_use.java
java Student_use
```

Most examples are console programs, and some prompt for input. Compiled `.class` files are generated beside the source files and can be removed after use.

## Notes

- File and class names retain the names used during practice.
- Most programs are independent examples; compile and run them from their own directories.
- The `Notes` directory contains learning notes for pattern problems and spiral traversal.
