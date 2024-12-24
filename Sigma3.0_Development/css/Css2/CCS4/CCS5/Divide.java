public class Divide {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,1,3,-7,98,-9};
        mergesort(arr,0,arr.length-1);
      printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        //basecase
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);//leftpart
        mergesort(arr,mid+1,ei);//rightpart
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        // let si=0,ei=6
        //mid=3
        //si-> 0,1,2,3=total turns =4
        //ei-> 4,5,6=total turns=3
        //si+ei=7==0+6+1
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }
        //ager left part bach jaya to
        while(i<=mid){
            temp[k++]=arr[i++];

        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp array to origional array
        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
