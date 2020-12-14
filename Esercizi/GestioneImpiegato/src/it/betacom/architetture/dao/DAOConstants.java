package it.betacom.architetture.dao;

public interface DAOConstants {
	String IMPSEQ_NEXTVAL = "Select imp_seq.nextval from dual";
	String INSERT_IMP = "Insert into impiegato values(?,?,?,?,?)";
	String UPDATE_IMP = "Update impiegato set nome = ?, stipendio = ?, reparto = ?, url_img = ? where id = ?";
	String DELETE_IMP = "Delete from impiegato where id = ?";
	String SELECT_BYID = "Select * from impiegato where id = ?";
	String SELECT_IMP = "Select * from impiegato";
	
	String INSERT_UTENTE = "Insert into utente_spr values(?,?,?)";
	
	String SELECT_USERPASS = "Select password from utente_spr where username = ?";
	
	//STATISTICHE
	String SELECT_MAXSTIPENDIO = "Select * from impiegato where stipendio = (select max(stipendio) from impiegato)";
	String SELECT_MAXSTIPXREP = "Select * from impiegato where stipendio = (select max(stipendio) from impiegato)";
	String SELECT_AVGSTIPREP = "Select avg(stipendio), reparto from impiegato group by reparto";
}
