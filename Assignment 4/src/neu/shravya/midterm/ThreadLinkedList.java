package neu.shravya.midterm;

public class ThreadLinkedList {

        private Node head;
        private int length;


        public ThreadLinkedList(){
            this.length = 0;
            head = null;
        }

        synchronized public int size(){
            return this.length;
        }

        synchronized public void addAtPosition(int index, int element){

            if (index < 0 || index >  length)
            {
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            Node node = new Node();
            node.element = element;

            if (temp != null)
            {
                temp.next = node;
            }
            else
            {
                head = node;
            }

            this.length ++;
        }

        synchronized public void removeAtPosition(int index, int element){

            if (index < 0 || index >=  length)
            {
                return;
            }

            if(index == 0)
            {
                if (head == null || head.element != element)
                {
                    return;
                }

                head = head.next;
                this.length --;
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }

            if (temp.element != element)
            {
                return;
            }

            if(temp.next != null)
            {
                temp.next  = temp.next.next;
            }
            else
            {
                temp.next = null;
            }

            this.length --;

        }


        synchronized public  int getFirst(){
            if(head == null)
            {
                return Integer.MIN_VALUE;
            }

            return head.element;
        }

        synchronized public  int getLast(){
            if(head == null)
            {
                return Integer.MIN_VALUE;
            }

            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }

            return temp.element;
        }

    }


class Node{
    public int element;
    public Node next;
}
