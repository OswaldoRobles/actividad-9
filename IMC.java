import java.util.Scanner;

class Paciente {
    private double peso;
    private double altura;

    // Constructor
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos getters y setters encapsulados
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el IMC
    public String calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 18.5)                         return "Bajo peso";
        else if (imc >= 18.5 && imc <= 24.9)    return "Peso normal";
        else if (imc >= 25 && imc <= 29.9)      return "Sobrepeso";
        else if (imc >= 30 && imc <= 34.9)      return "Obesidad tipo 1";
        else if (imc >= 35 && imc <= 39.9)      return "Obesidad tipo 2";
        else                                    return "Obesidad tipo 3";
    }
}

public class IMC {
    static Paciente paciente;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingresa tu altura en metros: ");
            double altura = scanner.nextDouble();

            paciente = new Paciente(peso, altura);

            // Invocar el método calcularIMC
            String diagnostico = paciente.calcularIMC();
            System.out.println("Diagnóstico: " + diagnostico);
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Por favor ingrese números.");
        }

        scanner.close();
    }
}
