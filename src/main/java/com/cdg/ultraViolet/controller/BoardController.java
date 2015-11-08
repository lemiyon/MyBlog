package com.cdg.ultraViolet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdg.ultraViolet.domain.Board;

@Controller
public class BoardController {

	//Spring에 의한 의존성 주입. 
	@Autowired
	BoardService service;

	@RequestMapping("/board/writeForm")
	public String getWriteForm() {
		return "board/writeForm";
	}

	@RequestMapping(path = "/board/write", method = RequestMethod.POST)
	public String write(Board board) {
		service.write(board);
		return "redirect:/board/list";
	}

	@RequestMapping(value = "/board/list")
	public String getList(Model model) {
		List<Board> boardList = service.getList();
		model.addAttribute("boardList", boardList);
		return "board/list";
	}
	
	//글 상세 보기 화면
	@RequestMapping(value = "/board/detail")
	//@RequestParam() 어노테이션을 사용하여 reqeust객체에 들어있던 파라미터를 메소드 파라미터로 넣어 준다.
	public String getDetail(Model model, @RequestParam("boardNo") long boardNo)
	{
		Board board = service.getDetail(boardNo);
		model.addAttribute("board", board);
		return "board/detail";
	}
	
}
