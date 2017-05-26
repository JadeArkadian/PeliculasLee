<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>

<!DOCTYPE html>
<html>
	<head>
		<title>Full Motion</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="css/styles.css" />
	</head>
	<body id="top">
			
        <!-- Header menu -->
        <header id="header">
            <div class="inner">
                <nav id="nav">
                    <a href="index.jsp">Home</a>
                    
                    <c:if test="${not empty usuario}">
                    	<a href="perfil.do">Mi Perfil</a>
                    	<a href="logout.do">Cerrar Sesion</a>
                    </c:if>	
                    
                    <c:if test="${empty usuario}">
                    	<a href="logearse.do">Iniciar Sesion</a>
                    	<a href="register.do">Registrarse</a>
                    </c:if>	
                </nav>
                <a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
            </div>
        </header>
        
        