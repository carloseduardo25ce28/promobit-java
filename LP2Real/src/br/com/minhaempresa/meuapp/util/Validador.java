package br.com.minhaempresa.meuapp.util;

public class Validador {

	public static boolean isEmail(String email) {
		
		if(email == null || email.isBlank()) return false; //email não pode ser nulo e nem vazio
		
		boolean verificador1 = false;
		boolean verificador2 = false;
		
		int indiceArroba = -1;
		
		for(int i = 0; i < email.length(); i++) {
			
			char c = email.charAt(i);
			
			if(c == ' ') return false; //Não deve haver espaço
			
			if(c == '@') {
				if(i == 0) return false; //Deve ter pelo menos 1 caractere antes do @
				if(verificador1 == true) return false; //não pode ter mais de 1 @
				if(verificador2 == true) return false; //@ não pode vir depois do ponto
				
				indiceArroba = i;
				
				verificador1 = true;
			}
			
			if(c == '.') {
				if(verificador1 == false) return false; //não pode ter . antes do @
				if(i - indiceArroba < 1) return false; //deve haver pelo menos 1 caractere entre @ e .
				if(email.length() - i < 2) return false; //deve haver pelo menos 2 caracteres dominio de topo
				if(email.charAt(i - 1) == '.' || email.charAt(i - 1) == '@') return false; //não deve haver 2 . juntos
				
				verificador2 = true;
			}
				
		}
		
		if(!verificador1 || !verificador2) return false; //Verificadores têm que ser true
		return true;
	}
	
	public static boolean isNome(String nome) {
		
		//Basicamente verifique se no nome só tem letra (com ou sem acento), hífen e apóstrofo
		
		if(nome == null || nome.isBlank()) return false;
		
		String auxnome = nome.toLowerCase();
		
		auxnome = auxnome.replaceAll("[a-z ]", ""); //substituo caracteres de a-z e espaço por nada
		
		char[] acentuada = {'à', 'á', 'â','ã','é', 'ê', 'í', 'ó', 'ô', 'õ', 'ú', 'ç'};
		int outrosCasos = 0;
		
		for(int i = 0; i < auxnome.length(); i++) {
			char c = auxnome.charAt(i);
			for(char a: acentuada) {
				if(c == a) {
					outrosCasos++;
					break;
				}
			}
			
			if(c == '-' || c == '\''){
				outrosCasos++;
			}
		}
		
		if(auxnome.length() == outrosCasos)return true;
		return false;
	}
	
	public static boolean permissaoAdministrador(String senha) {
		if(senha.equals("uerj2025")) {
			return true;
		}
		return false;
	}
	
}




