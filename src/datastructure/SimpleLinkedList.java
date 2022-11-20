package datastructure;

public class SimpleLinkedList <E> {

    public Node<E> head = null;

    public class Node<E> {
        E data;
        Node<E> next = null;

        public Node(E data) {
            this.data = data;
        }
    }

    public void addNode(E e) {
        if(head == null){
            head = new Node<E>(e);
        }else {
            Node<E> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(e);
        }
    }

    public void getDataAll() {
        System.out.println("SimpleLinkedList.getDataAll");
        System.out.println("");
        if (head!= null) {
            Node<E> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public void interceptNode(E e, E justBefore) {
        Node<E> jb = this.search(justBefore);

        if(jb == null){
            this.addNode(e);
        }else {
            Node<E> nextNode = jb.next;
            jb.next = new Node<>(e);
            jb.next.next = nextNode;
        }
    }

    public Node<E> search(E justBefore) {
        if(this.head == null) {
            return null;
        }else {
            Node<E> node = this.head;
            while (node != null) {
                if(node.data == justBefore) {
                    return node;
                }else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    void removeNode(E deleteNode) {
        //to-do
    }

    public static void main(String[] args) {
        SimpleLinkedList<String> node = new SimpleLinkedList<>();
        node.addNode("a");
        node.addNode("b");
        node.addNode("c");
        node.addNode("d");
        System.out.println("node = " + node);
        System.out.println("node.head.data = " + node.head.data);
        System.out.println("node.head.next = " + node.head.next);

        node.getDataAll();

//        node.interceptNode("aa", "a");
//        node.interceptNode("aa", "g");

        node.getDataAll();

        node.removeNode("a");
        node.getDataAll();


    }
}
