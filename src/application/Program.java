package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// implementação básica (processo manual)
public class Program {

	public static void main(String[] args) {

		// caminho do arquivo.
		String path = "C:\\temp\\teste.txt";

		// estabelece uma stream de leitura.
		FileReader fr = null;

		// instanciado através do fr e implementa otimizações.
		BufferedReader br = null;

		// try para criar e abrir o arquivo
		try {
			// estabelece uma stream de leitura a partir do arquivo do caminho indicado.
			fr = new FileReader(path);

			// pega a stream basica e instancia o esquema de buffer para otimizar a leitura.
			br = new BufferedReader(fr);

			// ler uma linha do arquivo, se estiver no fim do arquivo retorna null.
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
