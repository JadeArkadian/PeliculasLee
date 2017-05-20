
package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Usuario;

/**
 * Row Mapper para la clase Usuario
 * @author Jade Arkadian
 *
 */
public class UsuarioRowMapper implements RowMapper<Usuario>
{

	@Override
	public Usuario mapRow(ResultSet resultSet, int nRows) throws SQLException 
	{
		Usuario usuario = new Usuario();
		
		usuario.setId_usuario(resultSet.getString("id_usuario"));
		usuario.setEmail(resultSet.getString("email"));
		usuario.setPass(resultSet.getString("pass"));
		
		return usuario;
	}

}
