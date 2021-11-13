package neu.shravya.midterm;

public class Main implements Runnable {

    static ThreadLinkedList sList = new ThreadLinkedList();

    public static void main(String[] args) {

                ThreadLinkedList list = new ThreadLinkedList();

                for(int i = 0; i < 10; i++)
                {
                    list.addAtPosition(i, i);
                    System.out.println("*********************");

                    System.out.println("Length: " + list.size());
                    System.out.println("First: " + list.getFirst());
                    System.out.println("Last: " + list.getLast());
                }

                for(int i = 10; i >= 0; i--)
                {
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    list.removeAtPosition(i, i);
                    System.out.println("Length: " + list.size());
                    System.out.println("First: " + list.getFirst());
                    System.out.println("Last: " + list.getLast());
                }


                Thread t1 = new Thread(new Main(), "T1");
                Thread t2 = new Thread(new Main(), "T2");
                Thread t3 = new Thread(new Main(), "T3");

                t1.start();
                t2.start();
                t3.start();

            }

            @Override public void run()
            {
                java.util.Random rnd = new java.util.Random();
                int listSize = sList.size();
                int index = rnd.nextInt(listSize+1);
                sList.addAtPosition(index, index);
                System.out.println("size: " + sList.size());
                System.out.println("get first: " + sList.getFirst());
                System.out.println("get last: " + sList.getLast());
                index = rnd.nextInt(listSize+1);
                sList.removeAtPosition(index, index);
                System.out.println("size after removal: " + sList.size());
                System.out.println("first after removal: " + sList.getFirst());
                System.out.println("last after removal: " + sList.getLast());

            }
}
