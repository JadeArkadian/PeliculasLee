<%@ page import="java.util.List, es.lucatic.peliculaslee.com.service.PeliculasService, es.lucatic.peliculaslee.com.domains.Peliculas" %>
<%@include file="WEB-INF/includes/header.jsp" %>

<%
// Esto es una chapa...
PeliculasService peliculasService = new PeliculasService ();
List<Peliculas> peliculas = peliculasService.findAllPeliculas();
request.setAttribute("peliculas", peliculas);
%>

        <!-- Banner -->
        <section id="banner"></section>
        <!-- MENSAJE -->
        <p>${mensaje}</p>
			<!-- Main -->
				<div id="main">
					<div class="inner">
					<!-- Boxes -->
						<div class="thumbnails">
						
							<c:forEach items="${peliculas}" var="pelicula">
								<div class="box">
									<a href="verPelicula.do?idPelicula=${pelicula.getIdPelicula()}" class="image fit">
										<img src="images/movies/${pelicula.getImagen()}" alt="${pelicula.getTitulo()}" />
									</a>
									<div class="inner">
										<h3> ${pelicula.getTitulo()}</h3>
									</div>
								</div>
							</c:forEach>	
												
						</div>
					</div>
				</div>


<%@include file="WEB-INF/includes/footer.jsp" %>