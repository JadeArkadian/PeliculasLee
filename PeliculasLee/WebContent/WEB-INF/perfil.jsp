<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@include file="includes/header.jsp"%>
<%@ page import="es.lucatic.peliculaslee.com.domains.Usuarios"%>
<%@ page import="es.lucatic.peliculaslee.com.domains.Peliculas"%>
<%@ page import="es.lucatic.peliculaslee.com.domains.Comentarios"%>
<%@ page import="java.util.List"%>
<section id="imagenUsuario" class="secusu">
	<%
		Usuarios user = (Usuarios) request.getSession().getAttribute("usuario");
	%>
	<!-- Esto sustituye al avatar:  user.getImagen() -->
	<img alt="avatar" src="images/avatares/avatar.png">
</section>
<section id="datosUsuario" class="secusu">
	<table>
		<tr>
			<td>Username:</td>
			<td><%=user.getUsername()%></td>
		</tr>
		<tr>
			<td>Nombre:</td>
			<td><%=user.getNombre()%></td>
		</tr>
		<tr>
			<td>Apellidos:</td>
			<td><%=user.getApellidos()%></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><%=user.getEmail()%></td>
		</tr>
		<tr>
			<td><a href="modificarUsuario.do"><p>*Pincha aqui, para
						modificar tus datos.</p></a></td>
		</tr>
	</table>
</section>
<section id="misComentarios">
	<% List<Peliculas> pelis = (List<Peliculas>) request.getSession().getAttribute("peliculasComentadasUsuario");%>
	<c:out value="${mensaje}"></c:out>
		<table>
			<tr>
			<c:set var="i" value="0"></c:set>
				<td>Pelicula</td>
				<td>Nº Comentarios: <%=pelis.size() %> </td>
			</tr>
			
				<c:forEach items="${peliculasComentadasUsuario}" var="pelicula">
			<tr>
					<td>${pelicula.getTitulo()}</td>
				
				
					<td>${comentariosUsuario[i]}</td>
				<c${i=i+1}></c>
			
			</tr> 
			</c:forEach>
		</table>
</section>

<%@include file="includes/footer.jsp"%>
