package es.lucatic.peliculaslee.com.utils;

public class Test {

	
	public static void main(String[] args) {
		String usernameValido ="Javier";
		String userNameInvalido ="Javi";
		
		String nombreValido = "Pepe";
		String nombreInvalido ="P4Pa";
		
		String pass1Valido = "Qwerty123456";
		String pass2Valido = "Qwerty123456";
		
		String pass1Invalido = "hola1";
		
		String correoValido = "jaboone26@outlook.es";
		String correoInvalido = "asd.com";
		
		System.out.println("---------Validacion username:-------");
		System.out.println("Es valido: "+ValidatorUsuario.esUsernameValido(usernameValido));
		System.out.println("Es valido: "+ValidatorUsuario.esUsernameValido(userNameInvalido));
		
		System.out.println("-------Validacion nombre:----------");
		System.out.println("Es valido: "+ValidatorUsuario.esNombreValido(nombreValido));
		System.out.println("Es valido: "+ValidatorUsuario.esNombreValido(nombreInvalido));
		
		System.out.println("--------Validacion coinciden pass-------");
		System.out.println("Es valido: "+ValidatorUsuario.coincidenLasPasswords(pass1Valido, pass2Valido));
		System.out.println("Es valido: "+ValidatorUsuario.coincidenLasPasswords(pass1Valido, "pepe"));
		
		System.out.println("--------Validacion de Contraseña valida-------");
		System.out.println("Es valido: "+ValidatorUsuario.esPasswordValida(pass1Valido));
		System.out.println("Es valido: "+ValidatorUsuario.esPasswordValida(pass1Invalido));
		
		System.out.println("---------Validacion de email:-----------");
		System.out.println("Es valido: "+ValidatorUsuario.esValidoMail(correoValido));
		System.out.println("Es valido: "+ValidatorUsuario.esValidoMail(correoInvalido));
		
	}

}
