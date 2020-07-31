class FindDuplicate 
{ 
    void printRepeating(int arr[], int size) 
    { 
     int i;
        for (i = 0; i < size; i++) 
        { 
            if (arr[ Math.abs(arr[i])] >= 0) 
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    } 
    public static void main(String[] args)  
    { 
        FindDuplicate duplicate = new FindDuplicate(); 
        int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
        int arr_size = arr.length; 
  
        duplicate.printRepeating(arr, arr_size); 
    } 
} 