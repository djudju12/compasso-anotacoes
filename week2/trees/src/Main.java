public class Main {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree(6);

        b.addNodo(5);
        b.addNodo(2);
        b.addNodo(5);
        b.addNodo(7);
        b.addNodo(2);
        b.addNodo(8);
        b.addNodo(1);

        System.out.println(b.searchNodo(1).key);
    }
}
