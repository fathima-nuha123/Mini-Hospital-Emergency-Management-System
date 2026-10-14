# Mini Hospital Emergency Management System

**Student Name:** Nuha  
**Student ID:** 01241427  
**Programme:** Bachelor of Information Technology (BAIT)  
**Module:** Data Structures  
**Assignment Type:** Individual Assignment  
**Programming Language:** Java  

---

## 1. Introduction

The Mini Hospital Emergency Management System is a Java-based application developed to manage patient information, emergency cases, treatment records, and patient visit histories.

This project demonstrates the practical implementation of data structures to organize hospital information efficiently.

## 2. Objectives

- Register and manage patient records.
- Search for patient information.
- Delete patient records.
- Manage emergency patients.
- Maintain treatment records.
- Store and manage patient visit histories.
- Apply data structures to solve a real-world problem.

## 3. Technologies Used

- Java
- Java Development Kit (JDK)
- Visual Studio Code
- Git and GitHub (if used)

## 4. Data Structures Implemented

### 4.1 Binary Search Tree (BST)

The Binary Search Tree is used to manage patient records using patient IDs.

Operations:
- Insert patient records.
- Search for a patient.
- Delete a patient record.
- Display patient records in sorted order.

### 4.2 Queue

The queue is used to manage emergency patients according to the First In, First Out (FIFO) principle.

Operations:
- Add patients to the emergency queue.
- Remove the next patient for treatment.
- Display queued patients.

### 4.3 Stack

The stack is used to manage treatment records according to the Last In, First Out (LIFO) principle.

Operations:
- Add treatment records.
- Remove the latest treatment record.
- Display treatment records.

### 4.4 Singly Linked List

The linked list is used to maintain patient visit histories.

Operations:
- Insert visit records.
- Search for visit records.
- Delete visit records.
- Display visit histories.

## 5. Main Features

- Patient registration.
- Patient record searching and deletion.
- Emergency patient queue management.
- Treatment record management.
- Patient visit history management.
- Menu-driven console interface.

## 6. Project Structure

The project contains Java source files for the main menu, patient records, emergency queue, treatment stack, and patient visit history.

The actual filenames and folder structure depend on the implementation.

## 7. How to Run the Application

### Requirements

- Java Development Kit (JDK)
- Visual Studio Code or another Java-compatible IDE

### Compilation

Open the terminal in the project directory.

If all Java source files are inside the `src` folder and the project does not use package declarations, compile them using:

```powershell
javac -d out src\*.java
```

### Execution

Run the application using:

```powershell
java -cp out Main
```

Note: These commands may need to be adjusted to match the actual project structure.

## 8. Testing

The system should be tested using different inputs to verify that each implemented operation works correctly.

Example test cases include:

- Registering a new patient.
- Searching for an existing patient.
- Searching for a patient who does not exist.
- Deleting a patient record.
- Adding and removing emergency patients.
- Adding and retrieving treatment records.
- Inserting and displaying patient visit histories.
- Handling empty data structures.

## 9. Conclusion

The Mini Hospital Emergency Management System demonstrates the use of Binary Search Trees, Queues, Stacks, and Linked Lists in Java.

Developing this application provides practical experience in data structure implementation, problem-solving, and Java programming.

The system can be extended in the future with a database, graphical user interface, and additional hospital management features.