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
	
	public CafeDto findId(int id)
	{
		String sql = "select * from coffe where coffe_id=?";
		
		 CafeDto data = jt.queryForObject(sql, new cafeDtoRowMapper(), id);
		 
		 return data;
	}
	
	public void insert(CafeDto cafeDto)
	{
		String sql = "insert into coffe(item_name, price, decaffein) values(?,?,?)";
		
		jt.update(sql, cafeDto.getItemName(),
				cafeDto.getPrice(),
				cafeDto.getDecaffein());
	}
	
	public void delete(int id)
	{
		String sql = "delete from coffe where coffe_id=?";
		
		jt.update(sql, id);
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

	public void update(CafeDto coffeDto) {
		String sql = "update coffe set item_name=? , price=?, decaffein=? where coffe_id=?";
		
		jt.update(sql , coffeDto.getItemName(), coffeDto.getPrice(), coffeDto.getDecaffein(), coffeDto.getCoffeId());
		
	}
}








