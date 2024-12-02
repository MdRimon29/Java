class Linear_Search {
    public static void main(String[] args) 
    {
        int[] list = {100,1155,6520,7896,250,360,8512};
        int data = 6520;
            System.out.println ("The Array:  ");
        for (int a: list)
            System.out.print("  " + a);
        int index = linearSearch (list, data);
        if (index == -1)
            System.out.println ("\nData is not found. ");
        else 
            System.out.println ("\nData is found at index: " + index);
    }
    public static int linearSearch (int[] list, int key)
    {
        for (int i = 0; i< list.length; i++)
        {
            if (key == list [i])
                return i;
        }
        return -1;
    }
}