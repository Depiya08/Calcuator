
     Run the Application: Execute the compiled Java program to launch the calculator application.
     Perform Calculations: Use the buttons on the calculator interface to input numbers, select operations, and view results.
     Explore Special Functions: Experiment with the special functions to discover additional mathematical capabilities.
     Clear and Delete: Use the clear button to reset the calculator display, and the delete button to remove in#### TITLE: 
CodTech IT Solutions Internship- Task Documentation: "Simple Calculator With
Advance Features
#### INTERN INFORMATION:
#### NAME: Depiya Maji
#### ID:ICOD6498

#### I.  INTRODUCTION

Our Simple Calculator Application is a Java-based tool designed to provide users with a versatile and intuitive platform for performing 
various mathematical calculations. Whether you're a student, professional, or simply someone who needs to crunch numbers on a regular basis, 
our calculator offers a reliable solution with a user-friendly interface.

#### Key Features

#### 1. Basic Arithmetic Operations
The calculator supports all the fundamental arithmetic operations, including:

          Addition: Add two or more numbers together.
          Subtraction: Subtract one number from another.
          Multiplication: Multiply two or more numbers.
          Division: Divide one number by another.

#### 2. Special Functions
In addition to basic arithmetic, our calculator includes several special functions for
more advanced mathematical calculations, including:

         Square: Calculate the square of a number.
         Square Root: Compute the square root of a number.
         Sine, Cosine, and Tangent: Calculate the trigonometric functions of an angle.
         Logarithm: Compute the logarithm of a number.

#### 3. Error Prevention and Correction
Our calculator incorporates error prevention mechanisms to ensure that users enter valid input. Additionally, features such as the clear
button and delete button allow users to correct mistakes easily and efficiently.

#### 4. User-Friendly Interface
The calculator features a clean and intuitive interface, making it easy for users to input numbers, select operations, and view results.
The layout is designed to minimize confusion and streamline the calculation process.

#### II.  GETTING STARTed

To begin using the Simple Calculator Application, follow these simple steps:

            Compile the Source Code: Use a Java compiler to compile the provided source code (Calculator_AP.java).
            Run the Application: Execute the compiled Java program to launch the calculator application.
            Perform Calculations: Use the buttons on the calculator interface to input numbers, select operations, and view results.
            Explore Special Functions: Experiment with the special functions to discover additional mathematical capabilities.
            Clear and Delete: Use the clear button to reset the calculator display, and the delete button to remove individual digits or characters.
    

#### III.  CODE EXPLANATION

     package CodeTechITSolution;

     import javax.swing.*;
     import java.awt.*;
     import java.awt.event.*;
     import static java.lang.Math.sqrt;

     /**
     * Calculator_AP class represents a simple calculator application.
     * It implements the ActionListener interface to handle button click events.
     */
     public class Calculator_AP implements ActionListener {
     // Declaration of GUI components
     JFrame frame;
     JTextField tf;
     JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bDEL, b0, bSQR, bROOT, bCLEAR, bEQUALS, bDOT, bDIV, bMUL, bADD, bSUB, bSIN, bCOS, bTAN, bLOG;
     // Variables to store operands, result, and operator
     double num1 = 0;
     double num2 = 0;
     double result = 0;
     char operator;
     double a;

     /**
      * Constructor for Calculator_AP class.
      * Initializes the GUI components and sets up the frame.
      */Calculator_AP() {
        frame = new JFrame();
        tf = new JTextField();
        tf.setBounds(55, 45, 440, 40);
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setEditable(false);

         // Adding buttons to the frame
         // ... (button initialization code)

         // Adding action listeners to the buttons
         // ... (button action listener registration code)

         // Setting frame properties
         // ... (frame properties setup)

         // Making the frame visible
         frame.setVisible(true);
         }

        /**
        * Main method to create an instance of the Calculator_AP class.
        */
        public static void main(String args[]) {
        new Calculator_AP();
        }

        /**
         * ActionPerformed method to handle button click events.
         * @param ex ActionEvent object representing the button click event.
        */
        public void actionPerformed(ActionEvent ex) {
        // Handling button click events
        // ... (button click event handling code)
        }
        }

#### IV.  CONCLUSION
In conclusion, the Simple Calculator Application offers a user-friendly and versatile tool for performing various mathematical calculations.
With support for basic arithmetic operations, special functions, error prevention, and a clean interface, our calculator provides users with
a reliable solution for their everyday mathematical needs. Whether you're performing simple addition or exploring more complex trigonometric
functions, our calculator aims to streamline the calculation process and provide accurate results. The convenience, accuracy, and accessibility 
of our calculator make it a valuable asset for students, professionals, and anyone in need of a quick and reliable calculation tool.

We invite users to explore the features of our calculator, experiment with different functions, and provide feedback for future improvements. Your input is invaluable in helping us enhance the functionality and usability of the Simple Calculator Application.
