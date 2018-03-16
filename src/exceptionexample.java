import java.util.Scanner;

class InvalidPassword extends RuntimeException {
     public InvalidPassword() {
          System.out.println(" hello password is incorrect");
     }
}

class InsufficientBalance extends Exception {

     public InsufficientBalance() {
          System.out.println(" hello balance is not sufficient");
     }
}

class PerformTransaction {
     public void validatePassword(int pass, String Username) {
    	 	if (pass != 123 || Username.equals("Abc")) {
              throw new InvalidPassword();
          }
     }
     
     public void transact(int balance) {
          if (balance < 500) {
              try {
                   throw new InsufficientBalance();
              } catch (InsufficientBalance e) {
              }
          }
     }
}

public class exceptionexample {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String Username = sc.nextLine();
          System.out.println(" enter password ");
          String pass = sc.nextLine();
          int password = Integer.parseInt(pass);
          PerformTransaction pt = new PerformTransaction();
          pt.validatePassword(password, Username);
          pt.transact(200);
          System.out.println(" do you want to carry out any other opertation ");
     }
}