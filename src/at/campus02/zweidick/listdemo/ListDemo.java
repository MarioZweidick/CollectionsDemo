package at.campus02.zweidick.listdemo;

import java.util.ArrayList;

public class ListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);

        int first = list.get(0);
        System.out.println(first);

        for(int i = 0; i < list.size(); i++)
        {
            int element2 = list.get(i);
            System.out.println("element2 = " + element2);
        }
        
        for(int element : list)
        {
            System.out.println("element = " + element);
        }

    }

}
