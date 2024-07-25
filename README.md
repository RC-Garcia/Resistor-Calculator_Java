# Resistor-Calculator_Java

This project contains a Java program to calculate the needed resistor for a given load, input voltage, and operating current. The program helps determine the appropriate resistor value required to ensure the correct operation of a circuit.

## Description

The program calculates the needed resistor value using the following formula:
\[ R_{needed} = \frac{V_{input} - (I_{operating} \times R_{load})}{I_{operating}} \]

where:
- \( V_{input} \) is the input voltage in volts (V)
- \( I_{operating} \) is the operating current in amperes (A)
- \( R_{load} \) is the load resistance in ohms (Ω)

## Setup

1. **Download the Java File**:
   - Save the provided [Java code](ResistorCalculator.java) to a file named `ResistorCalculator.java`.

2. **Install Java**:
   - Ensure you have the Java Development Kit (JDK) installed on your system. You can download it from [oracle.com](https://www.oracle.com/java/technologies/javase-downloads.html).

## Usage

1. **Compile the Java Program**:
   - Open a terminal or command prompt.
   - Navigate to the directory where `ResistorCalculator.java` is saved.
   - Compile the Java program with the following command:
     ```sh
     javac ResistorCalculator.java
     ```

2. **Run the Java Program**:
   - Execute the compiled Java program with the following command:
     ```sh
     java ResistorCalculator
     ```

3. **Input the Values**:
   - Enter the input voltage (V) when prompted.
   - Enter the operating current (I) when prompted.
   - Enter the load resistance (R<sub>L</sub>) when prompted.

4. **View the Result**:
   - The program will display the calculated resistor value in ohms (Ω).

## Example

**If you run the program and provide the following inputs:**

- Enter the input voltage **(V)**: `12`
- Enter the operating current **(I)**: `0.5`
- Enter the load resistance **(R<sub>L</sub>)**: `8`

**The output will be:**

*Needed Resistor:* `16.00 Ω`


This means you would need a 16.00 Ω resistor for the given parameters.

>[!NOTE]
>Feel free to modify the code to better fit your specific needs. 😉
>
>This project is protected under [MIT License](LICENSE). :shipit:



