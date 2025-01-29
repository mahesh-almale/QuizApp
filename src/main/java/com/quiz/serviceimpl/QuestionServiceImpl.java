package com.quiz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Questions;
import com.quiz.repository.QuestionRepo;
import com.quiz.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionRepo quesRepo;

	@Override
	public List<Questions> getallquestions() {
		return quesRepo.findAll();
	}

	public List<Questions> getQuestionByCategory(String category) {
		return quesRepo.findByCategory(category);
	}

	public String addQuestion(Questions question) {
		quesRepo.save(question);
		return"sucess";
		
	}

	public List<Questions> getQuestionByDifficultyLevel(String difficultyLevel) {
		
		return quesRepo.findByDifficultyLevel(difficultyLevel);
	}

}
