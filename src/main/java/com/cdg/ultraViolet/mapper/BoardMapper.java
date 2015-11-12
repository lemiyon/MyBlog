package com.cdg.ultraViolet.mapper;

import java.math.BigInteger;
import java.util.List;

import com.cdg.ultraViolet.domain.Board;

public interface BoardMapper {
	public void insertBoard(Board board);
	public List<Board> selectBoardList();
	public void updateBoard(Board board);
	public void deleteBoard(BigInteger bigInteger);
	public Board selectDetail(BigInteger bigInteger);
	public void increaseHit(BigInteger bigInteger);
}
