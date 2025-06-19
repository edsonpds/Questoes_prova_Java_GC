/*public class Usuario {
    String nome;
    int idade;

    public Usuario(String n,int i){
        nome = n;
        idade= i;
    }
}*/
public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Instanciando um objeto da classe Usuario corretamente
        Usuario u = new Usuario("João", 25);
        u.exibirDados();
    }
}