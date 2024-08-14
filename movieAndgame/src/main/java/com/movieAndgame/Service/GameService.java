package com.movieAndgame.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieAndgame.Dao.GameDao;
import com.movieAndgame.Dto.GameDto;

@Service
public class GameService 
{
	
	@Autowired
	private GameDao gameDao;
	
	public void registerDataSave(GameDto gameDto)
	{
		gameDao.dataSave(gameDto);
	}
}
