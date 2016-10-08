import java.util.Scanner;

/**
 * Created by somutha on 10/8/2016.
 */
public class quickFind {

    private int[] id;

    public quickFind(int N){
        id = new int[N];
        for (int i=0; i<N;i++ ){
            id[i]=i;
        }
    }

    public boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }

    public void union(int p, int q) {

        if (!(connected(p, q))) {
            int pid = id[p];
            int qid = id[q];
            for (int i = 0; i < id.length; i++) {
                if (pid == id[i]) {
                    id[i] = qid;

                }
            }
        }
    }
     public static void main (String args[]){

         Scanner StdIn = new Scanner(System.in);
         System.out.println("Enter the Number of values for the array");
        int num = StdIn.nextInt();
        quickFind qf = new quickFind(num);
         System.out.println("Enter the Value of P and Q");
         while (StdIn.hasNextInt()) {

             int p = StdIn.nextInt();
             int q = StdIn.nextInt();
             if (!qf.connected(p, q)) {
                 qf.union(p, q);
                 System.out.println(p + " " + q + " " + "are successfully connected");
             } else {
                 System.out.println("the nodes are already connected");
             }
         }
    }

    }

