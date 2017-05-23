package es.lucatic.peliculaslee.com.utils;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import es.lucatic.peliculaslee.com.domains.Usuarios;


public class UsuarioMapper implements RowMapper<Usuarios> {
	
	public Usuarios mapRow(ResultSet rs, int rowNum ) throws SQLException {
		Usuarios usuario = new Usuarios();
		usuario.setUsername(rs.getString("username"));
		usuario.setNombre(rs.getString("nombre"));
		usuario.setApellidos(rs.getString("apellidos"));
		usuario.setEmail(rs.getString("email"));
		usuario.setPassword(rs.getString("password"));
		usuario.setImagen(rs.getString("imagen"));
		return usuario;
	}
	
}
