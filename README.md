# Coding Ninjas DSA with Java

A personal collection of Java programs and notes created while learning Data Structures and Algorithms through the Coding Ninjas curriculum.

The repository contains **112 Java practice programs** covering Java fundamentals, control flow, arrays, strings, patterns, object-oriented programming, recursion, searching, sorting, and time/space complexity.

## Topics covered

### Introduction to Java

- Basic Java programs and program structure
- Variables, literals, and primitive data types
- Type casting and operators
- Conditional statements, ternary operators, and `switch`
- Loops, nested loops, Fibonacci series, prime numbers, and digit operations
- Methods, arguments, return values, call stack, pass-by-value, and overloading
- One-dimensional arrays:
  - declaration, traversal, default values, memory, and methods
  - sum, maximum, second-largest element, updates, insertion, reversal, rotation, and shifting
- Two-dimensional arrays:
  - creation, traversal, runtime input, methods, enhanced `for` loops, jagged arrays, largest-column sum, and spiral traversal
- Strings:
  - string creation, memory, input, methods, character arrays, word count, string reversal, and word reversal
- Pattern printing:
  - square, number, triangle, pyramid, mirror triangle, isosceles triangle, character patterns, inverted triangle, and hourglass patterns

### Java Basics and DSA

- Object-oriented programming:
  - Student class
  - Fraction class
  - Employee data
  - Bank account system
- Recursion:
  - basic recursion
  - palindrome check
  - binary search
  - merge sort
  - quick sort
  - Tower of Hanoi
- Searching algorithms:
  - linear search
  - binary search
- Sorting algorithms:
  - bubble sort
  - insertion sort
  - selection sort
  - merge two sorted arrays
- Time and space complexity exercises:
  - array intersection
  - array equilibrium

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
│
├── java_basics/
│   ├── OOP_1/
│   │   ├── Bank_system/           # Account and account-operation classes
│   │   ├── Employee_data/         # Employee class examples
│   │   ├── fraction_class/        # Fraction class examples
│   │   └── Student_class/         # Student class examples
│   ├── recursion/                 # Recursive algorithms and exercises
│   ├── searching_algorithm/       # Linear and binary search
│   ├── sorting_algorithm/         # Bubble, insertion, selection, and merge operations
│   └── Time_and_Space_Complexity/ # Array-based complexity exercises
│
├── Notes/
│   ├── 2D_array/                  # Spiral traversal explanation and dry run
│   └── Patterns_1/                # Pattern-solving strategy notes
│
└── README.md
```

## Running a program

These programs are individual practice files and do not use a shared build system.

1. Open a terminal in the folder containing the Java file.
2. Compile the file:

   ```bash
   javac Hello.java
   ```

3. Run the compiled class:

   ```bash
   java Hello
   ```

For examples that depend on another class, compile both files first:

```bash
javac Student.java Student_use.java
java Student_use
```

## Notes

- File and class names intentionally follow the names used during practice.
- Most programs are independent examples and may expect console input.
- The `Notes` directory contains learning notes for pattern problems and spiral traversal.