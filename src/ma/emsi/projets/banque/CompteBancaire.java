package ma.emsi.projets.banque;

import java.math.BigDecimal;
import java.util.Scanner;

public class CompteBancaire {
    private String code;
    private Personne owner;
    private BigDecimal balance;
    private BigDecimal overdraft;
    private static int numberOfDebtorAccounts = 0;

    public CompteBancaire(String code, Personne owner) {
        this(code, owner, BigDecimal.ZERO);
    }


    public CompteBancaire(String code, Personne owner, BigDecimal initialBalance) {
        this.code = code;
        this.owner = owner;
        if (initialBalance.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = BigDecimal.ZERO;
        }
        this.overdraft = BigDecimal.ZERO;
    }

    
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            boolean wasNegative = this.balance.compareTo(BigDecimal.ZERO) < 0;
            this.balance = this.balance.add(amount);
            boolean isPositive = this.balance.compareTo(BigDecimal.ZERO) >= 0;

            if (wasNegative && isPositive) {
                numberOfDebtorAccounts--;
            }
        }
    }

    public boolean withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) return false;

        BigDecimal availableBalance = this.balance.add(this.overdraft);
        if (amount.compareTo(availableBalance) <= 0) {
            boolean wasPositive = this.balance.compareTo(BigDecimal.ZERO) >= 0;
            this.balance = this.balance.subtract(amount);
            boolean isNegative = this.balance.compareTo(BigDecimal.ZERO) < 0;

            if (wasPositive && isNegative) {
                numberOfDebtorAccounts++;
            }
            return true;
        }
        return false;
    }

    public String getCode() {
        return code;
    }

    public Personne getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getOverdraft() {
        return overdraft;
    }

    public void authorizeOverdraft(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.overdraft = amount;
        }
    }

    public static int getNumberOfDebtorAccounts() {
        return numberOfDebtorAccounts;
    }

    public static void setNumberOfDebtorAccounts(int number) {
        numberOfDebtorAccounts = number;
    }

    public boolean isDebtor() {
        return this.balance.compareTo(BigDecimal.ZERO) < 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompteBancaire account = null;

        System.out.println("=== Bank Account Management System ===\n");

        // Account creation
        System.out.println("Creating a new bank account");
        System.out.print("Enter the owner's last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the owner's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the account code: ");
        String code = scanner.nextLine();
        System.out.print("Enter the initial balance (or 0): ");
        BigDecimal initialBalance = new BigDecimal(scanner.nextLine());

        Personne owner = new Personne(lastName, firstName);
        account = new CompteBancaire(code, owner, initialBalance);

        System.out.println("\nAccount created successfully!");
        System.out.println("Owner: " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
        System.out.println("Code: " + account.getCode());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();

        // Main menu
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Authorize overdraft");
            System.out.println("4. Check balance");
            System.out.println("5. Check if account is in debt");
            System.out.println("6. Display number of debtor accounts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    BigDecimal depositAmount = new BigDecimal(scanner.nextLine());
                    account.deposit(depositAmount);
                    System.out.println("Deposit completed. New balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    BigDecimal withdrawalAmount = new BigDecimal(scanner.nextLine());
                    boolean withdrawalSuccessful = account.withdraw(withdrawalAmount);
                    if (withdrawalSuccessful) {
                        System.out.println("Withdrawal completed. New balance: " + account.getBalance());
                    } else {
                        System.out.println("Withdrawal denied. Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the overdraft amount: ");
                    BigDecimal overdraftAmount = new BigDecimal(scanner.nextLine());
                    account.authorizeOverdraft(overdraftAmount);
                    System.out.println("Authorized overdraft: " + account.getOverdraft());
                    break;

                case 4:
                    System.out.println("Current balance: " + account.getBalance());
                    System.out.println("Authorized overdraft: " + account.getOverdraft());
                    break;

                case 5:
                    if (account.isDebtor()) {
                        System.out.println("The account is in debt (negative balance).");
                    } else {
                        System.out.println("The account is not in debt.");
                    }
                    break;

                case 6:
                    System.out.println("Total number of debtor accounts: " + CompteBancaire.getNumberOfDebtorAccounts());
                    break;

                case 7:
                    continueLoop = false;
                    System.out.println("\n=== Final Summary ===");
                    System.out.println("Owner: " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
                    System.out.println("Account code: " + account.getCode());
                    System.out.println("Final balance: " + account.getBalance());
                    System.out.println("Authorized overdraft: " + account.getOverdraft());
                    System.out.println("Account in debt: " + account.isDebtor());
                    System.out.println("\nThank you for using the bank management system!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
