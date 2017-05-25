package es.lucatic.peliculaslee.com.daos;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import es.lucatic.peliculaslee.com.domains.Administradores;
import es.lucatic.peliculaslee.com.interfaces.daos.IAdministradoresDAO;
import es.lucatic.peliculaslee.com.utils.queriesDB;
import es.lucatic.peliculaslee.com.utils.rowmappers.AdministradoresMapper;


public class AdministradoresDAO implements IAdministradoresDAO {
	private DataSource dataSource;
	private static JdbcTemplate jdbcTemplateObject;

	// public Client findById(Client client);

	// public void insert(Client client);

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}


	public Administradores findById(Administradores administrador) {
		Administradores administradorAux = null;
		try {
			String SQL = queriesDB.findAdministradoresByUsernameQuery;
			administradorAux = jdbcTemplateObject.queryForObject(SQL,
					new Object[] { administrador.getUsername() }, new AdministradoresMapper());
		} catch (IncorrectResultSizeDataAccessException ex) { //no encuentra nada select
			System.out.println("excepcion" + ex);
		} catch (Exception ex) {
			System.out.println("excepcion" + ex);
		}
		System.out.println("desp");
		return administradorAux;
	}

}
