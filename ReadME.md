# Mortgage Calculator

The **Mortgage Calculator** is a Java-based application that calculates monthly mortgage payments and provides a payment schedule. It demonstrates Object-Oriented Programming (OOP) principles such as encapsulation and abstraction.

## Features
- Calculate the monthly mortgage payment based on the loan amount, annual interest rate, and loan term.
- Display a detailed payment schedule showing the remaining balance after each payment.
- Modular and reusable code structure.

## Class Overview

### `Mortgage`
The `Mortgage` class encapsulates the logic for calculating mortgage payments and balances. It includes:
- **Fields**:
  - `principal`: The loan amount.
  - `annualInterest`: The annual interest rate (in percentage).
  - `years`: The loan term in years.
- **Methods**:
  - `calculateMortgage()`: Calculates the monthly mortgage payment.
  - `calculateBalance(short numberOfPaymentsMade)`: Calculates the remaining balance after a given number of payments.
  - `printMortgage()`: Prints the monthly mortgage payment in a formatted manner.
  - `printPaymentSchedule()`: Prints the payment schedule with the remaining balance for each month.

## How to Use

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/mortgage-calculator.git
cd mortgage