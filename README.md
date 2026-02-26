# 🏦🛒 Java OOP Bank & Store Management System

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=30&color=2ECC71&center=true&vCenter=true&width=435&lines=Java+OOP+Project" alt="Java OOP Project">
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
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&text=🚀🚀🚀&height=100&animation=fadeIn&fontAlignY=35" width="100%" alt="Banner">
</p>

## 📋 Table of Contents

- [📖 About This Project](#-about-this-project)
- [🛠️ Tech Stack](#️-tech-stack)
- [📦 Features](#-features)
  - [🏦 Banking System](#-banking-system)
  - [🛒 Store Management](#-store-management)
- [📂 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Project](#running-the-project)
- [🔐 OOP Concepts Used](#-oop-concepts-used)
- [📊 UML Diagrams](#-uml-diagrams)
- [👨‍💻 Author](#-author)
- [📄 License](#-license)

---

## 📖 About This Project

<p align="center">
  <img src="https://komarev.com/ghpvc/?username=Lagmouchyoussef&repo=java-oop-bank-store---Simple-and-descriptive&label=Project%20Views&style=flat-square&color=success" alt="Profile Views">
</p>

This is a comprehensive **Java Object-Oriented Programming (OOP)** project developed as part of the EMSI Casablanca curriculum (TP2 - 3IIR G9 G92). 

The project demonstrates fundamental OOP principles through two complete real-world applications:

| 🎯 **Goal** | Master Object-Oriented Programming fundamentals |
|-------------|--------------------------------------------------|
| 👥 **Audience** | Beginners learning Java and OOP concepts |
| 📚 **Topics** | Classes, Objects, Encapsulation, Constructors, Static members |

---

## 🛠️ Tech Stack

<p align="center">
  <table>
    <tr>
      <td align="center" width="100">
        <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="50px" alt="Java"><br>
        <strong>Java 17+</strong>
      </td>
      <td align="center" width="100">
        <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" width="50px" alt="IntelliJ"><br>
        <strong>IntelliJ IDEA</strong>
      </td>
      <td align="center" width="100">
        <img src="https://upload.wikimedia.org/wikipedia/commons/5/51/Visual_Studio_Code.svg" width="50px" alt="VS Code"><br>
        <strong>VS Code</strong>
      </td>
      <td align="center" width="100">
        <img src="https://upload.wikimedia.org/wikipedia/commons/d/dd/Git-logo.svg" width="50px" alt="Git"><br>
        <strong>Git</strong>
      </td>
      <td align="center" width="100">
        <img src="https://upload.wikimedia.org/wikipedia/commons/2/2e/GitHub_logo_2013.svg" width="50px" alt="GitHub"><br>
        <strong>GitHub</strong>
      </td>
    </tr>
  </table>
</p>

---

## 📦 Features

### 🏦 Banking System

<p align="center">
  <img src="https://raw.githubusercontent.com/nicola-mazzon/nicola-mazzon/main/assets/bank.gif" width="80" alt="Bank Icon">
</p>

| Feature | Description |
|---------|-------------|
| ✅ | Create bank accounts with unique codes |
| ✅ | Deposit and withdraw money |
| ✅ | Set overdraft limits |
| ✅ | Track debtor accounts automatically |
| ✅ | View account balance and owner info |

### 🛒 Store Management

<p align="center">
  <img src="https://raw.githubusercontent.com/nicola-mazzon/nicola-mazzon/main/assets/shopping-cart.gif" width="80" alt="Store Icon">
</p>

| Feature | Description |
|---------|-------------|
| ✅ | Create products with reference numbers |
| ✅ | Manage inventory (restock items) |
| ✅ | Process sales transactions |
| ✅ | Calculate prices with tax (10%) |
| ✅ | Price calculations for bulk orders |

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

## 🚀 Getting Started

### Prerequisites

| Tool | Version | Download Link |
|------|---------|---------------|
| <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="20"> Java JDK | 17+ | [Download](https://www.oracle.com/java/technologies/downloads/) |
| <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" width="20"> IDE | Any | [VS Code](https://code.visualstudio.com/) or [IntelliJ](https://www.jetbrains.com/idea/) |

### Installation

```bash
# Clone the repository
git clone https://github.com/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive.git

# Navigate to project
cd java-oop-bank-store---Simple-and-descriptive

# Open in VS Code (recommended)
code .
```

### Running the Project

#### Using Command Line

```bash
# Compile the project
javac -d out src/ma/emsi/projets/banque/*.java src/ma/emsi/projets/magasin/*.java

# Run Bank Application
java -cp out ma.emsi.projets.banque.CompteBancaire

# Run Store Application
java -cp out ma.emsi.projets.magasin.Article
```

#### Using IDE

1. Open the project in your preferred IDE
2. Navigate to [`src/ma/emsi/projets/banque/CompteBancaire.java`](src/ma/emsi/projets/banque/CompteBancaire.java) or [`src/ma/emsi/projets/magasin/Article.java`](src/ma/emsi/projets/magasin/Article.java)
3. Press **F5** or click the **Run** button

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

## 📊 UML Diagrams

### 🏦 Banking System

```
┌────────────────────────────────────────────────────────────────────────┐
│                        BANK ACCOUNT SYSTEM                             │
└────────────────────────────────────────────────────────────────────────┘

    ┌─────────────────────┐           ┌──────────────────────────────┐
    │      Personne       │           │      CompteBancaire           │
    ├─────────────────────┤           ├──────────────────────────────┤
    │ - lastName: String  │           │ - code: String                │
    │ - firstName: String │◄──────────│ - owner: Personne (1..1)     │
    ├─────────────────────┤    1   1  │ - balance: BigDecimal         │
    │ + getLastName()     │───────────│ - overdraft: BigDecimal      │
    │ + getFirstName()    │           │ - numberOfDebtorAccounts: int │
    │ + toString()       │           ├──────────────────────────────┤
    └─────────────────────┘           │ + deposit(amount)            │
                                      │ + withdraw(amount): boolean  │
                                      │ + authorizeOverdraft(amount) │
                                      │ + isDebtor(): boolean        │
                                      │ + getBalance(): BigDecimal   │
                                      │ + getOwner(): Personne       │
                                      └──────────────────────────────┘
```

### 🛒 Store System

```
┌────────────────────────────────────────────────────────────────────────┐
│                       STORE INVENTORY SYSTEM                           │
└────────────────────────────────────────────────────────────────────────┘

    ┌─────────────────────────────────────────────────────────────┐
    │                           Article                            │
    ├─────────────────────────────────────────────────────────────┤
    │ - reference: long                                           │
    │ - description: String                                        │
    │ - priceExclTax: double                                      │
    │ - stock: int                                                 │
    ├─────────────────────────────────────────────────────────────┤
    │ + restock(quantity)                                          │
    │ + sell(quantity): boolean                                    │
    │ + priceInclTax(): double                                    │
    │ + salePriceInclTax(quantity): double                        │
    │ + toString(): String                                         │
    │ + equals(obj): boolean                                       │
    │ + hashCode(): int                                            │
    └─────────────────────────────────────────────────────────────┘
```

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

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=rect&color=0:3498db,100:8e44ad&height=2&text=Developed+with+❤️+by+Youssef+Lagmouch" width="100%" alt="Footer">
</p>

---

## 📄 License

<p align="center">
  <img src="https://img.shields.io/github/license/Lagmouchyoussef/java-oop-bank-store---Simple-and-descriptive?style=for-the-badge" alt="License">
</p>

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<p align="center">
  <strong>⭐ Don't forget to star this repo if you found it useful!</strong>
</p>

<p align="center">
  <img src="https://komarev.com/ghpvc/?username=Lagmouchyoussef&repo=java-oop-bank-store---Simple-and-descriptive&label=Thanks+for+visiting!&style=flat-square&color=brightgreen" alt="Visitor Count">
</p>
