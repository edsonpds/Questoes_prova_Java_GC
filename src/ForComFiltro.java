import java.util.ArrayList;

public class ForComFiltro {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercicios");
        tarefas.add("Revisar Código");

        for (String tarefa : tarefas){
            if (tarefa.contains("Java")){
                System.out.println("Tarefas de programação: " + tarefa);
            }
        }
    }
}
