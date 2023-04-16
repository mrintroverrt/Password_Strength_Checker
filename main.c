#include <stdio.h>
#include <string.h>

// function to check the strength of the password
int check_password(char *password)
{
    // add code here to check the strength of the password
    // and return a value based on its strength
}

int main()
{
    // declare a character array to store the password
    char pass[8];

    // prompt the user to enter a password and read it from input
    printf("Enter Your Password to Check Strength: ");
    scanf("%s", pass);

    // get the length of the password
    int len = strlen(pass);

    // check if the length of the password is less than 8 characters
    if (len < 8)
    {
        printf("At least enter 8 characters.\n");
    }
    // check if the length of the password is exactly 8 characters
    else if (len == 8)
    {
        printf("Updated...\n");
    }
    // handle the case where the length of the password is greater than 8 characters
    else
    {
        printf("Memory out of range.\n");
    }

    // initialize variables to keep track of the presence of uppercase letters,
    // lowercase letters, symbols, and digits in the password
    int has_upper = 0, has_lower = 0, has_symbol = 0, has_digit = 0;

    // loop through each character in the password
    for (int i = 0; i < len; i++)
    {
        // check if the current character is an uppercase letter
        if (strchr("ABCDEFGHIJKLMNOPQRSTUVWXYZ", pass[i]) != NULL)
        {
            has_upper = 1;
        }
        // check if the current character is a lowercase letter
        else if (strchr("abcdefghijklmnopqrstuvwxyz", pass[i]) != NULL)
        {
            has_lower = 1;
        }
        // check if the current character is a symbol
        else if (strchr("!#$&'()*+,-./:;<=>?@[]^_`{|}~", pass[i]) != NULL)
        {
            has_symbol = 1;
        }
        // check if the current character is a digit
        else if (strchr("0123456789", pass[i]) != NULL)
        {
            has_digit = 1;
        }
    }

    // check if the password meets the criteria for a strong password
    if (has_upper && has_symbol && has_lower && has_digit)
    {
        printf("Password is strong - You can login!\n");
    }
    // handle the case where the password is not strong enough
    else
    {
        printf("Password is weak - Make it stronger.\n");
    }

    // return 0 to indicate successful program execution
    return 0;
}
