//массив 8 цикл 0 3 6 9 12 15 18 21

public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[8];
        int j = 0;
        int maxMass = array.length;
        for(int i = 0; i < maxMass; i++)
            {
                System.out.print (i + "-" + array[i]+" ");
            }
    System.out.println (" ");
        for(int i = 0; i < maxMass; i++, j = j+3)
        {array[i] = j;
        }
        for(int i = 0; i < maxMass; i++)
        {
            System.out.print (i + "-" + array[i]+" ");
}
}
}
