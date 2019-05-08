package arrays;

public class SecondMax {

    public static void main(String args[]){
        int a[] = {6,5,4,2,3,8,7};
        int first,second;
        first = second = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            if(first < a[i]){
                second = first;
                first = a[i];
            }else if(second < a[i]){
                second = a[i];
            }
        }

        System.out.println("Second max value is: "+ second);
    }
}
