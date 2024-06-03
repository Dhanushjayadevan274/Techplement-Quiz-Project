package com.quizproject;

import com.quizproject.model.Question;
import com.quizproject.data.QuestionBank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        List<Question> questions = new ArrayList<>(QuestionBank.getQuestions());
        Collections.shuffle(questions); 

        int score = 0;
        for (int i = 0; i < Math.min(10, questions.size()); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.getText());

            List<String> options = question.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer (1-" + options.size() + "): ");
            int answer = scanner.nextInt();
            if (question.isCorrect(answer)) {
                score++;
            }
        }

        System.out.println("Dear " + userName + ", your score is: " + score + "/10");

        if (score <= 3) {
            System.out.println(userName+" Improve!");
        } else if (score <= 7) {
            System.out.println(userName+" You are good but put a little more effort.");
        } else {
            System.out.println(userName+" Good job!");
        }
    }
}
