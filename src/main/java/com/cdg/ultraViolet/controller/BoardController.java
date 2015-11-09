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

	//글 쓰기 및 수
	@RequestMapping("/board/writeForm")
	public String getWriteForm(Model model ,@RequestParam(name = "boardNo", required = false, defaultValue = "0")long boardNo) {
		
		if(boardNo == 0)
		{
			return "board/writeForm";
		}
		
		Board board = service.getDetail(boardNo);
		model.addAttribute(board);
		
		return "board/writeForm";
	}

	//글 삭제
	@RequestMapping("/board/delete")
	public String delete(long boardNo)
	{
		service.delete(boardNo);
		return "redirect:/board/list";
	}
	
	@RequestMapping(path = "/board/write", method = RequestMethod.POST)
	public String write(Board board) {
		
		//post방식을 할 경우, 필요한 정보를 input계통으로 다 보내줘야 한다. 안그러면 null로 와버림.
		//이번 경우에도, writeForm에ㅓㅅ board의 boardNo를 보내주지 않아서 기본값 0으로 세팅되어 무조건 새 글로 인식하게 되었었다.
		//지금은 writeForm안에서 input type = hidden으로 boardNo를 보내주고 있다.
		if(board.getBoardNo() != 0)
		{
			service.update(board);
			return "redirect:/board/list";
		}
		
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
