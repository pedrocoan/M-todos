package exxpoo2.com;


// Nessa classe vai ser aplicado o metodo e a lógica da classe Fatorial/*
public class AplicacaoFatorial {

	public static void main(String[] args) {
		
		// Criando o objeto/*
		Fatorial calcular = new Fatorial ();
		
	
	int numero = 3;
	// Armazenando o resultado/*
	long resultado = calcular.calculofatorial(numero);
	
	// Concatenando pra imprimir na tela/*
	 System.out.println("O fatorial de " + numero + " é: " + resultado);
	}

}
