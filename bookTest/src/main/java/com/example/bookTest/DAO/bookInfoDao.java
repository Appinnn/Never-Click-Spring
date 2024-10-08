package com.example.bookTest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.DTO.bookInfoDto;

@Repository
public class bookInfoDao 
{
	private final JdbcTemplate jt;
	
	@Autowired
	public bookInfoDao(JdbcTemplate jdbcTemplate)
	{
		this.jt = jdbcTemplate;
		
	}
	
	// book 테이블 전체 데이터 가져오기 - 첫 화면에 목록으로 출력
	public List<bookInfoDto> select()
	{
		String sql="select * from book";
		
		List<bookInfoDto> list = jt.query(sql, new bookInfoDtoRowMapper() );
		
		return list;
		
	};
	
	//도서 삭제
	public void delete(int id)
	{
		String sql = "delete from book where book_id=?";
		
		jt.update(sql, id);
	}
	
	//도서 상세 정보 가져오기 - 1권에 대해서면 (book_id 컬럼으로 조회)
	// book_id 컬럼이 중복데이터를 가질수 없는 유일한 값이기 때문에
	public bookInfoDto findId(int id)
	{
		String sql = "select * from book where book_id=?";
		
		// jt.queryForObject(쿼리문, mapper, ?에 넣어줄 값)
		
		bookInfoDto data = jt.queryForObject(sql,
				new RowMapper<bookInfoDto>()
				{
					@Override 
					public bookInfoDto mapRow(ResultSet rs, int rowNum) throws SQLException
					{
						bookInfoDto dto = new bookInfoDto();
						dto.setBookAuthor(rs.getString("book_author") );
						dto.setBookCost(rs.getInt("book_cost") );
						dto.setBookPage(rs.getInt("book_page") );
						dto.setBookTitle(rs.getString("book_title") );
						dto.setPublisher(rs.getString("publisher") );
						dto.setBookId(rs.getInt("book_id") );
						return dto;
					}
				}
				, id);
		
		return data;
	}
	
	public void insert(bookInfoDto bookDto) // 도서 정보 데이터베이스에 저장
	{
		String sql = "insert into book(book_title, book_author, book_cost, book_page, publisher) values(?,?,?,?,?)";
		
		jt.update(sql,
				 bookDto.getBookTitle(), 
				bookDto.getBookAuthor(), 
				  bookDto.getBookCost(), 
				  bookDto.getBookPage(),
				 bookDto.getPublisher() 
				);
		
	
		
	}

	public class bookInfoDtoRowMapper implements RowMapper<bookInfoDto>
	{

		@Override
		public bookInfoDto mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			bookInfoDto bookDto = new bookInfoDto();
			bookDto.setBookAuthor(rs.getString("book_author") );
			bookDto.setBookCost(rs.getInt("book_cost") );
			bookDto.setBookPage(rs.getInt("book_page") );
			bookDto.setBookTitle(rs.getString("book_title") );
			bookDto.setPublisher(rs.getString("publisher") );
			bookDto.setBookId(rs.getInt("book_id") );
			return bookDto;
		}
		
	}
	// 수정한 도서의 정보를 데이터베이스에 수정하여 저장하기
	public void update(bookInfoDto bookDto) 
	{
		String sql = "update book set book_title=? , book_author=? , book_cost=? , book_page=? , publisher=? where book_id=?";
		
		jt.update(sql, bookDto.getBookTitle(),
				bookDto.getBookAuthor(),
				bookDto.getBookCost(),
				bookDto.getBookPage(),
				bookDto.getPublisher(),
				bookDto.getBookId() );
	}

}









