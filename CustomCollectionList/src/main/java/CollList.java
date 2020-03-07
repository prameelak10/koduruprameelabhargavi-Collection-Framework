import java.util.ArrayList;
import java.util.Scanner;
public class CollList
{
    ArrayList<String > l1=new ArrayList<String>();
    CollList()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            l1.add(sc.next());
        }
    }
    public void insert_element(int element)
    {
        l1.add(String.valueOf(element));
    }
    public void display()
    {
        System.out.println(l1);
    }
    public void removing_element(int index)
    {
        l1.remove(index);
    }
    public String fetch_element(int index)
    {
        return String.valueOf(l1.get(index));
    }
    public int list_size()
    {
        return l1.size();
    }
}
