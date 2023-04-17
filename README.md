# Password Strength Checker

This is a simple password strength checker program written in C. The program takes user input for a password and checks its strength based on the following criteria:

- The length of the password should be at least 8 characters.
- The password should contain at least one uppercase letter, one lowercase letter, one symbol, and one digit.

## Getting Started

To use this program, you need to have a C compiler installed on your system. You can compile and run the program using a terminal or command prompt.

### Prerequisites

- C compiler (GCC, Clang, etc.)
- Command prompt or terminal

### Running the Program

1. Open a terminal or command prompt and navigate to the directory containing the source code file.
2. Compile the code using the following command: `gcc -o password_strength_checker password_strength_checker.c`
3. Run the program using the following command: `./password_strength_checker`
4. Enter a password to check its strength.

## How it Works

The program first takes a user input for a password. It then checks the length of the password and prints a message if it is less than 8 characters or exactly 8 characters long.

Next, the program checks the password for the presence of at least one uppercase letter, one lowercase letter, one symbol, and one digit using the `strchr()` function from the `<string.h>` library.

If the password meets all the strength criteria, the program prints a message indicating that the password is strong and the user can log in. Otherwise, it prints a message indicating that the password is weak and the user should make it stronger.

## Author

This program was written by `@mr_introverrt`.
