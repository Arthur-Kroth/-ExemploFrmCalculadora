package model;

public class Calculadora {
    private double valorA;
    private double valorB;

    // Métodos para definir os valores
    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    // Soma
    public double getSoma() {
        return valorA + valorB;
    }

    // Subtração
    public double getDiferenca() {
        return valorA - valorB;
    }

    // Multiplicação
    public double getProduto() {
        return valorA * valorB;
    }

    // Divisão (com verificação de divisão por zero)
    public double getQuociente() {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return valorA / valorB;
    }
}