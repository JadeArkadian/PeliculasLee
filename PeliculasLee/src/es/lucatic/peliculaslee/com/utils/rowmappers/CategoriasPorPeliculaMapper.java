package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.CategoriasPorPelicula;



public class CategoriasPorPeliculaMapper implements RowMapper<CategoriasPorPelicula> {
   public CategoriasPorPelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
      CategoriasPorPelicula categoriaPorPelicula = new CategoriasPorPelicula();
      categoriaPorPelicula.setIdPelicula(rs.getInt("idPelicula"));
      categoriaPorPelicula.setIdCategoria(rs.getInt("idCategoria"));
      
      return categoriaPorPelicula;
   }
}
