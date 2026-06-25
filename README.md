# Banking System 

## Phase 1: Basic Banking System

#### Features:

- Create account
- Deposit money
- Withdraw money
- Check balance
- Classes

#### Classes: 

-  Account
-  Bank
-  Main

## Phase 2: Multiple Accounts

#### Store accounts in an ArrayList. 

#### Add methods: 

- createAccount()
- findAccount()
- deposit()
- withdraw()

#### Covered Concepts:

- ArrayList
- Loops
- Searching
- Encapsulation

## Phase 3: Add Transaction History

#### Feature: 

- Create a transaction
- Store transaction

#### Covered Concepts:

- Object composition
- Nested collections

## Phase 4: Savings and Checkings Accounts

#### Use inheritance from Account to Savings/Checkings

#### Concepts Covered:

- Inheritance
- Polymorphism

## Phase 5: Transfer Money

#### Concepts Covered:

- Object interaction
- Business logic

## Phase 6: Save Data to Files

#### Save to file when application closes

#### Concepts Covered:

- File I/O
- Peresistence

## Phase 7: Custom Exceptions

#### Create: ```InsufficientFundsException```

#### Concepts Covered:

- Exception handling
- Custom exceptions

## Phase 8: Streams and Reports

- Total money in bank
- Biggest customer

#### Concepts Covered:

- Streams
- Lambdas
- Functional programming


# Project Structure

```
bankingsystem/

src/
  Main.java
  Bank.java
  Account.java
  SavingsAccount.java
  CheckingAccount.java
  Transaction.java
  InsufficientFundsException.java

data/
  accounts.txt
```

# Setup 

## Step 0: Create Project

#### Using IntelliJ IDEA

- Create New Project

![createProject](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/createProject.png)

#### Create Files in src/

- Main.java
- Bank.java
- Account.java

![createFiles](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/createFiles.png)

## Step 1: Build each class

![createClasses](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/createClasses.png)

## Step 2: Test code

![runCode](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/runCode.png)

## Step 3: Add methods 

- findAccount
- deposit
- withdraw

![addMethods](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/addMethods.png)

## Step 4: Update Menu

1. Create Account
2. View Accounts
3. Deposit
4. Withdraw
5. Exit

## Step 5: Test changes

![addMethods](https://github.com/emanuel-poblano/bankingsystem/blob/main/images/updatedMenu.png)

# Part 2: Transaction History & Custom Exceptions 

### Goal: Instead of only storing a balance, we want to track: 

- Deposits
- Withdraw

#### Concepts Covered: 

- Object Composition
- ArrayList of Objects
- Custom Exceptions
- Better OOP design

## Step 1: Create Transaction Class

#### Each transaction is now its own object

#### Instead of ```String transaction;``` we have ```Transaction transaction;```

## Step 2: Add Transaction List to Account

- Open: ```Account.java``` 
- Add: ```import java.util.ArrayList;```
- Inside Account: ```private ArrayList<Transaction> transactions;```
- Update contructor: 
```
public Account(int accountNumber,
                  String accountHolder) {
      this.accountNumber = accountNumber;
      this.accountHolder = accountHolder;
      this.balance = 0;

      transactions = new ArrayList<>();
}
```

## Step 3: Record Deposits

#### Update deposit method

## Step4: Record Withdrawals

#### Update withdraw method

## Step 5: Display Transaction History

#### Add a ```displayTransactions()``` method

## Step 6: Add View Transactions Feature

#### Add menu options:

1. Create Account
2. View Accounts
3. Deposit
4. Withdraw
5. View Transactions
6. Exit

## Step 7: Add Bank Method

#### Inside Bank.java

## Step 8: Add Menu Case

#### Inside Main.java

## Test changes

# Part 2B: Custom Exceptions

## Step 9: Create Exception Class

#### Create ```InsufficientException.java```

## Step 10: Update Withdraw Method

## Step 11: Catch Exception

# Concepts Learned 

- ## OOP / Composition
- ## Collections / ArrayList
- ## Exception Handling / try, catch, throw
- ## Custom Exceptions


