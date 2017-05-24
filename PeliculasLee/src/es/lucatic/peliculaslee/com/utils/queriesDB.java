	package es.lucatic.peliculaslee.com.utils;
	
	public class queriesDB 
	{
	
		
	//TABLA PELICULAS	
	public static String findAllPeliculasQuery="SELECT * FROM peliculas";
	public static String findPeliculaByIdPeliculaQuery="SELECT * FROM Peliculas WHERE idPelicula=?";
	public static String findPeliculasByTituloQuery="SELECT * FROM peliculas WHERE titulo=?";
	public static String findPeliculasByTituloLikeQuery="SELECT * FROM peliculas WHERE titulo like ?";
	public static String findPeliculasByAnioQuery="SELECT * FROM peliculas WHERE anio=?";
	public static String findPeliculasByDirectorQuery="SELECT * FROM peliculas WHERE director=?";
	public static String findPeliculasByUsernameQuery="SELECT * FROM peliculas WHERE username=?";
	public static String findLast12PeliculasQuery="SELECT * FROM peliculas ORDER BY fechaCreacion DESC LIMIT 12";
	public static String findPeliculasWithAnioHigherThanQuery="SELECT * FROM peliculas WHERE anio>?";
	public static String findPeliculasWithAnioLowerThanQuery="SELECT * FROM peliculas WHERE anio<?";
	
	public static String insertPeliculaQuery="INSERT INTO peliculas(titulo,sinopsis,anio,director,reparto,username) VALUES(?,?,?,?,?,?,?)";
	public static String updatePeliculasQuery="UPDATE peliculas SET titulo=?, sinopsis=?,anio=?,director=?,reparto=?,username=? WHERE idPelicula=?";
	public static String deletePeliculasQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	
	//TABLA CATEGORIASPORPELICULA	
	public static String findByIdPeliculaCategoriasPorPeliculaQuery="SELECT * FROM categoriasporpelicula WHERE idPelicula=?";
	public static String findByIdCategoriaCategoriasPorPeliculaQuery="SELECT * FROM categoriasporpelicula WHERE idCategoria=?";
	public static String insertCategoriasPorPeliculaQuery="INSERT INTO categoriasporpelicula values (?,?)";
	
	public static String deleteCategoriasPorPeliculaQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA CATEGORIAS
	public static String findAllCategoriasQuery="SELECT  * FROM categorias";
	public static String findByIdCategoriaCategoriasQuery="SELECT * FROM categorias WHERE idCategoria=?";
	public static String findByDescripcionCategoriasQuery="SELECT * FROM categorias WHERE descripcion=?";
	
	public static String insertCategoriasQuery="INSERT INTO categorias values (?,?)";
	public static String updateDescripcionCategoriasQuery="UPDATE categorias SET descripcion=? WHERE idCategoria=?";
	public static String deleteCategoriasQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA VALORACIONES
	public static String findByIdPeliculaAndUsernameValoracionesQuery="SELECT * FROM valoraciones WHERE idPelicula=? AND username=?";
	public static String findByIdPeliculaValoracionesQuery="SELECT * FROM valoraciones WHERE idPelicula=?";
	public static String findByUsernameValoracionesQuery="SELECT * FROM valoraciones WHERE username=?";
	public static String countValoracionesByValoracionAndPeliculaValoracionesQuery="SELECT COUNT(valoracion) FROM valoraciones WHERE idPelicula=? AND valoracion=?";
	public static String countValoracionesQuery="SELECT COUNT(valoracion) FROM valoraciones WHERE idPelicula=?";
	public static String avgValoracionesByPeliculaQuery="SELECT AVG(valoracion) 'mediaValoracion' FROM valoraciones WHERE idPelicula=?";
	
	public static String insertValoracionesQuery="INSERT INTO valoraciones values (?,?)";
	public static String deleteValoracionesQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	//TABLA COMENTARIOS
	public static String findAllComentariosQuery="SELECT  * FROM comentarios";
	public static String findByIdPeliculaAndUsernameComentariosQuery="SELECT * FROM comentarios WHERE idPelicula=? AND username=?";
	public static String findByIdPeliculaComentariosQuery="SELECT * FROM comentarios WHERE idPelicula=?";
	public static String findByUsernameComentariosQuery="SELECT * FROM comentarios WHERE username=?";
	public static String countComentariosByIdPeliculaQuery="SELECT COUNT(*) FROM comentarios where idPelicula=?";
	
	public static String insertComentariosQuery="INSERT INTO comentarios(idPelicula,username,comentario) values (?,?,?)";
	public static String deleteComentariosQuery="DELETE FROM peliculas WHERE idPelicula=?";
	
	
	
	//TABLA ADMINISTRADORES
	public static String findByUsernameAdministradoresQuery="SELECT * FROM administradores WHERE username=?";
	
	public static String insertAdministradoresQuery="INSERT INTO administradores VALUES (?)";
	
	
	
	//TABLA USUARIOS
	public static String findUsuariosByUsernameQuery="SELECT * FROM usuarios WHERE username=?";
	
	public static String insertUsuarioQuery="INSERT INTO usuarios(username, password, nombre, apellidos, email, imagen) values (?,?,?,?,?,?)";
	
	public static String updateUsuarioQuery="UPDATE usuarios SET password=?, nombre=?, apellidos=?, email=?, imagen=? WHERE username=?";
	
	public static String deleteUsuarioQuery="DELETE FROM usuarios WHERE username=?";

	}
