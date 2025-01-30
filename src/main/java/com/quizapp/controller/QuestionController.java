package com.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.model.Questions;
import com.quizapp.serviceimpl.QuestionServiceImpl;

@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	QuestionServiceImpl quesServiceImpl;
	
	@GetMapping("all-questions")
	public List<Questions> getAllQuestion() {
		return quesServiceImpl.getallquestions();
	}
	
	@GetMapping("category/{category}")
	public List<Questions> getQuestionByCategory(@PathVariable String category){
		return quesServiceImpl.getQuestionByCategory(category);
		
	}
	
	@GetMapping("{difficultyLevel}")
	public List<Questions> getQuestionByDifficultyLevel(@PathVariable String difficultyLevel){
		return quesServiceImpl.getQuestionByDifficultyLevel(difficultyLevel);
		
	}
	@PostMapping("addquestion")
	public String addQuestion(@RequestBody Questions question) {
		return quesServiceImpl.addQuestion(question);
		
	}

}
