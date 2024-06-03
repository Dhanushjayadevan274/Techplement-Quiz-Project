package com.quizproject.data;

import com.quizproject.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

	private static List<Question> questions = new ArrayList<>();

	static {
		questions.add(new Question("Which company developed the Java programming language?",
				List.of("Microsoft", "Apple", "Sun Microsystems", "IBM"), 3));
		questions.add(new Question("What year was Java first released?", List.of("1995", "1998", "2000", "2005"), 1));
		questions.add(new Question("What does JVM stand for?",
				List.of("Java Visual Machine", "Java Virtual Machine", "Java Valid Machine", "Java Vital Machine"), 2));
		questions.add(new Question("Which of the following is not a Java keyword?",
				List.of("static", "private", "unsigned", "volatile"), 3));
		questions.add(new Question("What is the output of the following code?\nint x = 5;\nSystem.out.println(x++);",
				List.of("5", "6", "Compiler error", "Runtime error"), 1));
		questions.add(new Question("Which data type is used to create a variable that should store text?",
				List.of("String", "int", "char", "boolean"), 1));
		questions.add(new Question("Who invented Java Programming?",
				List.of("Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup"), 2));
		questions.add(new Question("Which statement is true about Java?",
				List.of("Java is a sequence-dependent programming language",
						"Java is a code dependent programming language",
						"Java is a platform-dependent programming language",
						"Java is a platform-independent programming language"),
				4));
		questions.add(new Question("Which component is used to compile, debug and execute the java programs?",
				List.of("JRE", "JIT", "JDK", "JVM"), 3));
		questions.add(new Question("Which one of the following is not a Java feature?",
				List.of("Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible"), 2));
		questions.add(new Question("Which of these cannot be used for a variable name in Java?",
				List.of("identifier & keyword", "identifier", "keyword", "none of the mentioned"), 3));
		questions.add(
				new Question("What is the extension of java code files", List.of(".js", ".txt", ".class", ".java"), 4));
		questions.add(new Question(
				"What is the output of the following code?\n" + "class Increment {\n"
						+ "    public static void main(String[] args) {\n" + "        int g = 3;\n"
						+ "        System.out.print(++g * 8);\n" + "    }\n" + "}",
				List.of("24", "32", "40", "48"), 2));
		questions.add(new Question("Which environment variable is used to set the java path?",
				List.of("MAVEN_Path", "JavaPATH", "JAVA", "JAVA_HOME"), 4));
		questions.add(new Question(
				"What is the output of the following code?\nclass output {\n    public static void main(String[] args) {\n        double a, b, c;\n        a = 3.0 / 0;\n        b = 0 / 4.0;\n        c = 0 / 0.0;\n\n        System.out.println(a);\n        System.out.println(b);\n        System.out.println(c);\n    }\n}",
				List.of("NaN", "Infinity", "0.0", "all of the mentioned"), 4));
		questions.add(new Question("Which of the following is not an OOPS concept in Java?",
				List.of("Polymorphism", "Inheritance", "Compilation", "Encapsulation"), 3));
		questions.add(new Question("What is not the use of “this” keyword in Java?",
				List.of("Referring to the instance variable when a local variable has the same name",
						"Passing itself to the method of the same class", "Passing itself to another method",
						"Calling another constructor in constructor chaining"),
				2));
		questions.add(new Question(
				"What is the output of the following code?\nclass variable_scope {\n    public static void main(String args[]) {\n        int x;\n        x = 5;\n        {\n            int y = 6;\n            System.out.print(x + \" \" + y);\n        }\n        System.out.println(x + \" \" + y);\n    }\n}",
				List.of("Compilation error", "Runtime error", "5 6 5 6", "5 6 5"), 3));
		questions.add(new Question("What will be the error in the following Java code?\n\nbyte b = 50;\nb = b * 50;",
				List.of("b cannot contain value 50", "b cannot contain value 100, limited by its range",
						"No error in this code",
						"* operator has converted b * 50 into int, which can not be converted to byte without casting"),
				4));
		questions.add(new Question("Which of the following is a type of polymorphism in Java Programming?",
				List.of("Multiple polymorphism", "Compile time polymorphism", "Multilevel polymorphism",
						"Execution time polymorphism"),
				2));
		questions.add(new Question("What will be the output of the following Java program?\n" + "\n"
				+ "    class leftshift_operator {\n" + "        public static void main(String args[]) {\n"
				+ "             byte x = 64;\n" + "             int i;\n" + "             byte y; \n"
				+ "             i = x << 2;\n" + "             y = (byte) (x << 2);\n"
				+ "             System.out.print(i + \" \" + y);\n" + "        }\n" + "    }\n",
				List.of("0 256", "0 64", "256 0", "64 0"), 4));
		questions.add(new Question("What will be the output of the following Java code?\r\n"
				+ "\r\n"
				+ "    class box \r\n"
				+ "    {\r\n"
				+ "        int width;\r\n"
				+ "        int height;\r\n"
				+ "        int length;\r\n"
				+ "    } \r\n"
				+ "    class main\r\n"
				+ "    {\r\n"
				+ "        public static void main(String args[]) \r\n"
				+ "        {        \r\n"
				+ "             box obj = new box();\r\n"
				+ "             obj.width = 10;\r\n"
				+ "             obj.height = 2;\r\n"
				+ "             obj.length = 10;\r\n"
				+ "             int y = obj.width * obj.height * obj.length; \r\n"
				+ "             System.out.print(y);\r\n"
				+ "        } \r\n"
				+ "    }",
				List.of("100", "400", "200","12"),
				3));
		questions.add(new Question("Which of the following is a superclass of every class in Java?",
				List.of("ArrayList", "Abstract class", "Object class",
						"String"),
				3));
		questions.add(new Question("Which of the below is not a Java Profiler?",
				List.of("JProfiler", "Eclipse Profiler", "JVM",
						"JConsole"),
				3));
		questions.add(new Question("Which of these packages contains the exception Stack Overflow in Java?",
				List.of("java.io", "java.system", "java.lang",
						" java.util"),
				3));
		questions.add(new Question(
			    "Which of these keywords are used for the block to be examined for exceptions?",
			    List.of("check", "throw", "catch", "try"),
			    3
			));
		questions.add(new Question(
			    "Which one of the following is not an access modifier?",
			    List.of("Protected", "Void", "Public", "Private"),
			    2
			));
		questions.add(new Question(
			    "What is the numerical range of a char data type in Java?",
			    List.of("0 to 256", "-128 to 127", "0 to 65535", "0 to 32767"),
			    3
			));
		questions.add(new Question(
			    "Which class provides system independent server side implementation?",
			    List.of("Server", "ServerReader", "Socket", "ServerSocket"),
			    4
			));
		questions.add(new Question(
			    "Which of the following is true about servlets?",
			    List.of("Servlets can use the full functionality of the Java class libraries",
			            "Servlets execute within the address space of web server, platform independent and uses the functionality of java class libraries",
			            "Servlets execute within the address space of web server",
			            "Servlets are platform-independent because they are written in java"),
			    2
			));
		questions.add(new Question(
			    "What is bytecode in the context of Java?",
			    List.of("Code written in byte language",
			            "Java code that runs on the Java Virtual Machine",
			            "Code written in machine language",
			            "Java code that runs on a web browser"),
			    2
			));
		questions.add(new Question(
			    "Which of the following is the correct way of implementing an interface salary by class manager?",
			    List.of("class manager extends salary {}",
			            "class manager implements salary {}",
			            "class manager imports salary {}",
			            "none of the mentioned"),
			    2
			));
		questions.add(new Question(
			    "Which method can be defined only once in a program?",
			    List.of("main method", "finalize method", "static method", "private method"),
			    1
			));
		questions.add(new Question(
			    "Which package contains the Random class?",
			    List.of("java.util package", "java.lang package", "java.awt package", "java.io package"),
			    1
			));
		questions.add(new Question(
			    "What is the return type of the hashCode() method in the Object class?",
			    List.of("Object", "int", "long", "void"),
			    2
			));
		questions.add(new Question(
			    "Which of the following is a valid declaration of a char?",
			    List.of("char ch = '\\utea';", "char ca = 'tea';", "char cr = \\u0223;", "char cc = '\\itea';"),
			    1
			));
		questions.add(new Question(
			    "What is the result of 7 + 3 * 2?",
			    List.of("20", "13", "17", "23"),
			    3
			));
		questions.add(new Question(
			    "What is the output of the following code?\nint x = 5;\nSystem.out.println(++x * 2);",
			    List.of("10", "12", "14", "16"),
			    4
			));
		questions.add(new Question(
			    "What will be the output of the following code?\nString str = \"Hello World!\";\nSystem.out.println(str.length());",
			    List.of("12", "11", "10", "9"),
			    2
			));
		questions.add(new Question(
			    "What is the purpose of the 'finally' block in Java?",
			    List.of("To catch exceptions",
			            "To provide a way to clean up resources",
			            "To define the main entry point of a program",
			            "To initialize variables"),
			    2
			));
		questions.add(new Question(
			    "Which of the following is NOT a valid Java identifier?",
			    List.of("my_variable", "class", "1variable", "_myVariable"),
			    3
			));
		questions.add(new Question(
			    "What will be the output of the following code?\nint[] arr = {1, 2, 3};\nSystem.out.println(arr[3]);",
			    List.of("1", "2", "3", "ArrayIndexOutOfBoundsException"),
			    4
			));
		questions.add(new Question(
			    "What is the correct way to declare a constant variable in Java?",
			    List.of("final int x = 10;", "int constant x = 10;", "const int x = 10;", "int x = 10;"),
			    1
			));
		questions.add(new Question(
			    "Which method is used to compare two strings in Java?",
			    List.of("equals()", "compareTo()", "compare()", "compareto()"),
			    1
			));
		questions.add(new Question(
			    "What is the output of the following code?\nint x = 5;\nint y = x++ + ++x;\nSystem.out.println(y);",
			    List.of("11", "12", "13", "14"),
			    3
			));
		questions.add(new Question(
			    "Which of the following is NOT a valid Java keyword?",
			    List.of("this", "super", "new", "var"),
			    4
			));
		questions.add(new Question(
			    "What will be the output of the following code?\nString str = null;\nSystem.out.println(str.length());",
			    List.of("NullPointerException", "0", "Error", "Compile-time error"),
			    1
			));
		questions.add(new Question(
			    "What is the result of 9 % 4?",
			    List.of("1", "2", "3", "4"),
			    1
			));
	}

	public static List<Question> getQuestions() {
		return questions;
	}
}
