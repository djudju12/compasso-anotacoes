public class BinaryTree {
    public Nodo root;

    public BinaryTree(int key){
        this.root = new Nodo(key);
    }


    public void addNodo(int key) {
        addNodo(key, this.root);
    }

    public Nodo searchNodo(int key) {
        return searchNodo(key, this.root);
    }

    public Nodo searchNodo(int key, Nodo nodo) {
        if (nodo == null) {
             return null;
        }

        if (nodo.key == key) {
            return nodo;
        }

        if (nodo.key < key) {
            return searchNodo(key, nodo.right);
        }

        return searchNodo(key, nodo.left);
    }

    public void addNodo(int key, Nodo currentNodo) {
        //            root
        //           /    \
        //         nodo   nodo
        //         /  \   /  \

        if (this.root == null) {
            this.root = new Nodo(key);
            return;
        }
        if (key >= currentNodo.key) {
            if (currentNodo.right == null) {
                currentNodo.right = new Nodo(key);
            } else {
                addNodo(key, currentNodo.right);
            }
        } else {
            if (currentNodo.left == null) {
                currentNodo.left = new Nodo(key);
            } else {
                addNodo(key, currentNodo.left);
            }
        }
    }

    public void printTree(){
        printTree(this.root);
    }

    public void printTree(Nodo nodo){
        if (nodo == null) {
            System.out.print("]");
            return;
        }
        System.out.print(" " + nodo.key);
//        System.out.print("left: " );
        printTree(nodo.left);
//        System.out.print("right: " );
        printTree(nodo.right);
        return;
    }
}
