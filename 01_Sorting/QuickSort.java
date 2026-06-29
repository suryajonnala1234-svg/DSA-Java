public class QuickSort {
    public static int partition(int arr[],int st,int end){
        int pivot=arr[end];
        int i=st-1;
        for(int j=st;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }
    public static void quick(int arr[],int st,int end){
        if(st<end){
        int pidx=partition(arr,st,end);
        quick(arr,st,pidx-1);
        quick(arr,pidx+1,end);

        }

    }
    public static void main(String[] args) {
        int arr[]={4,3,6,2,8,1,9};
        int n=arr.length;
        quick(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
