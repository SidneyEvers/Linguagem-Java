package Poo;

public class Aluno {
    private String nome;
    private Double[] notas;

    public Aluno() {

    }

    public Aluno(String nome, Double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public void SetNota(int index, Double nota) {

        if (index >= 0 && index < notas.length) {

            notas[index] = nota;
        }
    }

    public Double GetMedia(){

        Double acumulador = 0d;
        for(Double nota : notas){
            acumulador += nota;
            
        }
        return acumulador / notas.length;
    }

}
