package BorientacaoObjetos.Aintroducao.entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        return notaFinal() >= 60.0;
    }

    public double pontosFaltando() {
        if (aprovado()) return 0.0;
        return 60.0 - notaFinal();
    }

    @Override
    public String toString() {
        String result = "Student: " + name + "\n"
                + String.format("FINAL GRADE = %.2f%n", notaFinal());
        if (notaFinal() >= 60.0) {
            result += "PASS";
        } else {
            result += "FAILED\n";
            result += String.format("MISSING %.2f POINTS", 60.0 - notaFinal());
        }
        return result;
    }
}
