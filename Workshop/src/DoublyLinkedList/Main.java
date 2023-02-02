package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list.get(0));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println();
        list.forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println();
        int[] arrOfList = list.toArray();
        for(int num:arrOfList){
            System.out.println(num);
        }
        System.out.println();
    }
}
