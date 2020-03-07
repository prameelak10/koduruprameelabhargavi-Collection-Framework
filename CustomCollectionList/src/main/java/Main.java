import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements to initialize the list");
        CollList list_1= new CollList();
        while(true)
        {
            System.out.println("1.Fetch Item\n2Insert Item\n3.Remove Item\n4.Display List\n5.Exit");
            int choose=sc.nextInt();
            if(choose == 1)
            {
                System.out.println("Enter index of element to be fetched");
                int index=sc.nextInt();
                if(list_1.list_size()==0)
                {
                    System.out.println("List is Empty");
                }
                else
                    System.out.println(list_1.fetch_element(index));
            }
            else if(choose == 2)
            {
                System.out.println("Enter index of element to be inserted");
                int index=sc.nextInt();
                list_1.insert_element(index);
            }
            else if (choose == 3)
            {
                System.out.println("Enter index of element to be removed");
                int index=sc.nextInt();
                if(list_1.list_size()==0)
                {
                    System.out.println("List is Empty");
                }
                else if (index >= list_1.list_size())
                {
                    System.out.println("Index Out of Bound");
                }
                else
                    list_1.removing_element(index);
            }
            else if(choose == 4)
                list_1.display();
            else if(choose == 5)
                System.exit(0);
        }

    }
}