public class OperadoresEFluxo {
    int prioridade = 4;
    int urgencia = 8;

    public static void main(String[] args) {
        OperadoresEFluxo obj = new OperadoresEFluxo();

        if (obj.prioridade > 3 && obj.urgencia > 7) {
            System.out.println("tarefa critica");
        } else if (obj.prioridade > 3 || obj.urgencia > 7) {
            System.out.println("tarefa importante");
        } else {
            System.out.println("tarefa comum");
        }
    }
}