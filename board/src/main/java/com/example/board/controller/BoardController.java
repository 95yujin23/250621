package com.example.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.dto.BoardDto;

@Controller
public class BoardController {

	@GetMapping("/board/openBoardList.do")
	public ModelAndView openBoardList() throws Exception{
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		List<BoardDto> list = null;
		mv.addObject("list", list);
		
		return mv;
	}
}
