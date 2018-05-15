import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise8
    /*
    Write a method called switchPairs that switches the order of values in the list in a pairwise fashion.
    Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on.
    If the list contains an odd number of values, the final element is not moved.
    For example, if the list initially stores [10, 25, 31, 47, 52, 68, 77],
    your method should switch the first pair (10 and 25), the second pair (31 and 47),
    and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
     */
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        try {
            while(true)
            {
                System.out.println("Skriv listen: ");
                Exercise8 obj = new Exercise8();
                List list = new LinkedList();

                int size = scanner.nextInt();
                if(size <=0)
                {
                    throw new IllegalArgumentException();
                }
                for (int i = 0; i < size; i++)
                {
                    System.out.println("Skriv listen igen tak :) :");
                    list.add(i,scanner.nextInt());
                }
                System.out.println("Listen: ");

                for (Object i :
                        list)
                {
                    System.out.println(i + " ");
                }
                System.out.println();
                List result = obj.switchPairs(list);
                System.out.println("Listen efter: ");

                for (Object i :
                        result)
                {
                    System.out.println(i + " ");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Fejl: " + e.getMessage());
        }
    }

    public List switchPairs (List liste)
    {
        List demoList = new LinkedList();
        for (int i = 0; i < liste.size()-1; i+=2)
        {
            demoList.add(i, liste.get(i+1));
            demoList.add(i+1, liste.get(i));
        }
        if (liste.size() % 2 != 0
                )
        {
            demoList.add(liste.size()-1,liste.get(liste.size()-1));
        }
        return demoList;
    }
}
