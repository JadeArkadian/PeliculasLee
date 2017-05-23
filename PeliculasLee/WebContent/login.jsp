<%@include file="WEB-INF/includes/header.jsp" %>
        
			<!-- Main -->
				<div id="main">
					<div class="inner">

    
	<section id="content">
		<form action="login.do" method="post">
			<h1>Iniciar sesion</h1>
            
			<div>
				<input type="text" placeholder="Usuario" required id="username" name="username" />
			</div>
            
			<div>
				<input type="password" placeholder="Password" required id="password" name="password" />
			</div>
            
			<div>
				<input type="submit" value="Log in" />
				<a href="register.jsp">Crear usuario</a>
			</div>
            
		</form>
        
		<div class="button">
			<c:if test="${not empty error}">
				${error}
			</c:if> 
		</div>
		
	</section>
    
</div>

</div>


<%@include file="WEB-INF/includes/footer.jsp" %>

