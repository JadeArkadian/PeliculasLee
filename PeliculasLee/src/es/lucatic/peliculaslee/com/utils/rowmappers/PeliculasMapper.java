package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Peliculas;


public class PeliculasMapper implements RowMapper<Peliculas> 
{
   public Peliculas mapRow(ResultSet rs, int rowNum) throws SQLException 
   {
      Peliculas peliculas = new Peliculas();
      peliculas.setIdPelicula(rs.getInt("idPelicula"));
      peliculas.setTitulo(rs.getString("titulo"));
      peliculas.setAnio(rs.getInt("anio"));
      peliculas.setDirector(rs.getString("director"));
      peliculas.setImagen(rs.getString("imagen"));
      peliculas.setReparto(rs.getString("reparto"));
      peliculas.setSinopsis(rs.getString("sinopsis"));

      return peliculas;
   }
}
