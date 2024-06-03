package com.quizproject.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String name;
    private List<Question> questions;

    public Quiz(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuestion(String questionText, List<String> options, int correctOption) {
        Question question = new Question(questionText, options, correctOption);
        questions.add(question);
    }

    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + question.getText());

            List<String> options = question.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (question.isCorrect(answer)) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.size());
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
