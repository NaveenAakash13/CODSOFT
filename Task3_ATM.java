import java.util.Scanner;

class acc{
    private double balance;
    public acc(double initial){
        this.balance = initial;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double total){
        if(total>0){
            balance+=total;
            System.out.println("Amount deposited successfully.");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn successfully.");
            return true;
        }
        else{
            System.out.println("Insufficient balance");
            return false;
        }
    }
}

class ATM{
    private acc account;
    public ATM(acc account){
        this.account=account;
    }
    public void displayMenu(){
        System.out.println("Welcome to Grayson Bank ATM. Enter a number to proceed:");
        System.out.println("1.Check Balance");
        System.out.println("2.To Deposit");
        System.out.println("3.Withdrawal");
        System.out.println("4.Exit");
    }
    public void processOption(int option){
        Scanner qq=new Scanner(System.in);
        switch(option){
            case 1:
                System.out.println("Your balance is:" + account.getBalance());
                break;
            case 2:
                System.out.println("Enter amount to deposit:");
                double depositAmount = qq.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter amount to withdraw:");
                double withdrawalAmount = qq.nextDouble();
                account.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Thank you for using Grayson Banking. Have a Nice Day!");
                System.exit(0);
            default:
                System.out.println("Invalid Option. Try Again.");
        }
    }
}

class Main{
    public static void main(String ar[]){
        acc userAccount=new acc(10000);
        ATM atm=new ATM(userAccount);
        Scanner qq=new Scanner(System.in);
        while(true){
            atm.displayMenu();
            int option = qq.nextInt();
            atm.processOption(option);
        }
    }
}