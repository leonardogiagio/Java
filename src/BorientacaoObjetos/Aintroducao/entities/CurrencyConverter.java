package BorientacaoObjetos.Aintroducao.entities;

public class CurrencyConverter {
    public static final double IOF = 6;

    public static double paidInReais(double dollarPrice, double dollarAmount) {
        double base = dollarPrice * dollarAmount;
        return base + base * (IOF / 100);
    }
}
