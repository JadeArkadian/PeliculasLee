package es.lucatic.peliculaslee.com.utils.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import es.lucatic.peliculaslee.com.domains.Comentarios;


public class ComentariosMapper implements RowMapper<Comentarios> {
   public Comentarios mapRow(ResultSet rs, int rowNum) throws SQLException {
      Comentarios comentarios = new Comentarios();
      comentarios.setIdPelicula(rs.getInt("idPelicula"));
      comentarios.setUsername(rs.getString("username"));
      comentarios.setComentario(rs.getString("comentario"));
      
      return comentarios;
   }
}
