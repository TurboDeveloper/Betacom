package it.betacom.architetture.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import it.betacom.businnessmodel.model.Impiegato;

public class ImpiegatoDAO implements DAOConstants{
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int create(Impiegato i) {
		SqlRowSet rs = jdbcTemplate.queryForRowSet(IMPSEQ_NEXTVAL);
		rs.next();
		long id = rs.getLong(1);
		
		return jdbcTemplate.update(INSERT_IMP,
				new Object[] {id, i.getNome(), i.getStipendio(), i.getReparto(), i.getUrl_img()});
	}
	
	public int update(Impiegato i) {
		return jdbcTemplate.update(UPDATE_IMP,
				new Object[] {i.getNome(), i.getStipendio(), i.getReparto(), i.getId(), i.getUrl_img()});
	}
	
	public int delete(long id) {
		return jdbcTemplate.update(DELETE_IMP,
				new Object[] {id});	
	}
	
	public Impiegato getById(long id) {
		//return jdbcTemplate.queryForObject(SELECT_BYID, new Object[] {id}, new BeanPropertyRowMapper<Impiegato>(Impiegato.class));	
		return jdbcTemplate.queryForObject(SELECT_BYID, new Object[] {id}, new BeanPropertyRowMapper<Impiegato>() {
			@Override
			public Impiegato mapRow(ResultSet rs, int rigaCorrente) throws SQLException{
				Impiegato imp = new Impiegato();
				imp.setId(rs.getLong(1));
				imp.setNome(rs.getString(2));
				imp.setStipendio(rs.getDouble(3));
				imp.setReparto(rs.getString(4));
				imp.setUrl_img(rs.getString(5));
				return imp;
			}
		});	

	}
	
	//ROWMapper esegue un ciclo sul risultato dell esecuzione della select
	public List<Impiegato> getImpiegati(){
		return jdbcTemplate.query(SELECT_IMP, 
				new RowMapper<Impiegato>(){
			@Override
			public Impiegato mapRow(ResultSet rs, int rigaCorrente) throws SQLException{
				Impiegato imp = new Impiegato();
				imp.setId(rs.getLong(1));
				imp.setNome(rs.getString(2));
				imp.setStipendio(rs.getDouble(3));
				imp.setReparto(rs.getString(4));
				imp.setUrl_img(rs.getString(5));
				return imp;
			}
		});
	}

	
	public Impiegato getImpStipMax() {
		return jdbcTemplate.query(SELECT_MAXSTIPENDIO, new ResultSetExtractor<Impiegato>(){
			@Override
			public Impiegato extractData(ResultSet rs) throws SQLException, DataAccessException{
				if (!rs.next()) {
                    return null;
                }
				Impiegato imp = new Impiegato();
				imp.setId(rs.getLong(1));
				imp.setNome(rs.getString(2));
				imp.setStipendio(rs.getDouble(3));
				imp.setReparto(rs.getString(4));
				imp.setUrl_img(rs.getString(5));
				return imp;
			}
		});
	}
	
	public List<Impiegato> getRepMaxStip() {
			return jdbcTemplate.query(SELECT_MAXSTIPXREP, 
				new RowMapper<Impiegato>(){
			@Override
			public Impiegato mapRow(ResultSet rs, int rigaCorrente) throws SQLException{
				Impiegato imp = new Impiegato();
				imp.setId(rs.getLong(1));
				imp.setNome(rs.getString(2));
				imp.setStipendio(rs.getDouble(3));
				imp.setReparto(rs.getString(4));
				imp.setUrl_img(rs.getString(5));
				return imp;
			}
		});	
	}
	public List<Impiegato> getAvgStipRep() {
		return jdbcTemplate.query(SELECT_AVGSTIPREP, new RowMapper<Impiegato>() {
			@Override
			public Impiegato mapRow(ResultSet rs, int rigaCorrente) throws SQLException{
				Impiegato imp = new Impiegato();
				imp.setStipendio(rs.getDouble(1));
				imp.setReparto(rs.getString(2));
				return imp;
				
			}
		});

	}	
	
}