package beans;

/**
 *
 * @author José Flávio
 */
public class Aluno {
    
    private String matricula;
    private String nome;
    private int periodo;
    private int anoDeIngresso;
    private double renda;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, int periodo, int anoDeIngresso, double renda) {
        this.matricula = matricula;
        this.nome = nome;
        this.periodo = periodo;
        this.anoDeIngresso = anoDeIngresso;
        this.renda = renda;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
    
}
