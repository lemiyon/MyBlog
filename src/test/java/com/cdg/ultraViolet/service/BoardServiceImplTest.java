package com.cdg.ultraViolet.service;

import org.junit.Test;

import com.cdg.ultraViolet.controller.BoardServiceImpl;
import com.cdg.ultraViolet.domain.Board;

public class BoardServiceImplTest {

	private BoardServiceImpl service;
	@Test
	public void test() throws Exception{
		//fail("Not yet implemented");
		
		service = new BoardServiceImpl();
		
		long actual = service.makeBoardNo();
		System.out.println(actual);
		
		
	}
	
	@Test
	public void testGetDetail() throws Exception {
	Board board = service.getDetail(1511070153);
	 System.out.println(board);
	}

}
