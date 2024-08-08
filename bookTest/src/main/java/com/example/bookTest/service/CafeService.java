package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.CafeDao;
import com.example.bookTest.DTO.CafeDto;

@Service
public class CafeService 
{
	private final CafeDao cafeDao;
	
	@Autowired
	public CafeService(CafeDao cafeDao)
	{
		this.cafeDao = cafeDao;
	}
	
	public List<CafeDto> printAll()
	{
		return cafeDao.print();
	}
	
	public void coffeSave(CafeDto cafeDto)
	{
		if(cafeDto != null)
		{
			cafeDao.insert(cafeDto);
		}
	}
}
