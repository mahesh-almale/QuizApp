package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer>{

	List<Questions> findByCategory(String category);

	List<Questions> findByDifficultyLevel(String difficultyLevel);

	

}
