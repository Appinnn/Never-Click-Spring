package com.movieAndgame.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.GameDto;

@Mapper
public interface GameDao 
{
	public int dataSave(GameDto gameDto);
	public List<String> findAllEmail();
	
	public GameDto login(GameDto gameDto);
}
