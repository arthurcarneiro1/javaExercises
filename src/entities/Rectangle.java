package entities; // Define o pacote onde essa classe está localizada

public class Rectangle { // Declara a classe Rectangle

    public double width;  // Atributo público que representa a largura do retângulo
    public double height; // Atributo público que representa a altura do retângulo

    // Método que calcula a área do retângulo
    public double area() {
        return width * height; // Fórmula da área: base * altura
    }

    // Método que calcula o perímetro do retângulo
    public double perimeter() {
        return 2 * (width + height); // Fórmula do perímetro: 2 * (largura + altura)
    }

    // Método que calcula a diagonal do retângulo
    public double diagonal() {
        // Fórmula da diagonal (Teorema de Pitágoras): raiz quadrada de (width² + height²)
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    // Sobrescreve o método toString() para imprimir os dados do retângulo formatados
    @Override
    public String toString() {
        // Retorna uma String formatada com 2 casas decimais e quebra de linha (%n)
        return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f",
                area(), perimeter(), diagonal());
    }
}
