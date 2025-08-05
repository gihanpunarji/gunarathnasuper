# 🏪 Gunrathna Store - Desktop POS Application

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white" alt="NetBeans">
  <img src="https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white" alt="SQLite">
  <img src="https://img.shields.io/badge/Swing-FF6B35?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing">
</div>

<div align="center">
  <h3>💰 A Smart Billing & Customer Credit Management System</h3>
  <p><em>Streamline your billing operations with intelligent credit tracking and sales analytics</em></p>
</div>

---

## 📋 Table of Contents

- [🎯 Overview](#-overview)
- [✨ Features](#-features)
- [🛠️ Technology Stack](#️-technology-stack)
- [📋 Prerequisites](#-prerequisites)
- [⚡ Quick Start](#-quick-start)
- [📦 Installation Guide](#-installation-guide)
- [🔧 Configuration](#-configuration)
- [🎮 Usage Guide](#-usage-guide)
- [📊 Database Schema](#-database-schema)
- [🖼️ Screenshots](#️-screenshots)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [📞 Support](#-support)

---

## 🎯 Overview

**Gunrathna Store POS** is a specialized desktop billing application designed for retail businesses that need efficient billing operations with advanced customer credit management. Built with Java Swing and powered by SQLite database, it focuses on streamlined billing processes, credit customer tracking, and comprehensive sales analytics.

### 🎪 Why Choose Gunrathna Store POS?

- 💰 **Credit Management**: Advanced customer credit tracking and payment history
- 🧾 **Smart Billing**: Fast, efficient billing system
- 📊 **Sales Analytics**: Detailed sales trends and performance insights
- 🔒 **Secure**: Local data storage with SQLite
- 🎨 **User-friendly**: Clean, intuitive billing interface
- 💡 **Focused Solution**: Streamlined for billing operations

---

## ✨ Features

### 🧾 **Billing System**
- ⚡ Quick and efficient bill generation
- 🖨️ Professional invoice printing
- 💳 Multiple payment method support (Cash, Card, Credit)
- 🔄 Bill editing and void functionality
- 📱 Receipt customization and branding

### 💳 **Customer Credit Management**
- 👥 Comprehensive credited customer database
- 💰 Real-time credit balance tracking
- 📅 Credit payment history and timeline
- ⚠️ Credit limit monitoring and alerts
- 🔔 Payment due date notifications
- 💸 Partial payment processing
- 📊 Customer creditworthiness analysis

### 📦 **Product Management**
- 🏷️ Product catalog with pricing
- 🔍 Quick product search and lookup
- 📝 Product information management
- 🏪 Category-based organization
- ➕ Easy product addition and editing
- 💰 Price management and updates

### 📈 **Sales Trends & Analytics**
- 📊 Daily, weekly, monthly sales reports
- 📈 Sales trend visualization
- 💹 Revenue tracking and analysis
- 🔝 Top-selling products identification
- 📅 Period-wise performance comparison
- 💰 Payment method analysis
- 🎯 Customer purchase pattern insights

### 📋 **Bill History Management**
- 🗂️ Complete billing history archive
- 🔍 Advanced bill search and filtering
- 📅 Date range bill retrieval
- 👤 Customer-wise bill history
- 🧾 Bill reprint functionality
- 📊 Bill status tracking (Paid/Credit/Partial)
- 📈 Historical sales data analysis

---

## 🛠️ Technology Stack

| Component | Technology | Version |
|-----------|------------|---------|
| **Programming Language** | ☕ Java | 8+ |
| **IDE** | 🔧 Apache NetBeans | 12.0+ |
| **GUI Framework** | 🖼️ Java Swing | Built-in |
| **Database** | 🗄️ SQLite | 3.36+ |
| **Database Driver** | 🔌 SQLite JDBC | 3.36+ |
| **Build Tool** | 🏗️ Maven | 3.6+ |
| **PDF Generation** | 📄 iText | 7.2+ |
| **Charts** | 📊 JFreeChart | 1.5+ |

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

### 🔧 System Requirements
- **Operating System**: Windows 10/11, macOS 10.14+, or Linux Ubuntu 18.04+
- **RAM**: Minimum 4GB (8GB recommended)
- **Storage**: 500MB free space
- **Display**: 1024x768 resolution minimum

### 💻 Software Requirements
- ☕ **Java Development Kit (JDK) 8 or higher**
- 🔧 **Apache NetBeans IDE 12.0 or higher**
- 🗄️ **SQLite 3.36 or higher** (included with JDBC driver)

---

## ⚡ Quick Start

Get up and running in under 5 minutes:

```bash
# 1. Clone the repository
git clone https://github.com/yourusername/gunrathna-store-pos.git

# 2. Navigate to project directory
cd gunrathna-store-pos

# 3. Open in NetBeans
# File → Open Project → Select gunrathna-store-pos folder

# 4. Build and run
# Right-click project → Clean and Build → Run
```

---

## 📦 Installation Guide

### Step 1: 📥 Clone the Repository

```bash
git clone https://github.com/yourusername/gunrathna-store-pos.git
cd gunrathna-store-pos
```

### Step 2: 🔧 Setup NetBeans Project

1. **Open NetBeans IDE**
2. **Import Project**:
   - Go to `File` → `Open Project`
   - Navigate to the cloned directory
   - Select `gunrathna-store-pos` folder
   - Click `Open Project`

### Step 3: 📚 Configure Dependencies

The project uses Maven for dependency management. Required dependencies:

```xml
<!-- Add to pom.xml -->
<dependencies>
    <!-- SQLite JDBC Driver -->
    <dependency>
        <groupId>org.xerial</groupId>
        <artifactId>sqlite-jdbc</artifactId>
        <version>3.36.0.3</version>
    </dependency>
    
    <!-- iText for PDF generation -->
    <dependency>
        <groupId>com.itextpdf</groupId>
        <artifactId>itext7-core</artifactId>
        <version>7.2.3</version>
    </dependency>
    
    <!-- JFreeChart for sales trends -->
    <dependency>
        <groupId>org.jfree</groupId>
        <artifactId>jfreechart</artifactId>
        <version>1.5.3</version>
    </dependency>
</dependencies>
```

### Step 4: 🗄️ Database Setup

The application will automatically create the SQLite database on first run:

```bash
# Database file location
./data/gunrathna_store.db
```

### Step 5: 🚀 Build and Run

```bash
# In NetBeans:
# 1. Right-click on project
# 2. Select "Clean and Build"
# 3. Select "Run" or press F6
```

---

## 🔧 Configuration

### 📁 Project Structure

```
gunrathna-store-pos/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/gunrathna/pos/
│   │   │   │   ├── main/           # Main application class
│   │   │   │   ├── ui/             # User interface components
│   │   │   │   │   ├── billing/    # Billing interface
│   │   │   │   │   ├── credit/     # Credit management UI
│   │   │   │   │   ├── products/   # Product management UI
│   │   │   │   │   ├── reports/    # Sales trends & reports
│   │   │   │   │   └── history/    # Bill history interface
│   │   │   │   ├── models/         # Data models
│   │   │   │   ├── database/       # Database operations
│   │   │   │   └── utils/          # Utility classes
│   │   └── resources/
│   │       ├── images/             # Application icons & images
│   │       └── config/             # Configuration files
├── data/                           # SQLite database location
├── reports/                        # Generated reports
├── receipts/                       # Printed receipts backup
└── README.md
```

### ⚙️ Application Configuration

Create `config.properties` in `src/main/resources/config/`:

```properties
# Database Configuration
db.path=./data/gunrathna_store.db
db.backup.enabled=true
db.backup.interval=24

# Application Settings
app.name=Gunrathna Store POS
app.version=1.0.0
app.theme=modern

# Billing Configuration
receipt.printer.enabled=true
receipt.logo.path=./resources/images/logo.png
receipt.footer.text=Thank you for shopping with us!

# Credit Management
credit.default.limit=50000.00
credit.alert.threshold=80
credit.payment.grace.days=30
```

---

## 🎮 Usage Guide

### 🧾 **Billing Operations**

#### Creating a New Bill
1. **Launch Application** → Click `New Bill` 📝
2. **Add Products** → Search/Select products from catalog
3. **Set Quantities** → Enter quantity for each item
4. **Apply Discounts** → Add item or bill-level discounts
5. **Choose Payment Method**:
   - 💰 Cash Payment
   - 💳 Card Payment  
   - 📋 Credit (for registered customers)
6. **Print Receipt** → Generate and print bill

#### Processing Credit Sales
1. **Select Customer** → Choose from credited customer list
2. **Create Bill** → Follow normal billing process
3. **Select Credit Payment** → Bill amount added to customer credit
4. **Update Credit Balance** → Automatic credit balance update

### 💳 **Credit Customer Management**

#### Adding New Credit Customer
```
Navigation: Main Menu → Credit Management → Add Customer

Required Information:
- 👤 Customer Name
- 📱 Contact Number
- 🏠 Address
- 💰 Credit Limit
- 📅 Payment Terms
```

#### Managing Credit Payments
1. **View Credit Customers** → List all customers with outstanding balance
2. **Select Customer** → View detailed credit history
3. **Process Payment** → Record partial or full payments
4. **Update Balance** → System automatically calculates remaining balance

### 📊 **Sales Trends & Analytics**

#### Viewing Sales Reports
```
Navigation: Main Menu → Reports → Sales Trends

Available Reports:
- 📈 Daily Sales Summary
- 📊 Weekly Performance
- 📅 Monthly Revenue Analysis
- 🏆 Top Products Report
- 💳 Payment Method Analysis
```

#### Generating Custom Reports
1. **Select Date Range** → Choose start and end dates
2. **Choose Report Type** → Select from available options
3. **Apply Filters** → Filter by customer, product, or payment method
4. **Generate Report** → View and export results

### 📋 **Bill History Management**

#### Searching Bills
```
Search Options:
- 📅 Date Range
- 🧾 Bill Number
- 👤 Customer Name
- 💰 Amount Range
- 💳 Payment Method
```

#### Bill Operations
- **View Details** → Complete bill information
- **Reprint Receipt** → Generate duplicate receipt
- **Edit Bill** → Modify bill details (if permitted)
- **Export Data** → Save bill data to CSV/PDF

---

## 📊 Database Schema

### 🗄️ Core Tables

#### Bills Table
```sql
CREATE TABLE bills (
    bill_id INTEGER PRIMARY KEY AUTOINCREMENT,
    bill_number VARCHAR(20) UNIQUE NOT NULL,
    customer_id INTEGER,
    bill_date DATE NOT NULL,
    total_amount DECIMAL(10,2) NOT NULL,
    discount_amount DECIMAL(10,2) DEFAULT 0,
    tax_amount DECIMAL(10,2) DEFAULT 0,
    final_amount DECIMAL(10,2) NOT NULL,
    payment_method VARCHAR(20) NOT NULL,
    payment_status VARCHAR(20) DEFAULT 'PAID',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Credit Customers Table
```sql
CREATE TABLE credit_customers (
    customer_id INTEGER PRIMARY KEY AUTOINCREMENT,
    customer_name VARCHAR(100) NOT NULL,
    contact_number VARCHAR(20),
    address TEXT,
    credit_limit DECIMAL(10,2) DEFAULT 0,
    current_balance DECIMAL(10,2) DEFAULT 0,
    payment_terms INTEGER DEFAULT 30,
    status VARCHAR(20) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Products Table
```sql
CREATE TABLE products (
    product_id INTEGER PRIMARY KEY AUTOINCREMENT,
    product_code VARCHAR(50) UNIQUE,
    product_name VARCHAR(200) NOT NULL,
    category VARCHAR(100),
    unit_price DECIMAL(10,2) NOT NULL,
    description TEXT,
    status VARCHAR(20) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Credit Payments Table
```sql
CREATE TABLE credit_payments (
    payment_id INTEGER PRIMARY KEY AUTOINCREMENT,
    customer_id INTEGER NOT NULL,
    payment_amount DECIMAL(10,2) NOT NULL,
    payment_date DATE NOT NULL,
    payment_method VARCHAR(20),
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES credit_customers(customer_id)
);
```

---

## 🖼️ Screenshots

### 🏠 Main Dashboard
![Main Dashboard](screenshots/dashboard.png)
*Clean and intuitive main interface with quick access to all features*

### 🧾 Billing Interface
![Billing Interface](screenshots/billing.png)
*Streamlined billing process with product search and payment options*

### 💳 Credit Management
![Credit Management](screenshots/credit_management.png)
*Comprehensive credit customer tracking and payment history*

### 📊 Sales Trends
![Sales Analytics](screenshots/sales_trends.png)
*Visual sales trends and performance analytics*

### 📋 Bill History
![Bill History](screenshots/bill_history.png)
*Complete bill history with advanced search and filtering*

---

## 🚀 Getting Started Tutorial

### Your First Bill (Step-by-Step)

#### Step 1: Launch Application
```bash
# Run the application
java -jar gunrathna-store-pos.jar
```

#### Step 2: Add Products (One-time Setup)
1. Navigate to `Product Management` 📦
2. Click `Add New Product` ➕
3. Fill in product details:
   ```
   Product Code: P001
   Product Name: Sample Product
   Category: Electronics
   Unit Price: 1500.00
   ```
4. Save the product ✅

#### Step 3: Create Your First Bill
1. Click `New Bill` from main menu 🧾
2. Add products to bill:
   - Search: Type product name/code
   - Select: Click on product
   - Quantity: Enter quantity needed
3. Review bill total 💰
4. Select payment method:
   - **Cash**: Immediate payment
   - **Credit**: For registered customers
5. Print receipt 🖨️

#### Step 4: Add Credit Customer
1. Go to `Credit Management` 💳
2. Click `Add Customer` 👤
3. Enter customer details:
   ```
   Name: John Doe
   Contact: +94771234567
   Address: Colombo 03
   Credit Limit: 25000.00
   Payment Terms: 30 days
   ```
4. Save customer ✅

#### Step 5: Process Credit Sale
1. Create new bill 🧾
2. Add products as usual
3. Select customer from dropdown 👤
4. Choose `Credit` payment method 💳
5. Bill amount automatically added to customer balance

---

## 🔧 Advanced Configuration

### 🎨 Customizing the Interface

#### Theme Configuration
```java
// In Main.java
UIManager.setLookAndFeel(new FlatDarkLaf());
// or
UIManager.setLookAndFeel(new FlatLightLaf());
```

#### Receipt Template Customization
```java
// In ReceiptGenerator.java
public class ReceiptTemplate {
    private String storeName = "Gunrathna Store";
    private String storeAddress = "123 Main Street, Colombo";
    private String storeContact = "+94 11 234 5678";
    private String footerMessage = "Thank you for your business!";
}
```

### 📊 Database Backup & Maintenance

#### Automatic Backup Setup
```java
// In DatabaseManager.java
public void scheduleBackup() {
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(new BackupTask(), 0, 24 * 60 * 60 * 1000); // Daily
}
```

#### Manual Database Operations
```sql
-- Backup database
.backup gunrathna_store_backup.db

-- Restore database
.restore gunrathna_store_backup.db

-- Optimize database
VACUUM;
ANALYZE;
```

---

## 🐛 Troubleshooting

### Common Issues & Solutions

#### ❌ Database Connection Error
```
Error: Unable to connect to database
Solution: 
1. Check if data folder exists
2. Verify SQLite JDBC driver in classpath
3. Check file permissions
```

#### ❌ Receipt Printing Issues
```
Error: Printer not found
Solution:
1. Verify printer is connected and powered on
2. Install correct printer drivers
3. Check printer name in configuration
```

#### ❌ Credit Balance Calculation Error
```
Error: Incorrect credit balance
Solution:
1. Run database integrity check
2. Recalculate balances: Menu → Tools → Recalculate Balances
3. Check for duplicate payment entries
```

### 🔧 Performance Optimization

#### Database Optimization
```sql
-- Create indexes for better performance
CREATE INDEX idx_bills_date ON bills(bill_date);
CREATE INDEX idx_bills_customer ON bills(customer_id);
CREATE INDEX idx_products_code ON products(product_code);
```

#### Memory Management
```java
// JVM arguments for better performance
-Xms512m -Xmx1024m -XX:+UseG1GC
```

---

## 🤝 Contributing

We welcome contributions to improve Gunrathna Store POS! Here's how you can help:

### 🔧 Development Setup

1. **Fork the repository**
2. **Create feature branch**:
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Make changes and test**
4. **Commit changes**:
   ```bash
   git commit -m "Add amazing feature"
   ```
5. **Push to branch**:
   ```bash
   git push origin feature/amazing-feature
   ```
6. **Create Pull Request**

### 📝 Contribution Guidelines

- Follow Java coding standards
- Add unit tests for new features
- Update documentation
- Test on multiple platforms
- Follow existing code style

### 🐛 Bug Reports

When reporting bugs, please include:
- Operating system version
- Java version
- Steps to reproduce
- Expected vs actual behavior
- Screenshots (if applicable)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 Gunrathna Store POS

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 📞 Support

### 💬 Get Help

- **📧 Email**: support@gunrathnastore.com
- **💬 Chat**: Available during business hours
- **📚 Documentation**: Check our [Wiki](https://github.com/gihanpunarji/gunrathna-store-pos/wiki)
- **🐛 Issues**: [GitHub Issues](https://github.com/gihanpunarji/gunrathna-store-pos/issues)

### 🕒 Support Hours
- **Monday - Friday**: 9:00 AM - 6:00 PM (GMT+5:30)
- **Saturday**: 9:00 AM - 1:00 PM (GMT+5:30)
- **Sunday**: Closed

### 🚀 Professional Support
For business users requiring dedicated support, training, or customization:
- **📞 Phone**: +94 11 234 5678
- **📧 Enterprise**: enterprise@gunrathnastore.com
- **💼 Custom Development**: Available on request

---

## 🏆 Acknowledgments

- Thanks to all contributors who helped build this project
- SQLite team for the excellent embedded database
- Apache NetBeans community for the amazing IDE
- Java Swing community for UI components

---

<div align="center">
  <h3>🌟 Star this project to show your support! 🌟</h3>
  <p>Made with ❤️ for retail businesses worldwide</p>
  
  **© 2025 Gunrathna Store POS. All rights reserved.**
</div>
