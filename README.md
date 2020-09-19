# Java studies

Study for a selective process's dynamics using [Java], which I did not have prior contact.

# Summary of w3schools Java Tutorial

Summary of [w3schools Java Tutorial]. 

* In Java, every application begins with a class name, and that class must match the filename.
* Every line of code that runs in Java must be inside a `class`.
* Single-line comments start with `//`.
* Multi-line comments start with `/*` and ends with `*/`.
* Types of variables:
    - `String`: stores text. String values are surrounded by `" "`.
    - `int`: stores integers.
    - `float`: stores floating point numbers.
    - `char`: stores single characters. Char values are surrounded by `' '`.
    - `boolean`: stores values with two states: `true` or `false`.
* Declare a variable:
    - ```java
      type name = value;
      ```
    - Add `final` so it's value can not change.
      ```java
      final float number = 15.001f;
      ```
    - To declare more than one variable of the same type, use a comma-separated list.
    - Array:
      ```java
      type[] name = { value, value, value };
      ```
* Methods:
  - Methods without `return` have the word `void`:
    ```java
    static void name(type arg) {
      // action;
    }
    ```
  - Methods with return have the type of the return value instead:
    ```java
    static type name(type arg) {
      // action;
      return value;
    }
    ```
  - With method overloading, multiple methods can have the same name with different parameters.
  - Methods can be either static or public (non static). `static` methods can be accessed without creating an object of the class; `public` methods can only be accessed by objects.
* Classes:
  - Constructor is a special method that is used to initialize objects:
    ```java
    type nomeAtributo;

    public nomeDaClasse(type arg){
      nomeAtributo = arg;
    }
    ```
  - Modifiers:
    * We divide modifiers into two groups: **Access Modifiers** and **Non-Access Modifiers**.
    * For **Access Modifiers**, we have  `public` (The code is accessible for all classes), `private` (The code is only accessible within the declared class), `protected` (The code is accessible in the same package and subclasses) and `default` (The code is only accessible in the same package) (for classes, only `public` and `default`).
    * For **Non-Access Modifiers**, we have `final`, `abstract`, `static`, `transient` (Attributes and methods are skipped when serializing the object containing them), `synchronized` (Methods can only be accessed by one thread at a time) and `volatile` (The value of an attribute is not cached thread-locally, and is always read from the "main memory") (for classes, only `final` (cannot be inherited) and `abstract`).
  - Inheritance use the `extends` keyword.
  - Interface use the `implements` keyword.
  - `enum`: NomeClasse.values().

[w3schools Java Tutorial]: https://www.w3schools.com/java/default.asp
[Java]: https://www.java.com/