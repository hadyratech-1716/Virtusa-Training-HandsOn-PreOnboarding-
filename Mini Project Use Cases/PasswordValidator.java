import java.util.Scanner;

public class PasswordValidator
{
    public static boolean validatePassword(String password)
{
    boolean hasUppercase = false;
    boolean hasLowercase = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;

    if (password.length() < 8)
    {
        System.out.println("Password too short (Minimum 8 characters)");
        return false;
    }

    for (int i = 0; i < password.length(); i++)
    {
        char ch = password.charAt(i);

        if (Character.isUpperCase(ch))
        {
            hasUppercase = true;
        }
        else if (Character.isLowerCase(ch))
        {
            hasLowercase = true;
        }
        else if (Character.isDigit(ch))
        {
            hasNumber = true;
        }
        else
        {
            hasSpecial = true;
        }
    }

    if (!hasUppercase)
        System.out.println("Missing uppercase character");

    if (!hasLowercase)
        System.out.println("Missing lowercase character");

    if (!hasNumber)
        System.out.println("Missing number");

    if (!hasSpecial)
        System.out.println("Missing special character");

    return hasUppercase &&
           hasLowercase &&
           hasNumber &&
           hasSpecial;
}




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("Safelog Password Validator");

        while (true) {
            System.out.println("Enter Password:");
            password = scanner.nextLine();

            if (validatePassword(password)) {
                System.out.println("This Password Is Valid");
                break;
            }
            else
            {
                System.out.println("This Password Is Not Valid, TRY AGAIN");
            }
        }
        scanner.close();

    }
}