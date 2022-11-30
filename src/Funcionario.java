public class Funcionario {
    private final double PORCENTAGEM = 1.8;
    private String nome;
    private double salario;
    private double custo;
    private String agenda;
    public Funcionario() {
    }
    public double getPORCENTAGEM () {
        return PORCENTAGEM;
    }
    public String getNome () {
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public double getSalario () {
        return salario;
    }
    public void setSalario ( double salario){
        this.salario = salario;
        this.custo = salario * PORCENTAGEM;
    }
    public double getCusto () {
        return custo;
    }
    public void setCusto ( double custo){
        this.custo = salario * PORCENTAGEM;
    }
    public String getAgenda () {
        return agenda;
    }
    public void setAgenda (String agenda){
        this.agenda = agenda;
    }
    public void imprimir() {
        System.out.println
                ("Olá, meu nome é " + this.nome +
                        ", meu salário é R$ " + this.salario +
                        ", tenho um custo mensal de R$ " + this.custo +
                        ", trabalho com " + this.agenda + ".");
    }
}
