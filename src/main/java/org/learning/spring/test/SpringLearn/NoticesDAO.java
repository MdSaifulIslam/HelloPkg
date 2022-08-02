package org.learning.spring.test.SpringLearn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("noticesDao")
public class NoticesDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Notic> getNotices() {

		return jdbc.query("select * from notices", new RowMapper<Notic>() {

			@Override
			public Notic mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notic notic = new Notic();

				notic.setId(rs.getInt("id"));
				notic.setName(rs.getString("name"));
				notic.setEmail(rs.getString("email"));
				notic.setText(rs.getString("text"));

				return notic;
			}

		});
	}

	public boolean deleteNotic(int id) {

		MapSqlParameterSource sqlParamenter = new MapSqlParameterSource();

		sqlParamenter.addValue("id", id);

		return jdbc.update("delete from notices where id= :id", sqlParamenter) == 1;
	}
	public Notic getNotice(int id) {
		
		MapSqlParameterSource sqlParamenter = new MapSqlParameterSource();
		
		sqlParamenter.addValue("id", id);
		
		return jdbc.queryForObject("select * from notices where id= :id", sqlParamenter, new RowMapper<Notic>() {
			
			@Override
			public Notic mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notic notic = new Notic();
				
				notic.setId(rs.getInt("id"));
				notic.setName(rs.getString("name"));
				notic.setEmail(rs.getString("email"));
				notic.setText(rs.getString("text"));
				
				return notic;
			}
			
		});
	}

}
