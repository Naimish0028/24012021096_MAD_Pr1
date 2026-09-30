# Kotlin Programming Concepts – Practical

A collection of Kotlin programs demonstrating fundamental programming concepts, control flow, functions, recursion, collections, object-oriented programming, operator overloading, and matrix operations.

## 🎯 Objective

The objective of this practical is to understand and implement basic Kotlin programming concepts, including:

* Variables and data types
* Type conversion
* User input
* Control flow
* Functions
* Recursion
* Arrays and `ArrayList`
* Classes and constructors
* Operator overloading
* Matrix operations

## 🛠️ Requirements

* **Programming Language:** Kotlin
* **IDE:** IntelliJ IDEA / Android Studio
* **JDK:** Java Development Kit
* **Compiler:** Kotlin/JVM

---

## 📚 Practicals

| No.  | Practical              | Concepts                      |
| ---- | ---------------------- | ----------------------------- |
| 1.1  | Store & Display Values | Variables and data types      |
| 1.2  | Type Conversion        | Numeric and string conversion |
| 1.3  | Student Information    | User input and output         |
| 1.4  | Odd or Even            | Conditional expressions       |
| 1.5  | Month Name             | `when` expression             |
| 1.6  | Arithmetic Operations  | User-defined functions        |
| 1.7  | Factorial              | Recursion                     |
| 1.8  | Arrays                 | Arrays, loops, sorting        |
| 1.9  | Maximum from ArrayList | Collections                   |
| 1.10 | Car Class              | Classes and constructors      |
| 1.11 | Matrix Operations      | Operator overloading          |

---

## 1.1 Store & Display Values in Different Variables

Demonstrates Kotlin's basic data types and variable declarations using `val`.

### Concepts

* `Int`
* `Double`
* `Float`
* `Long`
* `Short`
* `Byte`
* `Char`
* `Boolean`
* `String`

```kotlin
fun main() {
    val intValue: Int = 10
    val doubleValue: Double = 20.5
    val floatValue: Float = 15.5f
    val longValue: Long = 100000L
    val shortValue: Short = 25
    val byteValue: Byte = 5
    val charValue: Char = 'A'
    val booleanValue: Boolean = true
    val stringValue: String = "Kotlin"

    println("Integer: $intValue")
    println("Double: $doubleValue")
    println("Float: $floatValue")
    println("Long: $longValue")
    println("Short: $shortValue")
    println("Byte: $byteValue")
    println("Char: $charValue")
    println("Boolean: $booleanValue")
    println("String: $stringValue")
}
```

---

## 1.2 Type Conversion

Demonstrates explicit type conversion in Kotlin.

### Conversions

1. Integer → Double
2. String → Integer
3. String → Double

Kotlin does not perform implicit numeric type conversion. Conversion functions such as `toDouble()`, `toInt()`, and `toFloat()` are used.

```kotlin
fun main() {
    val number: Int = 25
    val doubleNumber: Double = number.toDouble()

    val strInt = "100"
    val intValue = strInt.toInt()

    val strDouble = "25.75"
    val doubleValue = strDouble.toDouble()

    println("Integer: $number")
    println("Integer to Double: $doubleNumber")
    println("String to Integer: $intValue")
    println("String to Double: $doubleValue")
}
```

---

## 1.3 Scan Student Information

Accepts and displays student information using console input.

### Information Collected

* Student Name
* Enrollment Number
* Branch
* Semester
* Age

```kotlin
fun main() {
    print("Enter Student Name: ")
    val name = readln()

    print("Enter Enrollment Number: ")
    val enrollmentNo = readln()

    print("Enter Branch: ")
    val branch = readln()

    print("Enter Semester: ")
    val semester = readln().toInt()

    print("Enter Age: ")
    val age = readln().toInt()

    println("\n--- Student Information ---")
    println("Name: $name")
    println("Enrollment No: $enrollmentNo")
    println("Branch: $branch")
    println("Semester: $semester")
    println("Age: $age")
}
```

---

## 1.4 Check Odd or Even Numbers

Determines whether a number is odd or even using a conditional expression inside `println()`.

The modulus operator `%` is used to determine the remainder:

* `number % 2 == 0` → Even
* Otherwise → Odd

```kotlin
fun main() {
    print("Enter a number: ")
    val number = readln().toInt()

    println(
        if (number % 2 == 0)
            "$number is Even"
        else
            "$number is Odd"
    )
}
```

---

## 1.5 Display Month Name Using `when`

Uses Kotlin's `when` expression to convert a month number into its corresponding month name.

```kotlin
fun main() {
    print("Enter month number (1-12): ")
    val month = readln().toInt()

    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Month: $monthName")
}
```

---

## 1.6 User-Defined Function for Arithmetic Operations

Defines a function that performs basic arithmetic operations on two numbers.

### Operations

* Addition
* Subtraction
* Multiplication
* Division

```kotlin
fun arithmeticOperations(a: Double, b: Double) {
    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")

    if (b != 0.0)
        println("Division: ${a / b}")
    else
        println("Division: Cannot divide by zero")
}

fun main() {
    print("Enter first number: ")
    val a = readln().toDouble()

    print("Enter second number: ")
    val b = readln().toDouble()

    arithmeticOperations(a, b)
}
```

---

## 1.7 Factorial Calculation Using Recursion

Calculates the factorial of a number using recursion.

### Formula

```text
n! = n × (n - 1)!
0! = 1
```

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1)
        1
    else
        n * factorial(n - 1)
}

fun main() {
    print("Enter a number: ")
    val number = readln().toInt()

    println("Factorial of $number = ${factorial(number)}")
}
```

---

## 1.8 Working with Arrays

Demonstrates several Kotlin array operations:

* `Array`
* `IntArray`
* `Arrays.deepToString()`
* `contentDeepToString()`
* `joinToString()`
* `range`
* `downTo`
* `until`
* Sorting without built-in functions
* Sorting using built-in functions

```kotlin
import java.util.Arrays

fun main() {

    // One-dimensional array
    val numbers = intArrayOf(5, 2, 8, 1, 9)

    println("Original Array: ${numbers.joinToString()}")

    // Using range
    print("Using range: ")
    for (i in 0..numbers.lastIndex) {
        print("${numbers[i]} ")
    }

    // Using until
    print("\nUsing until: ")
    for (i in 0 until numbers.size) {
        print("${numbers[i]} ")
    }

    // Using downTo
    print("\nUsing downTo: ")
    for (i in numbers.lastIndex downTo 0) {
        print("${numbers[i]} ")
    }

    // Two-dimensional array
    val matrix = arrayOf(
        arrayOf(1, 2),
        arrayOf(3, 4)
    )

    println("\n2D Array: ${Arrays.deepToString(matrix)}")
    println("contentDeepToString: ${matrix.contentDeepToString()}")

    // Sorting without built-in function
    val arr = intArrayOf(5, 2, 8, 1, 9)

    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    println("Sorted without built-in function: ${arr.joinToString()}")

    // Sorting using built-in function
    val arr2 = intArrayOf(5, 2, 8, 1, 9)
    arr2.sort()

    println("Sorted using built-in function: ${arr2.joinToString()}")
}
```

---

## 1.9 Find Maximum Number from ArrayList

Finds the maximum value from an `ArrayList` of integers.

```kotlin
fun main() {
    val numbers = arrayListOf(10, 25, 7, 45, 18, 30)

    var maximum = numbers[0]

    for (number in numbers) {
        if (number > maximum) {
            maximum = number
        }
    }

    println("ArrayList: $numbers")
    println("Maximum number: $maximum")
}
```

---

## 1.10 Class and Constructor Creation

Demonstrates a `Car` class with properties, a constructor, and member functions.

### Properties

* Type
* Model
* Price
* Owner
* Miles Driven

### Functions

* Get car information
* Get original car price
* Calculate current car price
* Display car information

```kotlin
class Car(
    private val type: String,
    private val model: String,
    private val price: Double,
    private val owner: String,
    private val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        // Depreciation based on miles driven
        val depreciation = milesDriven * 0.10
        return maxOf(0.0, price - depreciation)
    }

    fun displayCarInformation() {
        println("\n--- Car Information ---")
        getCarInformation()
        println("Original Price: ${getOriginalPrice()}")
        println("Current Price: ${getCurrentPrice()}")
    }
}

fun main() {
    val car = Car(
        type = "SUV",
        model = "Toyota Fortuner",
        price = 4000000.0,
        owner = "Rahul",
        milesDriven = 50000.0
    )

    car.displayCarInformation()
}
```

> **Note:** The depreciation formula is only an example for demonstrating the concept. It can be modified according to the practical requirements.

---

## 1.11 Operator Overloading and Matrix Operations

Demonstrates operator overloading using a custom `Matrix` class.

The following operators are overloaded:

* `+` — Matrix addition
* `-` — Matrix subtraction
* `*` — Matrix multiplication

In Kotlin, operator functions are declared using the `operator` keyword.

For example:

```kotlin
operator fun plus(other: Matrix): Matrix
```

allows matrix objects to be added using:

```kotlin
matrix1 + matrix2
```

### Matrix Class

```kotlin
class Matrix(
    private val data: Array<IntArray>
) {

    private val rows = data.size
    private val cols = data[0].size

    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must be the same"
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must be the same"
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) {
            "Invalid matrix dimensions for multiplication"
        }

        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") {
            it.joinToString(" ")
        }
    }
}

fun main() {

    val matrix1 = Matrix(
        arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
    )

    val matrix2 = Matrix(
        arrayOf(
            intArrayOf(5, 6),
            intArrayOf(7, 8)
        )
    )

    println("Matrix 1:")
    println(matrix1)

    println("\nMatrix 2:")
    println(matrix2)

    println("\nMatrix Addition:")
    println(matrix1 + matrix2)

    println("\nMatrix Subtraction:")
    println(matrix1 - matrix2)

    println("\nMatrix Multiplication:")
    println(matrix1 * matrix2)
}
```

### Matrix Operations

#### Addition

Two matrices can be added when they have the same dimensions.

```text
A + B = C
```

Each corresponding element is added.

#### Subtraction

Two matrices can be subtracted when they have the same dimensions.

```text
A - B = C
```

Each corresponding element is subtracted.

#### Multiplication

Matrix multiplication is possible when:

```text
Columns of A = Rows of B
```

Each element in the resulting matrix is calculated using the sum of products of corresponding elements.

---

## 📖 Concepts Learned

| Practical | Concept                                    |
| --------- | ------------------------------------------ |
| 1.1       | Variables and Data Types                   |
| 1.2       | Type Conversion                            |
| 1.3       | User Input                                 |
| 1.4       | Conditional Expression                     |
| 1.5       | `when` Expression                          |
| 1.6       | User-Defined Functions                     |
| 1.7       | Recursion                                  |
| 1.8       | Arrays and Loops                           |
| 1.9       | ArrayList                                  |
| 1.10      | Classes and Constructors                   |
| 1.11      | Operator Overloading and Matrix Operations |

---

## ▶️ How to Run

1. Install **IntelliJ IDEA** or **Android Studio**.
2. Create a **Kotlin/JVM** project.
3. Create a `.kt` file for each practical.
4. Copy the required program into the corresponding file.
5. Run the `main()` function.
6. Enter the required input when prompted.
7. View the output in the console.

---

## 📁 Suggested Project Structure

```text
kotlin-practicals/
├── README.md
├── Practical_1_1_DataTypes.kt
├── Practical_1_2_TypeConversion.kt
├── Practical_1_3_StudentInfo.kt
├── Practical_1_4_OddEven.kt
├── Practical_1_5_MonthName.kt
├── Practical_1_6_Arithmetic.kt
├── Practical_1_7_Factorial.kt
├── Practical_1_8_Arrays.kt
├── Practical_1_9_ArrayList.kt
├── Practical_1_10_CarClass.kt
└── Practical_1_11_Matrix.kt
```

## ✅ Conclusion

This practical provides a foundation in Kotlin programming by implementing fundamental programming concepts and object-oriented programming features.

The programs cover variables, type conversion, input/output, conditional statements, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.
