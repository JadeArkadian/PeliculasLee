	package es.lucatic.peliculaslee.com.utils;
	
	public class QueriesDb 
	{
	
	//TABLA PELICULAS	
	public static String findAllPeliculasQuery="SELECT * FROM peliculas";
	public static String findPeliculaByIdPeliculaQuery="SELECT * FROM peliculas WHERE idPelicula=?";
	public static String findPeliculasByTituloQuery="SELECT * FROM peliculas WHERE titulo=?";
	public static String findPeliculasByTituloLikeQuery="SELECT * FROM peliculas WHERE titulo like ?";
	public static String findPeliculasByAnioQuery="SELECT * FROM peliculas WHERE anio=?";
	public static String findPeliculasByDirectorQuery="SELECT * FROM peliculas WHERE director=?";
	public static String findPeliculasByUsernameQuery="SELECT * FROM peliculas WHERE username=?";
	public static String findLast12PeliculasQuery="SELECT * FROM peliculas ORDER BY idPelicula DESC LIMIT 12";
	public static String findPeliculasWithAnioHigherThanQuery="SELECT * FROM peliculas WHERE anio>?";
	public static String findPeliculasWithAnioLowerThanQuery="SELECT * FROM peliculas WHERE anio<?";
	
	public static String insertPeliculaQuery="INSERT INTO peliculas(titulo,sinopsis,anio,director,reparto,username) VALUES(?,?,?,?,?,?,?)";
	public static String updatePeliculasQuery="UPDATE peliculas SET titulo=?, sinopsis=?,anio=?,director=?,reparto=?,username=? WHERE idPelicula=?";
	public static String deletePeliculasQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	
	//TABLA CATEGORIASPORPELICULA	
	public static String findCategoriasPorPeliculaByIdPeliculaQuery="SELECT * FROM categoriasporpelicula WHERE idPelicula=?";
	public static String findCategoriasPorPeliculaByIdCategoriaQuery="SELECT * FROM categoriasporpelicula WHERE idCategoria=?";
	
	public static String insertCategoriasPorPeliculaQuery="INSERT INTO categoriasporpelicula values (?,?)";
	public static String deleteCategoriasPorPeliculaQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA CATEGORIAS
	public static String findAllCategoriasQuery="SELECT * FROM categorias";
	public static String findCategoriaByIdCategoriaQuery="SELECT * FROM categorias WHERE idCategoria=?";
	
	public static String insertCategoriaQuery="INSERT INTO categorias(descripcion) values (?)";
	public static String updateDescripcionQuery="UPDATE categorias SET descripcion=? WHERE idCategoria=?";
	public static String deleteCategoriaQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA VALORACIONES
	public static String findValoracionesByIdPeliculaAndUsernameQuery="SELECT * FROM valoraciones WHERE idPelicula=? AND username=?";
	public static String findValoracionesByIdPeliculaQuery="SELECT * FROM valoraciones WHERE idPelicula=?";
	public static String findValoracionesByUsernameQuery="SELECT * FROM valoraciones WHERE username=?";
	public static String countValoracionesByValoracionAndPeliculaQuery="SELECT COUNT(valoracion) FROM valoraciones WHERE idPelicula=? AND valoracion=?";
	public static String countValoracionesByIdPeliculaQuery="SELECT COUNT(valoracion) FROM valoraciones WHERE idPelicula=?";
	public static String avgValoracionesByPeliculaQuery="SELECT AVG(valoracion) 'mediaValoracion' FROM valoraciones WHERE idPelicula=?";
	
	public static String insertValoracionQuery="INSERT INTO valoraciones values (?,?)";
	public static String deleteValoracionQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA COMENTARIOS
	public static String findAllComentariosQuery="SELECT  * FROM comentarios";
	public static String findComentarioByIdPeliculaAndUsernameQuery="SELECT * FROM comentarios WHERE idPelicula=? AND username=?";
	public static String findComentariosByIdPeliculaQuery="SELECT * FROM comentarios WHERE idPelicula=?";
	public static String findComentariosByUsernameQuery="SELECT * FROM comentarios WHERE username=?";
	public static String countComentariosByIdPeliculaQuery="SELECT COUNT(*) FROM comentarios where idPelicula=?";
	
	public static String insertComentarioQuery="INSERT INTO comentarios(idPelicula,username,comentario) values (?,?,?)";
	public static String deleteComentarioQuery="DELETE FROM peliculas WHERE idPelicula=? AND username=?";
	
	
	
	//TABLA ADMINISTRADORES
	public static String findAdministradoresByUsernameQuery="SELECT * FROM administradores WHERE username=?";	
	
	
	//TABLA USUARIOS
	public static String findUsuariosByUsernameQuery="SELECT * FROM usuarios WHERE username=?";
	
	public static String insertUsuarioQuery="INSERT INTO usuarios(username, password, nombre, apellidos, email, imagen) values (?,?,?,?,?,?)";
	
	public static String updateUsuarioQuery="UPDATE usuarios SET password=?, nombre=?, apellidos=?, email=?, imagen=? WHERE username=?";
	
	public static String deleteUsuarioQuery="DELETE FROM usuarios WHERE username=?";

	}
