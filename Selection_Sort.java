public class SelectionSort {
    public static void main(String[] args) 
    {
        int [] list = {11, 15, 52, 85, 65, 5, 25};
        int n = list.length;
        System.out.println("Before Selection Sort");  
        for(int a : list) 
            System.out.print(a + " ");    
        selectionSort(list,n);  
        System.out.println("\nAfter Selection Sort");  
        for(int a : list) 
            System.out.print(a + " ");  
    }   
    public static void selectionSort (int[] list, int n)
    {
        for (int i = 0; i < n - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (list[j] < list[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int small = list[index];   
            list[index] = list[i];  
            list[i] = small;  
        }     
    }
}