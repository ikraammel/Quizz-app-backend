package com.quizz.quizz.app.dao;

import com.quizz.quizz.app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
