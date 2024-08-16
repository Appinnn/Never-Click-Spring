package com.movieAndgame.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieAndgame.Dao.GameDao;
import com.movieAndgame.Dto.GameDto;

@Service
public class GameService 
{
	
	@Autowired
	private GameDao gameDao;
	
	public GameDto login(GameDto gameDto)
	{
		return gameDao.login(gameDto);
	}
	
	public boolean registerDataSave(GameDto gameDto)
	{
		
		
		List<String> emailList = gameDao.findAllEmail();
		if( emailList.contains(gameDto.getEmail() ) )
		{
			return true;
		}
		
		gameDao.dataSave(gameDto);
		
		return false;
		
	}
}
