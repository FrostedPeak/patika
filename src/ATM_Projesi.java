import java.util.Scanner;

public class ATM_Projesi {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int blockcount = 3, choice, check;
        double money = 5000, deposit, withdraw, limit = 1500;
        String id = "bruh", pw = "123", idg, pwg;
        boolean login = false, block = false, leave = false;

        while (!login) {
            if (block) {
                return;
            }
            System.out.print("ID : ");
            idg = input.nextLine();
            System.out.print("Password : ");
            pwg = input.nextLine();
            if (id.equals(idg)) {
                if (pw.equals(pwg)) {
                    System.out.println("LOGIN SUCCESSFUL!");
                    login = true;
                } else {
                    System.out.println("Password wrong.");
                    blockcount--;
                    System.out.println("Remaining login tries before your account gets blocked : " + blockcount);
                }
            } else {
                System.out.println("ID wrong.");
            }
            if (blockcount == 0) {
                System.out.println("Your account is now blocked. GOODBYE!");
                block = true;
            }
        }
        while (!leave) {
            System.out.println("************************************************");
            System.out.print("Welcome to your account! What do you want to do?\n1-Check Balance\n2-Deposit\n3-Withdraw Money\n4-Leave\nYour choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is : " + money);
                    System.out.println("Back to main page!");
                    Thread.sleep(1000);
                    break;
                case 2:
                    System.out.print("Great! How much money do you want to deposit?\nValue : ");
                    deposit = input.nextDouble();
                    money += deposit;
                    System.out.println("Your new balance is : " + money);
                    break;
                case 3:
                    System.out.print("How much money do you want to withdraw?\nValue : ");
                    withdraw = input.nextDouble();
                    if (withdraw>limit) {
                        System.out.println("You can't withdraw more than your daily limit. Your remaining limit for today is : " + limit);
                        break;
                    }
                    money -= withdraw;
                    limit -= withdraw;
                    System.out.println("Your new balance is : " + money);
                    System.out.println("Your remaining limit is : " + limit);
                    break;
                case 4:
                    System.out.print("Are you sure?\n1-Yes 2-No\nYour choice : ");
                    check = input.nextInt();
                    switch (check) {
                        case 1:
                            System.out.println("Have a good day! GOODBYE!");
                            login = false;
                            leave = true;
                        case 2:
                            System.out.println("Okay...");
                            break;
                        default:
                            System.out.println("You didn't made a valid choice!");
                            break;
                    }
                default:
                    System.out.println("Your didn't made a valid choice!");
            }
        }
    }
}
