# File Operation Application in Java

This project demonstrates basic file handling operations in Java, allowing users to view, add, delete, and search files within a specified directory.

## Getting Started

These instructions will guide you through setting up and running the project on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- An Integrated Development Environment (IDE) for Java development (e.g., Eclipse, IntelliJ).

### Setup and Run

1. Clone this repository to your local machine.
```bash
   git clone https://github.com/RohitSingh-NR/FileOperationsApplication.git

2. There are two java Classes:
   -- FileOperations.java consists of all the properties or fetures used in this application.
   -- MainMenu.java consists main method that is to be executed to use the application.

3. Open the project in your chosen IDE (Below example given for Eclipse IDE).
   
   -- Open Eclipse:
   -- Launch the Eclipse IDE.
   -- Import the Project:
   -- Click on File -> Open Projects from File System...
   -- Browse and select the folder where you cloned the repository (FileOperationsApplication).
   -- Click Finish to import the project.
   -- Run the Application:

   - In Eclipse's Project Explorer, navigate to the src/com/fileOps directory.
   - Right-click on the MainMenu.java file.
   - Select Run As -> Java Application.
   
4. If you are using Bash follow below steps to run the application:

   - Navigate to the Source Code:
     Change the current directory to the src/com/fileOps directory:
     $ cd FileOperationsApplication/src/com/fileOps

   - Compile the Java Code:
     Compile the Java code using the javac command. You may compile individual files or compile all files together,
     depending on your needs. For example, to compile the MainMenu.java file:
     $ javac MainMenu.java

   - Run the Application:
     Run the compiled Java class to start the application:
     $ java MainMenu

5. Follow the On-Screen Instructions:

   - The application will display a Welcome Page and ask for the Root Directory path
   - Please enter your Directory path where you want to perform operation
      (ex: )
   - After thet main menu with various file operation options will displayed.
   - Follow the on-screen instructions to interact with the application.


### Features

1. View Files: List all files in the specified directory.
2. Add a New File: Create a new file in the specified directory.
3. Delete a File: Delete a file if it exists in the directory.
4. Search for a File: Search for a file based on search criteria (e.g., file name with extension).
5. Navigate to main menu
6. Exit: Terminate the application.


## Algorithm

1. Initialize the application
2. Ask user to provide root directory to use features of this application.
3. Display the main menu to the user with options:
	- View files in the directory
	- Do some File Operation (Like Add, Delete and Search the file)
	- Exit the application
4. Wait for user input.
5. If the user chooses to view files:
	- List all files in the specified directory.
	- Return to the main menu.
6. If the user chooses to do some operation
    --> Display the sub-menu to the user with options:
	  - Add a new file
	  - Delete a file
	  - Search for a file
	  - Back to Main Menu
7.	If the user chooses to add a new file:
	- Prompt the user for the file name.
	- Create a new file with the provided name in the specified directory.
        - Return to the main menu.
8.	If the user chooses to delete a file:
	- Prompt the user for the file name to be deleted.
	- Check if the file exists; if yes, delete it.
	- Return to the main menu.
9.	If the user chooses to search for a file:
	- Prompt the user for the search criteria (e.g., file name with extension, if applicable).
	- Display the details of file matching the search criteria.
	- Return to the main menu.
10.	If the user choose to return to main menu:
	- Display the main menu option to user
11.	If the user chooses to exit:
	- Terminate the application.
12.	If the user selects an invalid option, display an error message and return to the main menu.
