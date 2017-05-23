package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Valoraciones;


public class ValoracionesMapper implements RowMapper<Valoraciones> {
   public Valoraciones mapRow(ResultSet rs, int rowNum) throws SQLException {
      Valoraciones valoraciones = new Valoraciones();
      valoraciones.setIdPelicula(rs.getInt("idPelicula"));
      valoraciones.setUsername(rs.getString("username"));
      valoraciones.setValoracion(rs.getInt("valoracion"));
      
      return valoraciones;
   }
}
