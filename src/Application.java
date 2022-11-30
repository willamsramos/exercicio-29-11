public class Application {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alex");
        funcionario.setSalario(1000.00);
        funcionario.setAgenda("Lista telefonica");
        funcionario.imprimir();

        Programador programador = new Programador();
        programador.setNome("Diana");
        programador.setSalario(7500.00);
        programador.setCodigo("HTML, CSS");
        programador.imprimir();

        Analista analista = new Analista();
        analista.setNome("Rebeca");
        analista.setSalario(2000.00);
        analista.setDocumentacao("Lista de eventos");
        analista.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("Willams");
        gerente.setSalario(2500.00);
        gerente.setSubordinados("varios");
        gerente.imprimir();
    }
}
