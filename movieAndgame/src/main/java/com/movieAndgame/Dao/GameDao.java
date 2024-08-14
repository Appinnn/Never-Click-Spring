package com.movieAndgame.Dao;

import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.GameDto;

@Mapper
public interface GameDao 
{
	public int dataSave(GameDto gameDto);
}
