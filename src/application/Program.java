package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Forma otimizada, utilizando try-with-resources
 */

// implementação básica (processo manual)
public class Program {

	public static void main(String[] args) {

		// caminho do arquivo.
		String path = "C:\\temp\\teste.txt";

		// try para criar e abrir o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// ler uma linha do arquivo, se estiver no fim do arquivo retorna null.
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
