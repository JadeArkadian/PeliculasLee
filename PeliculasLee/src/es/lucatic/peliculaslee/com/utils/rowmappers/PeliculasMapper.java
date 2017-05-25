package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Peliculas;


public class PeliculasMapper implements RowMapper<Peliculas> {
   public Peliculas mapRow(ResultSet rs, int rowNum) throws SQLException {
      Peliculas peliculas = new Peliculas();
      peliculas.setIdPelicula(rs.getInt("idPelicula"));
      peliculas.setTitulo(rs.getString("titulo"));
      peliculas.setImagen(rs.getString("imagen"));
      peliculas.setSinopsis(rs.getString("sinopsis"));
      peliculas.setAnio(rs.getInt("anio"));
      peliculas.setDirector(rs.getString("director"));
      peliculas.setReparto(rs.getString("reparto"));
      peliculas.setUsername(rs.getString("username"));
      peliculas.setImagen(rs.getString("imagen"));
      return peliculas;
   }
}
