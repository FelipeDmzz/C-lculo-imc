//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setAltura(1.70);
        pessoa1.setNome("Renato");
        pessoa1.setPeso(76);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setAltura(1.61);
        pessoa2.setNome("Julia");
        pessoa2.setPeso(92);

        pessoa1.calculaImc();
        pessoa2.calculaImc();
        pessoa1.mostraTabela();
    }
}