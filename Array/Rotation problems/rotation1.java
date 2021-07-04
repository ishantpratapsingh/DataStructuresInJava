

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements to the left

/*
Approach- we will create a function to rotate the element by one to the left ( first element becomes last and rest are shifted to left 
by one) and then we will call this function d times using a for loop'
*/



 public class Main
{

    public void  rotatebyone(int arr[], int n)
    {
       int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
arr[i]=arr[i+1];
// Shift each element by one to the left
//store the first element at place of last element
arr[n-1]=temp;
        }
        
       

    }
    public void rotatebyd(int arr[],int d, int n)
    {
        for(int i=0;i<d;i++)
        {
            rotatebyone(arr, n); //calling rotate by one function d times
        }
    }
    
     void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String[] args)
     {
          int arr[]={1,4,7,2,8,9};
        
      
   
       
       Main r1=new Main();
      
           r1.rotatebyd(arr, 3, 6);
r1.printArray(arr,6);
        
    }}
    
    
