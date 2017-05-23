package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Categorias;


public class CategoriasMapper implements RowMapper<Categorias> {
   public Categorias mapRow(ResultSet rs, int rowNum) throws SQLException {
      Categorias categorias = new Categorias();
      categorias.setIdCategoria(rs.getInt("idCategoria"));
      categorias.setDescripcion(rs.getString("descripcion"));
      
      return categorias;
   }
}
