package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarksController {
	
	@GetMapping(value="/MarksForm")
	public ModelAndView getMarksForm() {
		
		ModelAndView model = new ModelAndView("MarksForm");
		return model;
	}
	
	@PostMapping( value="/SubmitForm")
	public ModelAndView getResult(@RequestParam("sciencemarks") int ScienceMarks,@RequestParam("mathsmarks") int MathsMarks,@RequestParam("englishmarks") int EnglishMarks) {
		
		int total = ScienceMarks+MathsMarks+EnglishMarks;
		
		ModelAndView model = new ModelAndView("MarksResult");
		
		model.addObject("msg", "Total Marks obtained is :"+total);
		
		return model;
		
	}

}
