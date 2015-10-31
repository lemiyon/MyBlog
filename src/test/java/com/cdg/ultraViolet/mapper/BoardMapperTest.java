package com.cdg.ultraViolet.mapper;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cdg.ultraViolet.domain.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-root.xml")
@Transactional(transactionManager = "transactionManager")
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void test() throws Exception {

		Board board = new Board();
		board.setBoardNo(1);
		board.setContents("hello");
		board.setTitle("hello");
		board.setUserNo(0);

		mapper.insertBoard(board);
		// fail("Not yet implemented");

		List<Board> actual = mapper.selectBoardList();
		assertTrue(CollectionUtils.isNotEmpty(actual));

	}
/*
	public void testUpdateBoard() throws Exception {
		Board board = new Board();
		board.setBoardNo(0);
		board.setContents("hi update");
		board.setTitle("hi test");
		
		mapper.updateBoard(board);

	}
	
	public void testDeleteBoard() throws Exception {
		
		mapper.deleteBoard(0);

	}
	*/
	
}
