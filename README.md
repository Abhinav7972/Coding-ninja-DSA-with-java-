# Coding Ninjas DSA with Java

A personal collection of Java practice programs created while learning the **Coding Ninjas Full Stack Development Bootcamp** DSA curriculum.

The repository currently focuses on Java foundations, problem-solving exercises, arrays, methods, loops, and pattern printing. Each file is a small, standalone program intended for learning and experimentation.

## Topics covered

- Java program structure and first programs
- Variables, literals, and data types
- Type casting and operators
- Conditional statements, ternary operators, and `switch`
- `for`, `while`, nested, and `do-while` loops
- Prime numbers, Fibonacci series, digit reversal, and summation exercises
- Methods, arguments, return values, pass-by-value, overloading, and combinations
- Arrays: declaration, traversal, default values, updates, insertion, and searching for largest values
- Star, number, character, triangle, pyramid, mirror, and hourglass patterns
- Notes on approaching pattern-printing problems

## Repository structure

```text
CN_DSA/
├── introduction_to_java/
│   ├── introduction_to_java/  # First Java programs
│   ├── fundamentals_of_java/  # Variables, literals, and data types
│   ├── operators_in_java/     # Operators and type casting
│   ├── Control_flow/          # Conditions, ternary operator, and switch
│   ├── Loops/                 # Loop-based exercises
│   ├── methods/               # Methods and method exercises
│   ├── Arrays_1/              # Array fundamentals
│   ├── Arrays_2/              # Array update and insertion exercises
│   ├── Patterns/              # Basic star and number patterns
│   └── Patterns_2/            # Advanced character and shape patterns
├── Notes/
│   └── Patterns_1/            # Pattern-solving notes and strategy
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 25 or later
- A terminal such as PowerShell, Command Prompt, or a terminal in your IDE

Verify your Java installation:

```bash
javac --version
java --version
```

## Run an exercise

Every source file uses the default package and can be compiled independently.

1. Move to the folder containing the file.
2. Compile the file with `javac`.
3. Run the class using its filename without `.java`.

Example:

```powershell
cd introduction_to_java\Loops
javac Loop1.java
java Loop1
```

For a program that accepts input, enter the requested values in the terminal after running it.

Example:

```powershell
cd introduction_to_java\Arrays_1
javac Array_sum_of_element.java
java Array_sum_of_element
```

## Learning approach

The programs in this repository are organized by topic and are intended to be explored one at a time:

1. Read the comments and identify the concept being demonstrated.
2. Compile and run the program.
3. Change sample values or inputs.
4. Try extending the solution with your own logic.

## Notes

- Class names and filenames are intentionally kept aligned so each example can be compiled directly.
- There is no build system or external dependency; the JDK is sufficient.
- This is an actively growing learning repository, so more DSA topics and exercises may be added over time.