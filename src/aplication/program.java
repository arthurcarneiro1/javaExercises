package aplication; // Define o pacote onde essa classe está localizada (nome correto seria "application")

import entities.Rectangle; // Importa a classe Rectangle do pacote entities

import java.util.Locale; // Importa a classe Locale para configurar o formato de números
import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class program { // Declara a classe principal (por convenção, deveria ser "Program")
    public static void main(String[] args) {//Método principal, ponto de entrada da aplicação

        Locale.setDefault(Locale.US); // Define o formato de números para o padrão dos EUA (usa ponto como separador decimal)

        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entrada do usuário

        System.out.println("Enter rectangle width and height:"); // Exibe mensagem pedindo largura e altura do retângulo

        Rectangle x = new Rectangle(); // Cria um novo objeto Rectangle chamado x
        x.width = sc.nextDouble(); // Lê a largura do retângulo do teclado e armazena em x.width
        x.height = sc.nextDouble(); // Lê a altura do retângulo e armazena em x.height

        System.out.println(x); // Imprime o objeto x (chama automaticamente o método toString() da classe Rectangle)

        sc.close(); // Fecha o Scanner para liberar o recurso de entrada

    }
}
