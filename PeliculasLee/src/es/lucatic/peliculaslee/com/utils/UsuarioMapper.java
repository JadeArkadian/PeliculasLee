package es.lucatic.peliculaslee.com.utils;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import es.lucatic.peliculaslee.com.domains.Usuario;


public class UsuarioMapper implements RowMapper<Usuario> {
	
	public Usuario mapRow(ResultSet rs, int rowNum ) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setUsername(rs.getString("username"));
		usuario.setNombre(rs.getString("nombre"));
		usuario.setApellidos(rs.getString("apellidos"));
		usuario.setEmail(rs.getString("email"));
		usuario.setPassword(rs.getString("password"));
		usuario.setImagen(rs.getString("imagen"));
		return usuario;
	}
	
}
