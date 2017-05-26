<%@include file="includes/header.jsp" %>
        
	<!-- Main -->
	<div id="main">
		<div class="loginBox">

				
				<form:form method="post" action="login.do" commandName="datosUsuario">
				
					<h1>Iniciar sesion</h1>
			           
					<div>	
						<form:input path="username" />
					</div>
			           
					<div>
						<form:password path="password" />
					</div>
			           
					<div>
						<input type="submit" value="Log in" />
						<a href="register.do">Crear usuario</a>
					</div>
					
				</form:form>
		          		  
		</div>
	</div>

<c:if test="${not empty mensaje}">
	<%@include file="includes/popup.jsp" %>
</c:if>
<%@include file="includes/footer.jsp" %>

