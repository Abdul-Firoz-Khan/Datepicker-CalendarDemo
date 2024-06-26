# Handling Calendar or Datepicker with Selenium


```markdown
# Handling Calendar or Datepicker in Selenium

This project demonstrates how to handle calendar or date picker elements using Selenium WebDriver with Java. It includes the setup of WebDriverManager for managing FirefoxDriver and automates the process of selecting a specific date from a date picker.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- A modern web browser (Firefox in this case)

## Dependencies

This project uses the following dependencies:
- Selenium WebDriver
- WebDriverManager

These dependencies are managed using Maven.

## Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Abdul-Firoz-Khan/Datepicker-CalendarDemo.git
   cd Datepicker-CalendarDemo
   ```

2. **Install Dependencies**

   Ensure you have Maven installed and run the following command to install the required dependencies:

   ```bash
   mvn clean install
   ```

3. **Run the Code**

   You can run the main class using your preferred IDE or from the command line:

   ```bash
   mvn exec:java -Dexec.mainClass="HandlingCalendarOrDatepicker"
   ```

## Code Explanation

The main class `HandlingCalendarOrDatepicker` does the following:

1. **Setup FirefoxDriver using WebDriverManager**

   ```java
   WebDriverManager.firefoxdriver().setup();
   WebDriver driver = new FirefoxDriver();
   ```

2. **Maximize the browser window**

   ```java
   driver.manage().window().maximize();
   ```

3. **Navigate to the target URL**

   ```java
   driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
   ```

4. **Click on the date picker input field**

   ```java
   driver.findElement(By.id("datepicker")).click();
   ```

5. **Select a specific date (27) from the date picker**

   ```java
   List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
   for (WebElement element : allDates) {
       String date = element.getText();
       if (date.equalsIgnoreCase("27")) {
           element.click();
           break;
       }
   }
   ```

## Notes

- The `Thread.sleep` calls are used to add delays for demo purposes. In a real-world scenario, it's better to use WebDriver's implicit or explicit waits.
- This example specifically targets a demo date picker on a blog. The XPath used for locating date elements might need adjustments for different date picker implementations.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Selenium](https://www.selenium.dev/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
```

Feel free to replace `"yourusername"` in the clone command with your actual GitHub username. Additionally, you might want to include a `LICENSE` file if you decide to specify a license for your project.
