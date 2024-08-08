package com.example.bookTest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.DTO.CafeDto;

@Repository
public class CafeDao 
{
	private final JdbcTemplate jt;
	
	@Autowired
	public CafeDao(JdbcTemplate jdbcTemplate)
	{
		this.jt = jdbcTemplate;
	}
	
	public List<CafeDto> print()
	{
		String sql = "select * from coffe";
		
		List<CafeDto> list = jt.query(sql, new cafeDtoRowMapper() );
		
		return list;
	}
	
	public void insert(CafeDto cafeDto)
	{
		String sql = "insert into coffe(item_name, price, decaffein) values(?,?,?)";
		
		jt.update(sql, cafeDto.getItemName(),
				cafeDto.getPrice(),
				cafeDto.getDecaffein());
	}
	
	public class cafeDtoRowMapper implements RowMapper<CafeDto>
	{

		@Override
		public CafeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			CafeDto cafeDto = new CafeDto();
			cafeDto.setCoffeId(rs.getInt("coffe_id"));
			cafeDto.setItemName(rs.getString("item_name"));
			cafeDto.setPrice(rs.getString("price"));
			cafeDto.setDecaffein(rs.getString("decaffein"));
			return cafeDto;
		}
		
	}
}








