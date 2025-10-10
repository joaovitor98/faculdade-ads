package aula6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ExemploJavaIO {
    static void main() {
        String nomeArquivo = "exemplo.txt";

        try (BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo))) {
            escrita.write("Ola! Este é um exemplo de JavaIO\n");
            escrita.write("Estamos escrevendo texto em um arquivo\n");
            escrita.write("Depois vamos ler esse conteudo");

            System.out.println("Arquivo criado e texto escrito com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
