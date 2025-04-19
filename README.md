# 📚 TD1 Correction – Java Object-Oriented Programming

This repository contains the correction of **TD1 (Série N°1)** for 1st-year engineering students at INSEA, as part of the "Programmation Orientée Objet en Java" course — academic year **2024–2025**.

## 📌 Objectives of the Assignment

- Practice basic class attribute manipulation  
- Understand constructors and method declarations  
- Execute a Java project and pass arguments to the `main` method  
- Work with String data in Java

---

## 🧩 Structure

### 🟠 Partie 1 — String Manipulation
Implemented in `src/partie1/`:

- `ChaineCaractere.java`: Class that manipulates a `String` attribute with methods to:
  - Check if the string contains only digits
  - Convert the string to an integer
  - Convert the string to an array of digits
  - Sort the array using insertion sort
- `Main.java`: Tests all methods in `ChaineCaractere`

### 🔵 Partie 2 — Project and Task Management
Implemented in `src/partie2/`:

- `Tache.java`: Class representing a task with attributes like ID, title, description, status, and responsible person
- `Projet.java`: Class managing a list of tasks with methods to:
  - Filter tasks by responsible
  - Search tasks by ID
  - Count tasks by status (in progress, canceled, completed)
  - Filter projects by category
- `MainProjet.java`: Tests for the above logic

---

## 🚀 How to Run

1. Open the project with any Java IDE (e.g., Eclipse or IntelliJ).
2. Run the `Main.java` and `MainProjet.java` classes to test both parts.
3. For command-line tests in Partie 1, you can pass arguments via `args[]` in `main`.

---

## 🛠 Technologies

- Java (JDK 17+)
- Eclipse Project Format

---

## 📂 Project Tree

src/ ├── partie1/ │ 
        ├── ChaineCaractere.java │ 
        ├── Main.java │ 
        └── tesst.java 
      └── partie2/ 
        ├── Tache.java 
        ├── Projet.java 
        └── MainProjet.java

> Feel free to fork and use for learning or sharing with classmates. Happy coding! ☕
