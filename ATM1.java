import java.util.Scanner;
class ATM{
    Scanner scanner = new Scanner(System.in);
    //we have inserted the values already because we are not connected it with the database
    //so , you can assume that 'ATM' is a databse itself where all work done
    double Balance = 50204.2;
    int PIN = 4040;
    //we could have used a 'constructor' to take input the PIN from user when the object creates ...
    //but the constructor will not run as there are many more functions inside this class
    //other functions comes as more prioriy to 'ATM' class
    public void checkPin(){
        System.out.print("Enter Your PIN :");
        int newpin = scanner.nextInt();
        if(newpin == PIN){
            menu();
        }else{
            System.out.println("Enter A Valid PIN");
        }
    }
    public void menu(){
        System.out.println("                                                                                  WELCOME TO MY BANK DASHBOARD");
        System.out.println("\n ENTER YOUR CHOICE :\n");
        System.out.println("1 . Account Balance");
        System.out.println("2 . Deposit Money");
        System.out.println("3 . Withdraw Money");
        System.out.println("4 . Exit");

        System.out.print("\nEnter Your Choice : ");
        int choice = scanner.nextInt();

        if(choice == 1){
            checkbal();
        }else if(choice == 2){
            deposit();
        }else if(choice == 3){
            withdraw();
        }else if(choice == 4){
            exit();
        }else{
            System.out.println("Please Enter A Valid Choice");
        }
        
    }

    public void checkbal(){
        System.out.println("Balance On Your Account  is : " + Balance);
        menu();
    }
    public void deposit(){
        System.out.print("Enter The Amount You Want To Deposits : ");
        int mon = scanner.nextInt();

        Balance = Balance + mon;
        System.out.println("\nDepositted Sucessfully\n");

        menu();
    }
    public void withdraw(){
        System.out.print("Enter The Amount You Want To WithDraw : ");
        int money = scanner.nextInt();

        if(money > Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance = Balance - money;
            System.out.println("\nWithdrawed Sucessfully\n");
        }

        menu();
    }

    public void exit(){
        System.out.println("\n Exiting From The System\n");
        int num = 5;
        try {
            while (num != 0) {
                System.out.print(".");
                Thread.sleep(2000);
                num--;
            }
            System.out.println();
            System.out.println("\nThank You For Choosing Us");
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
        

    
}
public class ATM1{
    public static void main(String[] args) {
        System.out.println("                                                                                         RONIT 's BANK");
        //now we need to make object of this ATM class
        ATM a = new ATM();
        a.checkPin();
    }
}