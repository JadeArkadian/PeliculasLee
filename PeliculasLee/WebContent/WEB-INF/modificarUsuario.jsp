<%@include file="includes/header.jsp" %>
   
	<!-- Main -->
	<div id="main">
		<div class="registerBox">

            <form action="modificar.do" method="POST">
				<h1>Modificar usuario</h1>          
                <table>
                    <tr><td>Nombre</td><td><input type="text" required id="nombre" name="nombre" /> </td>  <td>Apellidos</td>  <td><input type="text" required id="apellidos" name="apellidos" /> </td> </tr>
                    <tr><td>Password</td> <td> <input type="password" required id="password" name="password" /> </td> <td>Confirmar password</td> <td> <input type="password" required id="passwordConfirm" name="passwordConfirm" /></td></tr>
                    <tr><td>Email</td><td colspan="3"><input type="text" required id="email" name="email" /> </td></tr>
                
                </table>
                <div class="registerRow">
                	
					<input type="submit" value="Modficar" />
				</div>
		           
			</form>     
		</div>
	</div>
	
	
<c:if test="${not empty mensaje}">
	<%@include file="includes/popup.jsp" %>
</c:if>

<%@include file="includes/footer.jsp" %>