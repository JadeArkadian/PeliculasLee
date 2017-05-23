package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Usuarios;


public class UsuariosMapper implements RowMapper<Usuarios> {
   public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException {
      Usuarios usuarios = new Usuarios();
      usuarios.setUsername(rs.getString("username"));
      usuarios.setPassword(rs.getString("password"));
      usuarios.setNombre(rs.getString("nombre"));
      usuarios.setApellidos(rs.getString("apellidos"));
      usuarios.setEmail(rs.getString("email"));
      usuarios.setImagen(rs.getString("imagen"));
      
      return usuarios;
   }
}
