package NumArr;
import java.util.Scanner;

public class NumArray{
    int arr[]=new int[20],n;
    void accept()
    {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEnter Number of Element: ");
            n= sc.nextInt();
            System.out.println("Enter the elements: ");
            for(i=0; i<n; i++)
            arr[i]=sc.nextInt();
        }
        }

        void minmax(){
            int i,j,k,min,max,min_indx,max_indx,tmp;
            for(i=0, j=n-1; i<j; i++, j--){
                min=max=arr[i];
                min_indx=max_indx=i;
                for(k=i; k<=j; k++){
                    if(arr[k]>max){
                        max=arr[k];
                        max_indx=k;
                    }
                    else if(arr[k]<min){
                        min=arr[k];
                        min_indx=k;
                    }
                }
                tmp=arr[i];
                arr[i]=arr[min_indx];
                arr[min_indx]=tmp;
                if(arr[min_indx]==max){
                    tmp=arr[j];
                    arr[j]=arr[min_indx];
                    arr[min_indx]=tmp;
                
                }
                else{
                    tmp=arr[j];
                    arr[j]=arr[max_indx];
                    arr[max_indx]=tmp;
                }
            }
        }
        void display(){
            int i;
            for(i=0; i<n; i++)
            System.out.println(arr[i]+" ");
            
        }
        public static void main(String[] args){
            NumArray m=new NumArray();
            m.accept();
            System.out.println("\nThe unsorted array is: ");
            m.display();

            m.minmax();

            System.out.println("\nThe sorted array is: ");
            m.display();
        }
}


