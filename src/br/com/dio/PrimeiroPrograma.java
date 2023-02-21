package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Books books = new Books();
		System.out.println(gato);
		System.out.println(books);
		
		
	
	}

}

class Books {
	private String nome;
	private String npag;
}