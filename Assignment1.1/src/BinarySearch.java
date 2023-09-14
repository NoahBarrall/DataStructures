import java.util.Arrays;

import edu.princeton.cs.algs4.*;

public class BinarySearch {
    
    public static int rank(int key, int[] a) 
    {
        int lo = 0;
        int hi = a.length - 1;
        int attempts = 0;

        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            attempts++;
            if (key < a[mid]) {
                hi = mid - 1;
            } 
            else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                StdOut.println("Number of attempts: " + attempts);
                return mid;
            }
            
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int[] whitelist = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            whitelist[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}