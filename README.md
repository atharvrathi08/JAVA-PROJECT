Project Overview
Campus Course & Records Manager (CCRM) is a comprehensive Java console application designed for educational institutions to manage students, courses, enrollments, and grades efficiently. This application demonstrates advanced Java SE features including OOP principles, design patterns, file I/O operations, and modern Java APIs.
Course: Programming in Java
Project Type: Console Application
JDK Version: 17 or higher
IDE: Eclipse/IntelliJ IDEA/VS Code
________________________________________
📋 Table of Contents
•	Features
•	Project Structure
•	How to Run
•	Java Evolution Timeline
•	Java Platforms Comparison
•	Java Architecture
•	Installation Guide
•	Technology Mapping
•	Sample Usage
________________________________________
✨ Features
Core Functionality
•	Student Management: Add, list, update, and deactivate students
•	Course Management: Create, search, filter, and manage courses
•	Enrollment System: Enroll/unenroll students with credit limits
•	Grading System: Record marks, compute GPA, generate transcripts
•	File Operations: Import/export CSV data, backup utilities
•	Reports: GPA distribution, student transcripts, course analytics
Technical Demonstrations
•	OOP Principles: Encapsulation, Inheritance, Abstraction, Polymorphism
•	Design Patterns: Singleton, Builder
•	Java APIs: NIO.2, Streams, Date/Time API
•	Advanced Features: Lambdas, Enums, Recursion, Exception Handling
________________________________________
📁 Project Structure
text
CCRM_Project/
├── src/edu/ccrm/
│   ├── Main.java                 # Application entry point
│   ├── config/AppConfig.java     # Singleton configuration
│   ├── domain/                   # Core entities (Person, Student, Course)
│   ├── cli/CLIMenu.java          # Command-line interface
│   ├── service/                  # Business logic services
│   ├── io/                       # File I/O operations
│   └── test/SimpleTest.java      # Test class
├── bin/                          # Compiled class files
├── data/                         # CSV data files
├── docs/                         # Documentation
├── compile.bat/sh                # Compilation script
├── run.bat/sh                    # Execution script
└── README.md                     # This file
________________________________________
🚀 How to Run
Prerequisites
•	JDK 17 or higher installed
•	System PATH configured for Java
Compilation and Execution
Using Scripts (Recommended):
bash
# Compile the project
./compile.sh    # Linux/Mac
compile.bat     # Windows

# Run the application
./run.sh        # Linux/Mac
run.bat         # Windows
Using Command Line:
bash
# Compile all Java files
javac -d bin src/edu/ccrm/*.java src/edu/ccrm/config/*.java src/edu/ccrm/domain/*.java src/edu/ccrm/cli/*.java

# Run the application
java -cp bin edu.ccrm.Main

# Run tests
java -cp bin edu.ccrm.test.SimpleTest
Using Eclipse IDE:
1.	File → Import → Existing Projects into Workspace
2.	Select CCRM_Project folder
3.	Right-click project → Run As → Java Application
4.	Choose edu.ccrm.Main as main class

🏗️ Java Architecture
JDK (Java Development Kit)
•	Purpose: Development environment for building Java applications
•	Includes: Compiler (javac), tools, libraries, JRE
•	Role in Project: Used to compile and build CCRM application
JRE (Java Runtime Environment)
•	Purpose: Runtime environment for executing Java applications
•	Includes: JVM, core libraries, supporting files
•	Role in Project: Required to run the compiled CCRM application
JVM (Java Virtual Machine)
•	Purpose: Executes Java bytecode, provides platform independence
•	Features: Memory management, garbage collection, optimization
•	Role in Project: Runs the compiled CCRM.class files
Interaction: JDK → Compiles to bytecode → JRE → JVM executes
________________________________________
💻 Installation Guide
Windows JDK Installation
Step 1: Download JDK
1.	Visit Oracle JDK Downloads
2.	Download JDK 17+ for Windows x64 Installer
Step 2: Install JDK
1.	Run the downloaded .exe file
2.	Follow installation wizard (keep default settings)
3.	Note the installation path (typically C:\Program Files\Java\jdk-17\)
Step 3: Set Environment Variables
1.	Right-click "This PC" → Properties → Advanced system settings
2.	Click "Environment Variables"
3.	Under System variables, find/edit JAVA_HOME:
text
Variable: JAVA_HOME
Value: C:\Program Files\Java\jdk-17
4.	Edit Path variable, add: %JAVA_HOME%\bin
Step 4: Verify Installation
cmd
java -version
javac -version
https://screenshots/jdk-verification.png
Eclipse IDE Setup
Step 1: Download and Install Eclipse
1.	Download Eclipse IDE for Java Developers
2.	Extract to preferred location
3.	Launch eclipse.exe
Step 2: Create/Import Project
1.	File → New → Java Project
2.	Project name: CCRM_Project
3.	Use default JRE (Java SE-17)
4.	Finish project creation
Step 3: Configure Build Path
1.	Right-click project → Build Path → Configure Build Path
2.	Add source folder: src/
3.	Set output folder: bin/
https://screenshots/eclipse-setup.png
________________________________________
🔧 Technology Mapping
Syllabus Topic	Implementation Location	File/Class/Method
OOP Principles	Domain classes	Person.java, Student.java
Singleton Pattern	Configuration	AppConfig.getInstance()
Exception Handling	Service classes	Custom exceptions in service layer
File I/O (NIO.2)	IO package	FileService.java - backup operations
Stream API	Service classes	StudentService.filterStudents()
Date/Time API	Domain classes	Person.createdDate, backup timestamps
Lambdas	Utility classes	Comparator in sorting methods
Enums	Domain package	Semester.java, Grade.java
Recursion	Utility classes	FileUtils.calculateDirectorySize()
Design Patterns	Various	Singleton, Builder patterns
________________________________________
⚠️ Enabling Assertions
Assertions are disabled by default. To enable for debugging:
Command Line:
bash
java -ea -cp bin edu.ccrm.Main
Eclipse IDE:
1.	Run → Run Configurations
2.	Select your Java Application
3.	Arguments tab → VM arguments: -ea
4.	Apply → Run
Sample Assertion Usage:
java
// Credit validation example
public void enrollStudent(Student s, Course c) {
    assert s != null : "Student cannot be null";
    assert c != null : "Course cannot be null";
    assert s.getCredits() + c.getCredits() <= MAX_CREDITS : "Credit limit exceeded";
    // Enrollment logic
}
________________________________________
📊 Sample Usage
Sample Data Files
students.csv:
csv
id,regNo,fullName,email,status
S001,2023001,John Doe,john.doe@edu.ccrm,ACTIVE
S002,2023002,Jane Smith,jane.smith@edu.ccrm,ACTIVE
courses.csv:
csv
code,title,credits,instructor,semester,department
CS101,Introduction to Programming,3,Dr. Alice,SPRING,CS
MA201,Calculus I,4,Dr. Bob,FALL,MATH
Example Workflow
1.	Start Application: Run java -cp bin edu.ccrm.Main
2.	Import Data: Use "Import/Export Data" menu option
3.	Manage Students: Add, list, or update student records
4.	Course Enrollment: Enroll students in courses with credit checks
5.	Record Grades: Input marks, automatically compute GPA
6.	Generate Reports: View transcripts and analytics
7.	Backup Data: Create timestamped backups of all data

👥 Acknowledgments
References
•	Oracle Java Documentation
•	Java SE 17 API Specification
•	Eclipse IDE User Guide
Third-party Libraries
•	Pure Java SE (no external dependencies)
Academic Integrity
This project represents my original work. All code has been developed independently following the project specifications.


