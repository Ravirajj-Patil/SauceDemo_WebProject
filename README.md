# Selenium Java TestNG Automation Framework

## 📌 Project Overview

This project is a **UI Automation Framework** built using Java, Selenium WebDriver, and TestNG following the Page Object Model (POM) design pattern.
It automates functional test scenarios for the demo application: https://www.saucedemo.com/

---

## 🧱 Framework Structure

```
src/test/java
│
├── tests       -> Test classes (TestNG)
├── pages       -> Page Object Model classes
├── utils       -> Utilities (Driver, Waits, Screenshot)
├── config      -> Configuration reader
│
src/test/resources
└── config.properties
```

---

## ⚙️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* ChromeDriver

---

## 🚀 Features Implemented

### 1. Login Functionality

* Valid Login
* Invalid Login
* Edge Case Handling:

  * Empty username/password
  * Special characters

---

### 2. Dashboard Validation

* Verification of page title ("Products")
* Validation of UI elements:

  * Menu button
  * Cart icon

---

### 3. Add to Cart

* Add product to cart
* Validate item presence in cart

---

### 4. Screenshot on Failure

* Automatic screenshot capture using TestNG Listener
* Screenshots stored in `/screenshots/` directory

---

## 🧪 Test Execution

Run tests using TestNG XML:

* Right click on `testng.xml`
* Select **Run As → TestNG Suite**

---

## ⚙️ Configuration

Update values in:

```
src/test/resources/config.properties
```

Example:

```
url=https://www.saucedemo.com/
browser=chrome
username=standard_user
password=secret_sauce
```

---

## 🔧 WebDriver Setup

Update ChromeDriver path in:

```
utils/DriverFactory.java
```

Example:

```
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
```

---

## 📂 Screenshots

* Captured automatically on test failure
* Stored at:

```
/screenshots/
```

---

## 📈 Future Enhancements

* Extent Reports integration
* Data-driven testing (Excel)
* Parallel execution
* CI/CD integration (Jenkins / GitHub Actions)

---


## 📌 Conclusion

This framework demonstrates a scalable and maintainable automation design using Selenium, Java, and TestNG with Page Object Model principles. It ensures clean code structure, reusability, and effective validation with failure handling. The framework is aligned with industry standards and can be extended to support advanced features such as reporting, parallel execution, and continuous integration.
