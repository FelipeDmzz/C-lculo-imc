import java.text.DecimalFormat;


public class Pessoa {
    private String nome;
    private double peso;
    private double altura;


    public Pessoa(){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void calculaImc(){
        double imc = peso/(altura * altura);
        System.out.println("\n" + nome + ", o seu imc é de: " + new DecimalFormat(".##").format(imc));
        if (imc <=18.5) {
            System.out.println("Você está abaixo do peso");
        }
        else if(imc <= 24.9 ){
            System.out.println("Você está no peso adequado");
        }
        else if (imc <= 29.9) {
            System.out.println("Você está com sobrepeso");
        }
        else if (imc <= 34.9) {
            System.out.println("Você está com obesidade grau 1");
        }
        else if (imc <= 39.9) {
            System.out.println("Você está com obesidade grau 2");
        }
        else {
            System.out.println("Você está com obesidade grave");
        }
    }

    public void mostraTabela(){
        System.out.println("\nIMC < 18,5 - baixo peso. \nIMC > 18,5 até 24,9 - eutrofia (peso adequado) \nIMC ≥ 25 até 29,9 - sobrepeso.");
        System.out.println("IMC > 30,0 até 34,9 - obesidade grau 1. \nIMC > 35kg/m2 até 39,9 - obesidade grau 2. \nIMC > 40 - obesidade grave.");
    }



}
