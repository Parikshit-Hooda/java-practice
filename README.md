# Java practice

### Notes from Mosh's videos
- In Java, functions by convention have the opening curly brackets on the same line as function declaration.
- A class in Java contains the related functions. 
- Every Java app must have atleast 1 main() function.
- Every class and function must have an access-modifier. Mostly, we use `public`.
- In Java by convention, for naming a class, we use PascalCase. For naming a function, we use camelCase. 
- Main method is usually a `static` method 
Syntax for summarizing above points.

`public class Main {
public static void main() {
}
}`

- ###### package
  - Packages are essentially a way to organize Java classes.
  - An example package: `com.basePackage.subPackage1.packageInsideSubPackage1`. Creating packages this way in a Java project creates a nested directory structure in the `/src` folder. Package names are included at the top of a `.java` program file.

[Sample Java program with basic println function](https://github.com/Parikshit-Hooda/java-practice/blob/main/println.java)

- `javac`
  - `javac Main.java` compiles Main.java to bytecode. Bytecode is platform-independent intermediate state of a Java program. Java bytecode files have `.class` extension. JVM converts bytecode to machine code.
[Using javac - dummies](https://www.dummies.com/article/technology/programming-web-design/java/how-to-use-the-javac-command-172116)
  

