class Binary_Search {
    public static void main(String[] args) 
    {
        int [] list = {1, 5, 12, 15, 17, 25, 35};
        int data = 17;
        int len,first, last;
        len = list.length;
        first = 0;
        last = len-1;
        int index = binarySearch(list, first, last, data);
        if (index == -1)
            System.out.println("not found");
        else
            System.out.println (data + " is found at position: " + index);
    }
    public static int binarySearch (int[] list, int low, int high, int key)
    {    
        while (low<=high)
        {
            int mid = (low + high) /2 ;
            if (key == list[mid])
                return mid;
            else if (key < list[mid])
                high = mid-1;
            else 
                low = mid + 1;
        }
        return -1;
    }   
}