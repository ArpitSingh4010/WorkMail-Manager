# Employee Email Management System

A Java-based email account generation and management system for onboarding new employees in a corporate environment.

## 📋 Description

This application automates the process of creating corporate email accounts for new employees. It collects employee information, assigns them to departments and roles, generates secure passwords, and creates properly formatted email addresses based on the company structure.

## ✨ Features

- **User Information Collection**: Captures first name, last name, and company name
- **Department Assignment**: 11 different departments to choose from
  - Sales
  - Development
  - Accounting
  - Marketing
  - HR
  - IT
  - Customer Service
  - Finance
  - Legal
  - Operations
  - R&D
- **Role-Based Assignment**: 6-7 specific roles for each department
- **Automated Email Generation**: Creates email in format: `firstname.lastname.department@company.com`
- **Secure Password Generation**: Randomly generates 10-character passwords with alphanumeric and special characters
- **Mailbox Configuration**: Default 500MB mailbox capacity
- **Account Information Display**: Shows complete employee account details

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line/terminal access

### Installation

1. Clone or download this repository
2. Navigate to the project directory:
```bash
cd "Email Administration"
```

### Compilation

Compile all Java files:
```bash
cd emailApp
javac *.java
```

### Running the Application

From the parent directory:
```bash
cd ..
java emailApp.EmailApp
```

Or with a single command from the emailApp directory:
```bash
cd emailApp
javac *.java && cd .. && java emailApp.EmailApp
```

## 💻 Usage

1. **Enter Employee Details**: 
   - First Name
   - Last Name
   - Company Name

2. **Select Department**: Choose from 11 available departments (1-11)

3. **Select Role**: Choose a role specific to the selected department

4. **Review Generated Information**:
   - Display Name
   - Role
   - Department
   - Company Email
   - Mailbox Capacity
   - Auto-generated Password

### Example Output

```
Enter First Name: John
Enter Last Name: Doe
Enter Company Name: TechCorp

New Worker: John Enter the department code:
1 for Sales
2 for Development
3 for Accounting
4 for Marketing
5 for HR
6 for IT
7 for Customer Service
8 for Finance
9 for Legal
10 for Operations
11 for R&D
0 for none
Enter department code: 2

Enter Development role code:
1 for Junior Developer
2 for Developer
3 for Senior Developer
4 for Lead Developer
5 for Software Architect
6 for Engineering Manager
7 for VP of Engineering
0 for none
Enter role code: 3

Your password is: aB3$xK9@mP
Your email is: john.doe.development@techcorp.com

DISPLAY NAME : John Doe
ROLE : SeniorDev
DEPARTMENT : Development
COMAPNY EMAIL : john.doe.development@techcorp.com
ALTERNATE EMAIL : null
MAXIMUM CAPACITY : 500mb
```

## 📁 Project Structure

```
Email Administration/
│
├── README.md
└── emailApp/
    ├── Email.java          # Email class with account management logic
    └── EmailApp.java       # Main application entry point
```

## 🔧 Features Breakdown

### Email.java
- Employee information management
- Department and role selection logic
- Random password generation (10 characters)
- Email address formatting
- Getter/setter methods for account properties
- Account information display

### EmailApp.java
- User input handling
- Application flow control
- Email object instantiation

## 🎯 Department-Specific Roles

Each department has tailored roles ranging from entry-level to executive positions:

- **Sales**: Sales Rep → VP of Sales
- **Development**: Junior Dev → VP of Engineering
- **IT**: IT Support → CTO
- **Finance**: Financial Analyst → CFO
- And more...

## 🔐 Security Features

- **Random Password Generation**: 10-character passwords using:
  - Lowercase letters (a-z)
  - Uppercase letters (A-Z)
  - Numbers (0-9)
  - Special characters (!@#$%)

## 🛠️ Customization

You can easily customize:
- **Password Length**: Modify `defaultPasswordLength` in Email.java
- **Mailbox Capacity**: Change `mailboxCapacity` default value
- **Email Domain**: Modify email generation logic
- **Add Departments**: Extend `setDepartment()` method
- **Add Roles**: Extend `setRole()` method

## 📝 Future Enhancements

- Database integration for storing employee records
- Email validation
- Multiple employee batch processing
- Export to CSV/Excel
- GUI interface
- Integration with actual email servers
- Password strength validation
- Department hierarchy management

## 👨‍💻 Author

Created as a Java learning project for employee email administration.

## 📄 License

This project is open source and available for educational purposes.

---

**Note**: This is a simulation project for learning purposes. It does not actually send emails or create real email accounts.
