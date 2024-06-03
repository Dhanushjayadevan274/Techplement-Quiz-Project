package com.quizproject.service;

import com.quizproject.data.QuestionBank;
import com.quizproject.model.Question;
import com.quizproject.model.Quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizManager {
    private Map<String, Quiz> quizzes;

    public QuizManager() {
        quizzes = new HashMap<>();
    }

    public void createQuiz(String name) {
        if (quizzes.containsKey(name)) {
            System.out.println("Quiz already exists.");
        } else {
            quizzes.put(name, new Quiz(name));
            System.out.println("Quiz '" + name + "' created.");
        }
    }

    public void addQuestion(String quizName, String questionText, List<String> options, int correctOption) {
        Quiz quiz = quizzes.get(quizName);
        if (quiz != null) {
            quiz.addQuestion(questionText, options, correctOption);
            System.out.println("Question added to quiz '" + quizName + "'.");
        } else {
            System.out.println("Quiz not found.");
        }
    }

    public void addRandomQuestion(String quizName) {
        Quiz quiz = quizzes.get(quizName);
        if (quiz != null) {
            List<Question> allQuestions = QuestionBank.getQuestions();
            if (!allQuestions.isEmpty()) {
                Question randomQuestion = allQuestions.get((int) (Math.random() * allQuestions.size()));
                quiz.addQuestion(randomQuestion.getText(), randomQuestion.getOptions(), randomQuestion.getCorrectOption());
                System.out.println("Random question added to quiz '" + quizName + "'.");
            } else {
                System.out.println("No questions available in the question bank.");
            }
        } else {
            System.out.println("Quiz not found.");
        }
    }

    public void takeQuiz(String quizName) {
        Quiz quiz = quizzes.get(quizName);
        if (quiz != null) {
            quiz.takeQuiz();
        } else {
            System.out.println("Quiz not found.");
        }
    }

    public void listQuizzes() {
        if (!quizzes.isEmpty()) {
            System.out.println("Available quizzes:");
            for (String name : quizzes.keySet()) {
                System.out.println("- " + name);
            }
        } else {
            System.out.println("No quizzes available.");
        }
    }

    public void listQuestions(String quizName) {
        Quiz quiz = quizzes.get(quizName);
        if (quiz != null) {
            List<Question> questions = quiz.getQuestions();
            if (!questions.isEmpty()) {
                System.out.println("Questions for quiz '" + quizName + "':");
                for (int i = 0; i < questions.size(); i++) {
                    Question question = questions.get(i);
                    System.out.println("Q" + (i + 1) + ": " + question.getText());
                }
            } else {
                System.out.println("No questions found for quiz '" + quizName + "'.");
            }
        } else {
            System.out.println("Quiz not found.");
        }
    }
}
