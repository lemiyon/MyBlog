package com.cdg.ultraViolet.controller;

import java.util.List;

import com.cdg.ultraViolet.domain.Board;

public interface BoardService {

	public void write(Board board);
	public Board getDetail(long boardNo);
	public List<Board> getList();
	public void update(Board board);
	public void delete(long boardNo);
}
