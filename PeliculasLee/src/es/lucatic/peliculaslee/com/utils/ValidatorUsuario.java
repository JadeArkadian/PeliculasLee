package es.lucatic.peliculaslee.com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUsuario {
	/**
	 * 
	 * @param username
	 * @return true en caso de que sea mayor a 4, false en caso contrario.
	 */
	public static boolean esUsernameValido(String username){
		return username.length()>4;
	}
	/**
	 * 
	 * @param pass1 Contrasenia
	 * @param pass2 Repetir Contrasenia
	 * @return true en caso de que las contrasenias coincidan
	 */
	public static boolean coincidenLasPasswords(String pass1, String pass2){
		return pass1.equals(pass2);
	}
	/**
	 * 
	 * @param nombre
	 * @return en caso de encontrar un digito, o sea null o vacio devolvera false,
	 *  si es valido devolvera true;
	 */
	public static boolean esNombreValido(String nombre){
		boolean resultado = true;
		int contador = 0;
		if(nombre == null || nombre.isEmpty()){
			resultado = false;
		} else{
			for (int i = 0; i < nombre.length(); i++) {
				char caracter = nombre.charAt(i);
				if(Character.isDigit(caracter)){
					contador++;
				}
			}
		}
		if(contador>=1){
			resultado = false;
		}
		return resultado;
	}
	/**
	 * 
	 * @param correo
	 * @return true en caso de correo valido, en otro caso retornara false;
	 */
	public static boolean esValidoMail(String correo){
		String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
	}
	/**
	 * 
	 * @param pass
	 * @return true si tiene al menos 1 digito, al menos 1 letra (de la 'a' a la 'Z'). En caso contrario devuelve false.
	 * ^                 # start-of-string
	 *(?=.*[0-9])       # a digit must occur at least once
	 *(?=.*[a-z])       # a lower case letter must occur at least once
	 *(?=.*[A-Z])       # an upper case letter must occur at least once
	 *(?=.*[@#$%^&+=])  # a special character must occur at least once
	 *(?=\S+$)          # no whitespace allowed in the entire string
	 *.{8,}             # anything, at least eight places though
	 *$                 # end-of-string
	 */
	public static boolean esPasswordValida(String pass){
		String PATTERN_PASS = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(PATTERN_PASS);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
	}
	
	public static boolean hayCamposVacios(String username, String nombre, String apellido, String pass, String repass, String correo){
		return username.isEmpty() || username.equals("") && nombre.isEmpty() || nombre.equals("") && apellido.isEmpty() || apellido.equals("") && pass.isEmpty() ||
				pass.equals("") && repass.isEmpty() || repass.equals("") &&  correo.isEmpty() || correo.equals("");
			
	}
	
}
