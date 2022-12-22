import java.util.*;

class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        String userId = "kaustav123";
        String password = "1234";
        int txn[] = new int[100];
        int bal[] = new int[100];
        int i = 0;

        System.out.println("Enter your user id : ");
        String user = sc.nextLine();
        System.out.println("Enter your password : ");
        String pass = sc.nextLine();

        if (pass.equals(password) && user.equals(userId)) {

            while (true) {
                boolean flag = true;
                System.out.println("-----------------------------------");
                System.out.println("Enter 1 to withdraw");
                System.out.println("Enter 2 to deposit");
                System.out.println("Enter 3 to transfer");
                System.out.println("Enter 4 for transaction history");
                System.out.println("Enter 5 to quit");
                System.out.println("-----------------------------------");
                int x = sc.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("-----------WITHDRAW------------");
                        System.out.println("Enter the amount : ");
                        int with = sc.nextInt();
                        balance = balance - with;
                        txn[i] = -with;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE : " + balance);
                        break;
                    case 2:
                        System.out.println("-----------DEPOSIT------------");
                        System.out.println("Enter the amount : ");
                        int dep = sc.nextInt();
                        balance = balance + dep;
                        txn[i] = dep;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE : " + balance);
                        break;
                    case 3:
                        System.out.println("-----------TRANSFER------------");
                        System.out.println("Enter the account number : ");
                        long transferAmount = sc.nextLong();
                        System.out.println("Enter the amount : ");
                        int tr = sc.nextInt();
                        System.out.println("The amount of "+tr+" is successfully transferred to "+transferAmount);
                        balance = balance - tr;
                        txn[i] = -tr;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE : " + balance);
                        break;
                    case 4:
                        System.out.println("-----------TRANSACTION HISTORY------------");
                        System.out.println("TRANSACTION" + "   " + "BALANCE");
                        for (int j = 0; j < i; j++) {
                            System.out.println("  " + txn[j] + "    " + bal[j]);
                        }
                        System.out.println("------------------------------------------");
                        break;
                    case 5:
                        System.out.println("-----------THANKS FOR VISITING------------");
                        flag = false;
                        break;
                }

                if (flag == false)
                    break;
            }

        }

        else {
            System.out.println("Incorrect password or user Id!!");
        }
    }
}