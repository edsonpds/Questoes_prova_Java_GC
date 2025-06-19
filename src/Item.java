public class Item {
    String nome;
    int quantidade;

    public Item(String nome){
        this.nome = nome;
        this.quantidade =1;

    }
    public  Item(String nome,int quantidade){
        this.nome=nome;
        this.quantidade =quantidade;
    }

    public static void main(String[] args) {
        Item x= new Item("caderno");
        Item y= new Item("caneta",3);

        System.out.println(x.quantidade + y.quantidade);
    }
}
