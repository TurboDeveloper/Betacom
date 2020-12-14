package it.betacom.architetture.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import it.betacom.businnessmodel.model.Utente;

public class UtenteDAO implements DAOConstants{
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int create(Utente u) {	
		return jdbcTemplate.update(INSERT_UTENTE,
				new Object[] {u.getUsername(), u.getNascita(), u.getPassword()});
	}
/*	
	public int update(Impiegato i) {
		return jdbcTemplate.update(UPDATE_IMP,
				new Object[] {i.getNome(), i.getStipendio(), i.getReparto(), i.getId()});
	}
	
	public int delete(long id) {
		return jdbcTemplate.update(DELETE_IMP,
				new Object[] {id});	
	}
	
	public Impiegato getById(long id) {
		return jdbcTemplate.queryForObject(SELECT_BYID, new Object[] {id}, new BeanPropertyRowMapper<Impiegato>(Impiegato.class));	
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
				return imp;
			}
		});
	}
	*/
}