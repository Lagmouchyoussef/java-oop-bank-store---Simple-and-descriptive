# 🎓 Java Object-Oriented Programming

## Complete Guide for Beginners - EMSI TP2

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=35&color=2ECC71&center=true&vCenter=true&width=600&lines=Java+OOP+Bank+%26+Store" alt="Java OOP Project">
</p>

<p align="center">
  <a href="https://www.java.com/">
    <img src="https://img.shields.io/badge/Java-17%2B-blue?logo=java&logoColor=white&style=for-the-badge" alt="Java">
  </a>
  <a href="https://github.com/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive/stargazers">
    <img src="https://img.shields.io/github/stars/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge&logo=github" alt="Stars">
  </a>
  <a href="https://github.com/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive/forks">
    <img src="https://img.shields.io/github/forks/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge&logo=github" alt="Forks">
  </a>
  <a href="https://github.com/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive/issues">
    <img src="https://img.shields.io/github/issues/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge" alt="Issues">
  </a>
  <a href="https://github.com/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive/blob/master/LICENSE">
    <img src="https://img.shields.io/github/license/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge" alt="License">
  </a>
</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,idea,eclipse,vscode,git,github" alt="Tech Stack">
</p>

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&text=Welcome+to+Java+OOP+Project&height=150&animation=fadeIn&fontAlignY=35" width="100%" alt="Banner">
</p>

---

## 📑 Table of Contents

1. [What is This Project?](#what-is-this-project)
2. [Prerequisites](#prerequisites)
3. [Installation Guide](#installation-guide)
4. [Understanding the Code](#understanding-the-code)
5. [UML Diagrams](#uml-diagrams)
6. [How to Run](#how-to-run)
7. [Step-by-Step Tutorial](#step-by-step-tutorial)
8. [Code Explanation](#code-explanation)
9. [Key Concepts](#key-concepts)
10. [FAQ](#faq)

---

## ❓ What is This Project?

This is a **Java Object-Oriented Programming** project created for learning purposes at EMSI Casablanca. It contains two complete applications:

### 🏦 Application 1: Bank Account Management

<p align="center">
  <img src="https://raw.githubusercontent.com/nicola-mazzon/nicola-mazzon/main/assets/bank.gif" width="100" alt="Bank Icon">
</p>

A complete banking system that allows:

| Feature | Description |
|---------|-------------|
| ✅ | Creating bank accounts |
| ✅ | Depositing money |
| ✅ | Withdrawing money |
| ✅ | Setting overdraft limits |
| ✅ | Tracking debtor accounts |

### 🛒 Application 2: Store Inventory Management

<p align="center">
  <img src="https://raw.githubusercontent.com/nicola-mazzon/nicola-mazzon/main/assets/shopping-cart.gif" width="100" alt="Store Icon">
</p>

A store management system that handles:

| Feature | Description |
|---------|-------------|
| ✅ | Creating articles/products |
| ✅ | Restocking inventory |
| ✅ | Selling products |
| ✅ | Calculating prices with tax |

---

## 📦 Prerequisites

Before starting, you need to install these tools:

| Tool | Version | Purpose | Download |
|------|---------|---------|----------|
| **Java JDK** | 17 or higher | Programming language | [Download](https://www.oracle.com/java/technologies/downloads/) |
| **IDE** | Any | Code editor (VS Code recommended) | [Download](https://code.visualstudio.com/) |

### ⚠️ Important: Java Installation Check

After installing Java, verify it works:

```bash
# Open terminal/command prompt and type:
java -version
```

You should see something like:
```
java version "17.0.x"
Java(TM) SE Runtime Environment (build 17.0.x+...)
```

---

## 💾 Installation Guide

### Step 1: Download the Project

Click the green **"Code"** button → **"Download ZIP"**

### Step 2: Extract the ZIP File

Right-click the downloaded file → **"Extract All"** → Choose a location (e.g., Desktop)

### Step 3: Open in IDE

#### Option A: Using VS Code (Recommended for Beginners)

1. Open VS Code
2. Click **File** → **Open Folder**
3. Select the extracted folder
4. Install the "Java Extension Pack" when prompted

#### Option B: Using IntelliJ IDEA

1. Open IntelliJ IDEA
2. Click **File** → **Open**
3. Select the folder
4. Wait for indexing to complete

#### Option C: Using Eclipse

1. Open Eclipse
2. Click **File** → **Import** → **Existing Projects into Workspace**
3. Select the folder
4. Click **Finish**

---

## 📊 UML Diagrams

### Class Diagram: Bank Account System

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           BANK ACCOUNT SYSTEM                                │
└─────────────────────────────────────────────────────────────────────────────┘

    ┌──────────────────────┐           ┌──────────────────────┐
    │      Personne        │           │   CompteBancaire     │
    ├──────────────────────┤           ├──────────────────────┤
    │ - lastName: String   │           │ - code: String       │
    │ - firstName: String  │◄──────────│ - owner: Personne   │
    ├──────────────────────┤  1       1 │ - balance: BigDecimal│
    │ + getLastName()      │───────────→│ - overdraft: BigDecimal│
    │ + getFirstName()     │           │ - numberOfDebtorAccounts : int │
    │ + Personne()         │           ├──────────────────────┤
    └──────────────────────┘           │ + deposit()          │
                                         │ + withdraw()         │
                                         │ + authorizeOverdraft()│
                                         │ + isDebtor()          │
                                         │ + getBalance()        │
                                         │ + getOwner()          │
                                         │ + getCode()           │
                                         │ + getNumberOfDebtorAccounts()│
                                         └──────────────────────┘
```

### Class Diagram: Store Inventory System

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                         STORE INVENTORY SYSTEM                              │
└─────────────────────────────────────────────────────────────────────────────┘

    ┌──────────────────────┐
    │       Article        │
    ├──────────────────────┤
    │ - reference: long    │
    │ - description: String│
    │ - priceExclTax: double│
    │ - stock: int         │
    ├──────────────────────┤
    │ + restock()          │
    │ + sell()             │
    │ + priceInclTax()     │
    │ + salePriceInclTax() │
    │ + toString()         │
    │ + equals()           │
    │ + hashCode()         │
    └──────────────────────┘
```

### Object Relationship Diagram

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                          HOW OBJECTS RELATE                                  │
└─────────────────────────────────────────────────────────────────────────────┘

    MAIN METHOD                    MAIN METHOD
    (Banque)                       (Magasin)
         │                              │
         ▼                              ▼
┌─────────────────┐           ┌─────────────────┐
│CompteBancaire  │           │    Article[]   │
├─────────────────┤           ├─────────────────┤
│ code: "C001"   │           │ [0] Article     │
│ owner───────────┼───►Personne│ reference: 1  │
│ balance: 1000  │           │ description:    │
│ overdraft: 200 │           │   "Smartphone"  │
└─────────────────┘           │ priceExclTax:   │
                               │   500.00        │
                               │ stock: 10       │
                               └─────────────────┘
```

---

## 🚀 How to Run

### Method 1: Using Command Line

#### Compile the Project:

```bash
# Navigate to project directory
cd path/to/JavaProject

# Compile Bank module
javac -d out src/ma/emsi/projets/banque/*.java

# Compile Store module
javac -d out src/ma/emsi/projets/magasin/*.java
```

#### Run Bank Application:

```bash
java -cp out ma.emsi.projets.banque.CompteBancaire
```

#### Run Store Application:

```bash
java -cp out ma.emsi.projets.magasin.Article
```

### Method 2: Using IDE (VS Code)

1. Open the file you want to run:
   - [`CompteBancaire.java`](src/ma/emsi/projets/banque/CompteBancaire.java) for Bank
   - [`Article.java`](src/ma/emsi/projets/magasin/Article.java) for Store
2. Press **F5** or click the **Run** button

### Method 3: Using IntelliJ IDEA

1. Right-click on the file
2. Select **Run 'CompteBancaire.main()'**
3. Or press **Shift + F10**

---

## 📖 Step-by-Step Tutorial

### 🎓 Exercise 1: Understanding the Store Module

#### Step 1: What is an Article?

An **Article** (or Product) represents an item in a store. It has:

- **Reference**: Unique ID (like a barcode)
- **Description**: What is it?
- **Price**: How much does it cost?
- **Stock**: How many do we have?

#### Step 2: Create an Article

```java
// Create a new smartphone product
Article smartphone = new Article(
    1001,              // reference (ID)
    "iPhone 15",       // description
    799.99,           // price without tax
    50                // 50 units in stock
);
```

#### Step 3: Sell a Product

```java
// Sell 3 smartphones
boolean success = smartphone.sell(3);

if (success) {
    System.out.println("Sale completed!");
    System.out.println("Remaining stock: " + smartphone.getStock());
} else {
    System.out.println("Not enough stock!");
}
```

#### Step 4: Restock Products

```java
// Add 10 more smartphones to stock
smartphone.restock(10);
System.out.println("New stock: " + smartphone.getStock());
```

#### Step 5: Calculate Price with Tax

```java
// Get price including 10% tax
double priceWithTax = smartphone.priceInclTax();
System.out.println("Price with tax: $" + priceWithTax);

// Get total for multiple units
double totalFor5 = smartphone.salePriceInclTax(5);
System.out.println("Price for 5 units: $" + totalFor5);
```

---

### 🎓 Exercise 2: Understanding the Bank Module

#### Step 1: What is a Bank Account?

A **CompteBancaire** (Bank Account) needs:

- **Code**: Account number
- **Owner**: Who owns it (a Person)
- **Balance**: How much money (can be negative!)
- **Overdraft**: Allowed negative balance limit

#### Step 2: Create a Person

```java
// Create an account owner
Personne owner = new Personne("Smith", "John");
// This creates: Smith John
```

#### Step 3: Create a Bank Account

```java
// Create a new bank account
CompteBancaire account = new CompteBancaire(
    "ACC-001",        // account code
    owner,            // the owner we created
    BigDecimal.valueOf(1000)  // initial balance: $1000
);
```

#### Step 4: Deposit Money

```java
// Add $500 to the account
account.deposit(BigDecimal.valueOf(500));
System.out.println("New balance: " + account.getBalance());
// Result: 1500
```

#### Step 5: Withdraw Money

```java
// Try to withdraw $200
boolean success = account.withdraw(BigDecimal.valueOf(200));

if (success) {
    System.out.println("Withdrawal successful!");
    System.out.println("New balance: " + account.getBalance());
} else {
    System.out.println("Insufficient funds!");
}
```

#### Step 6: Set Overdraft

```java
// Allow up to $500 overdraft
account.authorizeOverdraft(BigDecimal.valueOf(500));
System.out.println("Overdraft limit: " + account.getOverdraft());
```

#### Step 7: Check if Account is in Debt

```java
// Check if account has negative balance
if (account.isDebtor()) {
    System.out.println("⚠️ Account is in debt!");
} else {
    System.out.println("✅ Account is healthy");
}
```

---

## 🔍 Code Explanation

### Article.java - Line by Line

```java
package ma.emsi.projets.magasin;  // Package: where this file belongs

import java.util.Objects;        // Import: needed for hashCode()
import java.util.Scanner;        // Import: needed for user input

public class Article {          // CLASS: blueprint for articles
    
    // ATTRIBUTES: data that each article has
    private long reference;              // Unique ID
    private String description;          // What is it?
    private double priceExclTax;         // Price without tax
    private int stock;                   // How many in stock?

    // CONSTRUCTOR: how to create a new article
    public Article(long reference, String description, 
                   double priceExclTax, int stock) {
        this.reference = reference;      // "this" distinguishes from parameter
        this.description = description;
        this.priceExclTax = priceExclTax;
        this.stock = stock;
    }

    // METHOD: add stock
    public void restock(int numberOfUnits) {
        this.stock += numberOfUnits;      // Add to current stock
    }

    // METHOD: sell (decrease stock if available)
    public boolean sell(int numberOfUnits) {
        if (numberOfUnits <= this.stock) {    // Enough stock?
            this.stock -= numberOfUnits;       // Decrease stock
            return true;                       // Sale successful
        }
        return false;                          // Not enough stock
    }

    // METHOD: calculate price with 10% tax
    public double priceInclTax() {
        return this.priceExclTax * 1.10;       // Add 10%
    }
}
```

### CompteBancaire.java - Key Concepts

```java
// ATTRIBUTE with STATIC modifier
private static int numberOfDebtorAccounts = 0;
// ⚠️ "static" means this belongs to the CLASS, not to objects
// All accounts share this counter

// CONSTRUCTOR with DEFAULT value
public CompteBancaire(String code, Personne owner) {
    this(code, owner, BigDecimal.ZERO);  // Call another constructor
}

// OVERDRAFT management
public void authorizeOverdraft(BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) > 0) {  // Must be positive
        this.overdraft = amount;
    }
}
```

---

## 🧠 Key OOP Concepts Explained

### 1. 🏗️ Classes and Objects

```
CLASS = Blueprint / Template
OBJECT = Actual thing created from blueprint

Class Article     →  Object: iPhone, Samsung, etc.
Class Personne    →  Object: John, Marie, etc.
Class CompteBancaire → Object: John's account, etc.
```

### 2. 🔒 Encapsulation

```
┌─────────────────────────────────────────┐
│           ENCAPSULATION                 │
├─────────────────────────────────────────┤
│  private: Only visible INSIDE the class │
│  public:  Visible EVERYWHERE            │
├─────────────────────────────────────────┤
│  Example:                               │
│                                         │
│  private int balance;  ← Cannot access  │
│           directly!                     │
│                                         │
│  public void deposit() ← CAN use this  │
│                                         │
│  WHY? Protect data from wrong changes! │
└─────────────────────────────────────────┘
```

### 3. 🔄 Constructors

```
CONSTRUCTOR = Special method to CREATE an object

// No-argument constructor
public Article() { }

// Constructor with parameters
public Article(long ref, String desc) {
    this.reference = ref;
    this.description = desc;
}
```

### 4. 📊 Static vs Instance

```
INSTANCE METHOD (regular):
- Called on an OBJECT
- Can access INSTANCE variables
- Example: account.deposit()

STATIC METHOD:
- Called on the CLASS
- Cannot access instance variables
- Example: CompteBancaire.getNumberOfDebtorAccounts()

STATIC VARIABLE:
- Shared by ALL objects of the class
- Example: numberOfDebtorAccounts
```

### 5. 🔁 Method Overriding

```java
// Every class has these by default:
toString()    → Returns text representation
equals()      → Checks if objects are equal
hashCode()     → Unique number for object

// We can OVERRIDE (replace) them:
@Override
public String toString() {
    return "Article{" + "reference=" + reference + '}';
}
```

---

## ❓ FAQ

### Q1: What is OOP?

**A:** Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code.

### Q2: Why use BigDecimal for money?

**A:** `BigDecimal` provides precise decimal calculations without floating-point errors. It's essential for financial applications.

### Q3: What is encapsulation?

**A:** Encapsulation is the concept of bundling data (attributes) and methods together while restricting direct access to some components.

### Q4: What is a static variable?

**A:** A static variable is shared among all objects of a class. There's only one copy regardless of how many objects are created.

### Q5: How do I run this project?

**A:** See the [How to Run](#how-to-run) section above for detailed instructions.

---

## 📂 Project Structure

```
📦 Java OOP Bank & Store
├── 📂 src/
│   ├── 📂 ma/emsi/projets/
│   │   ├── 📂 banque/
│   │   │   ├── 💰 CompteBancaire.java    # Bank account class
│   │   │   └── 👤 Personne.java          # Person class
│   │   └── 📂 magasin/
│   │       └── 📦 Article.java           # Product/Article class
│   └── 🚀 Main.java                       # Entry point
├── 📄 README.md                            # Documentation
├── 📦 TP2.iml                             # IntelliJ project file
└── 📜 .gitignore                          # Git ignore rules
```

---

## 🔐 OOP Concepts Used

<p align="center">
  <img src="https://img.shields.io/badge/Classes-✓-green?style=for-the-badge" alt="Classes">
  <img src="https://img.shields.io/badge/Objects-✓-blue?style=for-the-badge" alt="Objects">
  <img src="https://img.shields.io/badge/Encapsulation-✓-purple?style=for-the-badge" alt="Encapsulation">
  <img src="https://img.shields.io/badge/Constructors-✓-orange?style=for-the-badge" alt="Constructors">
  <img src="https://img.shields.io/badge/Static%20Members-✓-red?style=for-the-badge" alt="Static Members">
  <img src="https://img.shields.io/badge/Getters%2FSetters-✓-yellow?style=for-the-badge" alt="Getters/Setters">
</p>

| Concept | Implementation |
|---------|----------------|
| **Classes & Objects** | `Personne`, `CompteBancaire`, `Article` |
| **Encapsulation** | `private` attributes with public getters/setters |
| **Constructors** | Multiple constructors with default values |
| **Static Members** | `numberOfDebtorAccounts` counter |
| **Data Types** | `BigDecimal` for precise financial calculations |

---

## 👨‍💻 Author

<p align="center">
  <a href="https://github.com/Lagmouchyoussef">
    <img src="https://img.shields.io/badge/GitHub-Lagmouchyoussef-181717?style=for-the-badge&logo=github" alt="GitHub">
  </a>
  <a href="https://www.emsi.ma/">
    <img src="https://img.shields.io/badge/EMSI-Casablanca-orange?style=for-the-badge" alt="EMSI">
  </a>
</p>

---

## 📄 License

<p align="center">
  <img src="https://img.shields.io/github/license/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge" alt="License">
</p>

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- **EMSI Casablanca** - For the excellent curriculum
- **Java Documentation** - For comprehensive resources
- **Open Source Community** - For inspiration and tools

---

<p align="center">
  <strong>⭐ Don't forget to star this repo if you found it useful!</strong>
</p>

<p align="center">
  <img src="https://komarev.com/ghpvc/?username=Lagmouchyoussef&repo=java-oop-bank-store---Simple-and-descriptive&label=Project+Views&style=flat-square&color=success" alt="Profile Views">
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=rect&color=0:3498db,100:8e44ad&height=2&text=Developed+with+❤️+by+Youssef+Lagmouch+-+EMSI+3IIR+G9+G92" width="100%" alt="Footer">
</p>

---

<div align="center">

### 🎉 Thank you for visiting this repository!

> **📚 Learning Objective:** Master Object-Oriented Programming (OOP) fundamentals through practical Java exercises.
> 
> **🎯 Target Audience:** Complete beginners with zero programming knowledge.

</div>
