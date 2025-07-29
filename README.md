📘 BCA Student Subject Management System
A simple Java-based console application designed for BCA students to view subjects, students, and teachers based on selected subject. This project helps in organizing and displaying academic details clearly and efficiently.

📂 Features
🎓 Course selection (Currently supports: BCA)

📚 Subject list display

👨‍🎓 Student list per subject

👩‍🏫 Teacher details per subject

✅ Simple and menu-driven console UI

🛠️ Technologies Used
Java

OOP concepts

Basic console-based I/O

📋 How It Works
The user is prompted to select a course (currently only "BCA" is supported).

Once "BCA" is selected, a list of subjects is shown:

Maths

Computer Organisation

Desktop Publishing & Design

OOPs with C++

Business

Based on the selected subject number, the program displays:

Subject name

List of students

Teacher assigned to that subject

🧪 Sample Output
markdown
Copy
Edit
Enter course: BCA
Select Subject:
1. Maths
2. Computer Organisation
3. Desktop Publishing & Design
4. OOPs with C++
5. Business

Enter subject number: 2

------------------------SUBJECT DETAIL-----------------------------------
Subject name = Computer Organisation

------------------------STUDENT DETAIL-----------------------------------
Student 1: [Details]
Student 2: [Details]

------------------------TEACHER DETAIL-----------------------------------
Computer Organisation teacher name is = [Teacher Name]
🔧 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/bca-student-project.git
cd bca-student-project
Compile the Java files:

bash
Copy
Edit
javac Main.java
Run the program:

bash
Copy
Edit
java Main
Make sure all required Java classes like bca_student and bca_teacher are present in the same directory.

📌 Future Improvements
Add support for other courses (e.g., BBA, MCA)

Add GUI using JavaFX or Swing

Store data in external files or a database

Add login system for students and teachers

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

📄 License
This project is open-source and available under the MIT License.

