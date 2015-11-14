package com.cdg.ultraViolet.mapper;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
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
@Transactional(transactionManager = "transactionManager") //디비의 트랜잭션 관리자를 지정
//@Rollback(true) 트랜잭션을 모두 롤백해준다. 들어가긴 하지만 임시공간에 들어가지만, 몇 초간 정보를 유지할 수 도 있다. 와우!
//트랜잭션의 단위는 정말 중요합니다. 
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;

	@Test
	
	public void test() throws Exception {

		Board board = new Board();
		board.setBoardNo(BigInteger.ZERO);
		board.setContents("hello");
		board.setTitle("hello");
		board.setUserNo(0);

		mapper.insertBoard(board);
		// fail("Not yet implemented");

		List<Board> actual = mapper.selectBoardList();
		assertTrue(CollectionUtils.isNotEmpty(actual));

	}
	public void testDeleteBoard() throws Exception {
		
		mapper.deleteBoard(BigInteger.ZERO);

	}


	public void testUpdateBoard() throws Exception {
		Board board = new Board();
		board.setBoardNo(BigInteger.ZERO);
		board.setContents("hi update");
		board.setTitle("hi test");
		
		mapper.updateBoard(board);

	}

	
	
}
