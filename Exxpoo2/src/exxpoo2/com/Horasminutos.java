package exxpoo2.com;

// nessa classe vai ser aplicada a logica e criado o metodo para a conversão de horas e minutos/*
public class Horasminutos {
	
	
	// Criando o metódo /*
	public String conversaoparahorasminutos(int minutos) {
		int horas = minutos /60;
		int minutosRestantes = minutos % 60;
		
		return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
	}
	

}
