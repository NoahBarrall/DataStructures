import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//Written by Dr. Suberi and finished by Noah Barrall

public class testLinkedList {

    public static int menu(){
        StdOut.println("\n~~~~~~~~~ MENU ~~~~~~~~~");
        StdOut.println("1. Insert First");
        StdOut.println("2. Insert Last");
        StdOut.println("3. Remove First");
        StdOut.println("4. Remove Last");
        StdOut.println("5. Display List");
        StdOut.println("6. Exit");
        StdOut.println("-------------------------");
        StdOut.print("Enter Your Choice (1 - 6):");

        int choice = StdIn.readInt();
        return choice;
    }
    public static void main(String[] args){
        LinkedList LL = new LinkedList();

        int choice = 0;
        while(choice != 6){
            choice = menu();
            switch(choice){
                case 1:
                    StdOut.print("\nEnter a value to Insert at First: ");
                    String str = StdIn.readString();
                    LL.insertFirst(str);
                break;

                case 2:
                    StdOut.print("\nEnter a value to insert at last: ");
                    String str2 = StdIn.readString();
                    LL.insertLast(str2);
                break;

                case 3:
                    LL.removeFirst();
                break;
                
                case 4:
                    LL.removeLast();
                break;

                case 5:
                    LL.displayList();
                break;

                case 6:
                    System.out.println("\nExiting Program, Bye!");
                break;

                default:
                    System.out.println("\nInvalid Choice. Enter (1 - 6)");
                break;
            }
        }
    }
}
