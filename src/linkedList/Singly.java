package linkedList;

public class Singly {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.printList();
        list.insertInFront(45);
        System.out.println(list.removeFirst());
        list.printList();
        list.insertInFront(65);
        list.insertAtLast(52);
        list.insertAtLast(455);
        list.insertInFront(45423);
        list.insertAtLast(4512);
        list.printList();
        System.out.println(list.removeFirst());
        list.printList();
        System.out.println(list.contains(455));
        list.clearList();
        list.printList();
    }

    static class LinkedList<T> {
        private Element<T> head = null;

        void insertAtLast(T value) {
            //Means no element in list
            if (head == null) {
                head = new Element<T>(null, value);
                return;
            }

            Element<T> tempHead = head;
            while (tempHead.next != null) {
                tempHead = tempHead.next;
            }
            tempHead.next = new Element<T>(null, value);
        }

        void insertInFront(T value) {
            //Means no element in list
            if (head == null) {
                head = new Element<T>(null, value);
                return;
            }
            head = new Element<>(head, value);
        }

        T removeFirst() {
            if (head == null)
                return null;

            T headValue = head.value;

            //Only one element
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
            }
            return headValue;
        }

        boolean contains(T value) {
            Element<T> tempHead = head;
            //Remember to use equals and not ==
            while (tempHead != null && !tempHead.value.equals(value)) {
                tempHead = tempHead.next;
            }
            return tempHead != null;
        }

        void clearList() {
            head = null;
        }

        void printList() {
            Element<T> tempHead = head;
            if (tempHead == null) {
                System.out.println("Empty List");
                return;
            }

            while (tempHead.next != null) {
                System.out.print(tempHead.value + " ");
                tempHead = tempHead.next;
            }
            System.out.println(tempHead.value);
        }
    }


    static class Element<T> {
        private Element<T> next;
        private T value;

        public Element(Element<T> next, T value) {
            this.next = next;
            this.value = value;
        }

        public Element<T> getNext() {
            return next;
        }

        public void setNext(Element<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
