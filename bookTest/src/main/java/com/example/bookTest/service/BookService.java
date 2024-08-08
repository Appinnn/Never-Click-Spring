package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.bookInfoDao;
import com.example.bookTest.DTO.bookInfoDto;

@Service
public class BookService 
{
	private final bookInfoDao bookDao;
	
	@Autowired
	public BookService(bookInfoDao bookDao)
	{
		this.bookDao = bookDao;
	}
	// 도서 정보 데이터베이스에서 가져와서 List 에 저장되어 있는걸 받아서 control 에게 넘겨주기
	public List<bookInfoDto> selectAll()
	{
		return bookDao.select();
	}
	
	
	
	// 도서정보 저장
	public void bookSave(bookInfoDto bookDto)
	{
		if( bookDto != null )
		{
			// 도서 코드가 이미 데이터베이스에 저장 되어 있는지 확인 후 저장.
			
			bookDao.insert(bookDto); // DAO 클래스의 insert 메서드 실행해서 저장.
		}
	}
}