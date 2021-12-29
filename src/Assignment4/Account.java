package Assignment4;

import java.util.Scanner;

public class Account extends Thread {
    private String name;
    public double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    synchronized void safeWithdraw(double amount) {
        if (amount >= getBalance()) {
            System.out.println("Before Balance" + Thread.currentThread().getName() + "Withdrawn" + getBalance());
            balance = getBalance() - amount;
            System.out.println(Thread.currentThread().getName() + "has Withdrawn" + amount + "Remaining Balance" + getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    synchronized void unsafeWithdraw(double amount) {
        if (amount >= getBalance()) {
            System.out.println("Balance Before " + Thread.currentThread().getName() + " withdrawal " + getBalance());
            balance = getBalance() - amount;
            System.out.println(Thread.currentThread().getName() + "has Withdrawn  " + amount + "Remaining Balance  " + getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Threadsafe implements Runnable {
    Account account = new Account(1000.00);

    public void run() {
        account.safeWithdraw(1000.00);
        if (account.balance < 0) {
            System.out.println("Insufficient Balance");
        }
    }
}

class ThreadUnsafe implements Runnable {
    Account account = new Account(1000.00);

    public void run() {
        account.unsafeWithdraw(1000.00);
        if (account.balance < 0) {
            System.out.println("Insufficient Balance");
        }
    }
}

class AccountOverdrawSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        while (true) {
            Threadsafe threadSafe = new Threadsafe();
            Thread thread1 = new Thread(threadSafe, "Aparna");
            Thread thread2 = new Thread(threadSafe, "Gauri");

            ThreadUnsafe threadunSafe = new ThreadUnsafe();
            Thread thread3 = new Thread(threadSafe, "Aparna");
            Thread thread4 = new Thread(threadSafe, "Gauri");


            System.out.println("1.Thread Safe Mode Demo");
            System.out.println("2.Thread UnSafe Mode Demo");
            System.out.println("3.Exit");
            System.out.println("Choose the Options");

            try {
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        thread1.start();
                        thread2.start();
                        break;
                    case 2:
                        thread3.start();
                        thread4.start();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter the valid option");
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Invalid Option");
            } finally {
                System.exit(0);
            }
        }

    }
}