
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

		usuario.setUsername(resultSet.getString("username"));
		usuario.setNombre(resultSet.getString("nombre"));
		usuario.setApellidos(resultSet.getString("apellidos"));
		usuario.setEmail(resultSet.getString("email"));
		usuario.setPassword(resultSet.getString("password"));
		usuario.setImagen(resultSet.getString("imagen"));
		
		return usuario;
	}

}
