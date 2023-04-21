<?php

// function to check the strength of the password
function check_password($password)
{
    // add code here to check the strength of the password
    // and return a value based on its strength
}

// declare a variable to store the password
$pass = "";

// prompt the user to enter a password and read it from input
echo "Enter Your Password to Check Strength: ";
$pass = readline();

// get the length of the password
$len = strlen($pass);

// check if the length of the password is less than 8 characters
if ($len < 8)
{
    echo "At least enter 8 characters.\n";
}
// check if the length of the password is exactly 8 characters
else if ($len == 8)
{
    echo "Updated...\n";
}
// handle the case where the length of the password is greater than 8 characters
else
{
    echo "Memory out of range.\n";
}

// initialize variables to keep track of the presence of uppercase letters,
// lowercase letters, symbols, and digits in the password
$has_upper = false;
$has_lower = false;
$has_symbol = false;
$has_digit = false;

// loop through each character in the password
for ($i = 0; $i < $len; $i++)
{
    // check if the current character is an uppercase letter
    if (ctype_upper($pass[$i]))
    {
        $has_upper = true;
    }
    // check if the current character is a lowercase letter
    else if (ctype_lower($pass[$i]))
    {
        $has_lower = true;
    }
    // check if the current character is a symbol
    else if (strpos("!#$&'()*+,-./:;<=>?@[]^_`{|}~", $pass[$i]) !== false)
    {
        $has_symbol = true;
    }
    // check if the current character is a digit
    else if (ctype_digit($pass[$i]))
    {
        $has_digit = true;
    }
}

// check if the password meets the criteria for a strong password
while ($len > 8)
{
    echo "Your Password is Too Long....\n";
    break;
}
while ($len < 8)
{
    echo "You Password is too Short .....\n";
    break;
}
while ($len == 8)
{
    if ($has_upper && $has_symbol && $has_lower && $has_digit)
    {
        echo "Password is strong - You can login!\n";
    }
    else
    {
        echo "Pls Enter with special char..\n";
    }
    break;
}

// return 0 to indicate successful program execution
exit(0);
?>
