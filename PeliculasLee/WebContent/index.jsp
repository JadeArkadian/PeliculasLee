<%@ page import="java.util.List, es.lucatic.peliculaslee.com.service.PeliculasService, es.lucatic.peliculaslee.com.domains.Peliculas" %>
<%@include file="WEB-INF/includes/header.jsp" %>

<%
// Esto es una chapa...

if (request.getSession().getAttribute("peliculas") == null)
{
	PeliculasService peliculasService = new PeliculasService ();
	List<Peliculas> peliculas = peliculasService.findAllPeliculas();
	request.getSession().setAttribute("peliculas", peliculas);
}
%>

        <!-- Banner -->
        <section id="banner"></section>
			<!-- Main -->
				<div id="main">
					<div class="inner">
					
					<div align="center">
						<form id="filtrar" name="filtrar" method="post"
						action="filtrarByValoracion.do" >
							 <select size="1" name="filtrar" id="filtrar" onchange="this.form.submit()"  style="width: 300px">
							 	<option value="-1" >Filtrar por...</option>
							 	<option value="0" >Todas</option>
							 	<option value="1" >Mejor Valoradas</option>
						
							</select>						
						</form>
						</div>
					<nav id="menucaletras">
						<ul class="ulMenu">
						<%! String[] abecedario={"A","B","C","D","E","F","G","H","I","J","K","L","M","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};%>
						
						<% for( int i=0;i<abecedario.length;i++){ %>
					
							<li class="letras"><a href="filtrarByLetras.do?letra=<%=abecedario[i] %>" ><%=abecedario[i] %></a></li>
							<%} %>
										</ul>
						</nav>	
					
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


<c:if test="${not empty mensaje}">
	<%@include file="WEB-INF/includes/popup.jsp" %>
</c:if>
<%@include file="WEB-INF/includes/footer.jsp" %>