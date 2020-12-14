package it.betacom.businnesscomponent.utilities;

import org.springframework.jdbc.core.JdbcTemplate;
import it.betacom.architetture.dao.DAOConstants;

public class CheckLogin implements DAOConstants{
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getUserPass(String username){
		return jdbcTemplate.queryForObject(SELECT_USERPASS, new Object[] {username}, String.class);
	}
/*	
	public String getAdminPass(String username){
		return jdbcTemplate.queryForObject(SELECT_ADMINPASS, new Object[] {username}, String.class);
	}*/
}
