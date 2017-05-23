package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Administradores;


public class AdministradoresMapper implements RowMapper<Administradores> {
   public Administradores mapRow(ResultSet rs, int rowNum) throws SQLException {
      Administradores administradores = new Administradores();
      administradores.setUsername(rs.getString("username"));
      return administradores;
   }
}
