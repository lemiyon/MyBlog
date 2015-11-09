package com.cdg.ultraViolet.mapper;

import java.util.List;

import com.cdg.ultraViolet.domain.Board;

public interface BoardMapper {
	public void insertBoard(Board board);
	public List<Board> selectBoardList();
	public void updateBoard(Board board);
	public void deleteBoard(long boardNo);
	public Board selectDetail(long boardNo);
}
