<%@include file="includes/header.jsp" %>
   
	<!-- Main -->
	<div id="main">
		<div class="registerBox">
		
		<form:form method="post" action="addaltausuario.do" commandName="datosUsuario">
		
			<h1>Nuevo usuario</h1>          
               <table>
               
                  <tr>
                   		<td><form:label path="username">Nombre de usuario </form:label></td> 
                   		<td colspan="3"> <form:input path="username" /></td>  
                   		
                  </tr>
                   	
                  <tr>
                   		<td> <form:label path="nombre">Nombre</form:label></td> 
                   		<td> <form:input path="nombre" /> </td>
                   		<td> <form:label path="apellidos">Apellidos</form:label></td>  
                   		<td> <form:input path="apellidos" /> </td> 
                  </tr>
                   
                  <tr>
                   		<td> <form:label path="password">Password</form:label></td> 
                   		<td> <form:password path="password" /> </td>
                   	<td> <form:label path="passwordconfirm">Confirmar password</form:label></td> 
                   		<td> <form:password path="passwordconfirm" /> </td> 
                  </tr>
                   	
                   <tr>
                   		<td> <form:label path="email">Email</form:label></td>  
                   		<td colspan="3"> <form:input path="email" /> </td>      
                   </tr>
               
               </table>
           	<div class="registerRow">
				<input class="special" type="submit" value="Registrar" />
			</div>

		</form:form>
		     
		</div>
	</div>
	
	
<c:if test="${not empty mensaje}">
	<%@include file="includes/popup.jsp" %>
</c:if>
<%@include file="includes/footer.jsp" %>

