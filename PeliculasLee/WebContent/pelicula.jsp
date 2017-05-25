<%@include file="WEB-INF/includes/header.jsp"%>



<!-- Main -->
<div id="main">
	<div class="innerMovie">
		<div class="thumbnails">

			<div class="leftPane">
				<h2>Datos de la pelicula</h2>
				<table>
					<tr>
						<td>Titulo:</td>
						<td>${pelicula.titulo}</td>
					</tr>
					<tr>
						<td>Año:</td>
						<td>${pelicula.anio}</td>
					</tr>
					<tr>
						<td>Director:</td>
						<td>${pelicula.director}</td>
					</tr>
					<tr>
						<td>Reparto:</td>
						<td>${pelicula.reparto}</td>
					</tr>
					<tr>
						<td>Generos:</td>
						<td>${categoriasPeliculaActual}</td>
					</tr>
					<tr>
						<td>Sinoposis:</td>
						<td>${pelicula.sinopsis}</td>
					</tr>
				</table>
				<c:set var="i" value="0"></c:set>
				<h2>Comentarios</h2>
				<c:forEach items="${comentariosPeliculaActual}" var="comentario">
				<div class="comentario">
					<p>
						<strong>${usuariosComentario[i]}</strong>
					</p>
					<p>${comentario.comentario }</p>
				</div>
				<c ${i=i+1}></c>
				</c:forEach>
				

				<h2>Escribir un comentario</h2>

				<form action="escribirComentario.do" id="escribirComentario"
					name="escribirComentario" method="post">

					<textarea form="escribirComentario" class="myCommentBox"></textarea>

					<input class="special" type="submit" value="Enviar">
				</form>



			</div>

			<div class="rightPane">
				<a href="https://youtu.be/s6zR2T9vn2c" class="image fit"><img
					src="images/movies/ghost_in_the_shell.jpg" alt="ghost_in_the_shell" /></a>
				<table>
					<tr>
						<td class="nota">Numero valoraciones: ${numValoracionesPeliculaActual} 
							<p>Nota:</p>
								<p>${valoracionAVGPeliculaActual}</p>
						</td>
						<td>
							<div class="pollBars">
								1<span class="t2" style="width: 10%">69</span> 2<span class="t2"
									style="width: 20%">100</span> 3<span class="t2"
									style="width: 70%">200</span> 4<span class="t2"
									style="width: 90%">666</span> 5<span class="t2"
									style="width: 100%">Over 9000!!</span>
							</div>
						</td>
					</tr>
					<tr class="stars">
					<form action="valorar.do">
						<ul class="rate-area">
							<input type="radio" id="5-star" name="estrellas" value="5" />
							<label for="5-star" title="Amazing">5 stars</label>
							<input type="radio" id="4-star" name="estrellas" value="4" />
							<label for="4-star" title="Good">4cvn  stars</label>
							<input type="radio" id="3-star" name="estrellas" value="3" />
							<label for="3-star" title="Average">3 stars</label>
							<input type="radio" id="2-star" name="estrellas" value="2" />
							<label for="2-star" title="Not Good">2 stars</label>
							<input type="radio" id="1-star" name="estrellas" value="1" />
							<label for="1-star" title="Bad">1 star</label>
							</ul>
							</form>
						
					</tr>
				</table>
			</div>
		</div>
	</div>
</div>


<%@include file="WEB-INF/includes/footer.jsp"%>

