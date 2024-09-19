package exxpoo2.com;


// nessa classe vai ser criado os metodos e aplicado toda a logica para instanciar e outra classe/*
public class Fatorial {
	
	// Criando o metódo/*
	public long calculofatorial (int numero) {
		long fatorial = 1;
	
	//fazendo a lógica pro calculo do fatorial/*
	for (int i = 1; i <= numero; i++) {
        fatorial *= i;
    }

	

return fatorial;
}
}