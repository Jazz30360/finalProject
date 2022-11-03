  import java.util.Scanner;

    public class LoginMain {

        public static void main(String[] args) {

            String Username;
            String Password;

            Password = "password";
            Username = "Rattler123";

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();

            if (username.equals(Username) && password.equals(Password)) {

                System.out.println("Welcome!");
            }

            else if (username.equals(Username)) {
                System.out.println("Password not valid!");
            } else if (password.equals(Password)) {
                System.out.println("Username not valid!");
            } else {
                System.out.println("Username & Password are not valid!");
            }

        }