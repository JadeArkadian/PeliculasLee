<%@include file="WEB-INF/includes/header.jsp" %>
   
	<!-- Main -->
	<div id="main">
		<div class="registerBox">
		
		
		<form:form method="post" action="register.do" commandName="datosUsuario">
		
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
                   		<td> <form:label path="passwordConfirm">Confirmar password</form:label></td> 
                   		<td> <form:password path="passwordConfirm" /> </td>
                  </tr>
                   	
                   <tr>
                   		<td colspan="3"> <form:label path="email">Email</form:label></td>  
                   		<td> <form:input path="email" /> </td>      
                   		<td>Email</td>
                   </tr>
               
               </table>
           	<div class="registerRow">
				<input type="submit" value="Registrar" />
			</div>
			
		</form:form>
		
<!-- 
            <form action="register.do" method="post">
				<h1>Nuevo usuario</h1>          
                <table>
                
                    <tr><td>Nombre de usuario</td> <td colspan="3"><input type="text" required id="username" name="username" /></td>  </tr>
                    <tr><td>Nombre</td><td><input type="text" required id="nombre" name="nombre" /> </td>  <td>Apellidos</td>  <td><input type="text" required id="apellidos" name="apellidos" /> </td> </tr>
                    <tr><td>Password</td> <td> <input type="password" required id="password" name="password" /> </td> <td>Confirmar password</td> <td> <input type="password" required id="passwordConfirm" name="passwordConfirm" /></td></tr>
                    <tr><td>Email</td><td colspan="3"><input type="text" required id="email" name="email" /> </td></tr>
                
                </table>
                <div class="registerRow">
					<input type="submit" value="Registrar" />
				</div>
		           
			</form>    -->       
		</div>
	</div>
	
	

<%@include file="WEB-INF/includes/footer.jsp" %>

