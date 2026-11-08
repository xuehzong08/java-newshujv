import javax.print.DocFlavor;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22826
 * Date: 2026-11-08
 * Time: 13:58
 */
public class Heap {
    public static void ShiftDown(int[] arr,int subroot,int size){
        //这里以小堆为例
        int parent = subroot;
        int child = parent*2+1;

        while(child<size){

            if(child+1<size &&arr[child]>arr[child+1]){
                child = child+1;
            }
            if(arr[child] >= arr[parent]){
                break;
            }
            int tep = arr[child];
            arr[child] = arr[parent];
            arr[parent] = tep;

            parent = child;
            child = 2*parent +1;
        }
    }
    public static void ShiftUp(int[] arr,int child){
        //这里以小堆为例
       int parent = (child-1)/2;

        while(parent >=0 ){
            if(arr[child] >= arr[parent]){
                break;
            }

            int tep = arr[child];
            arr[child] = arr[parent];
            arr[parent] = tep;

            child = parent ;
            parent = (child-1)/2;
        }
    }
    //创建堆的操作
    public static void createQueue(int[]arr ,int size){
        for (int i =( size-1-1)/2; i >= 0 ; i--) {
            ShiftDown(arr,i ,size);
        }
    }
    //这里返回值为int，是要记录删除后的元素个数，否则元素删除后就没有记录了
    public static int delete(int[] arr ,int size){
        arr[0] = arr[size-1];
        size--;
        ShiftDown(arr ,0 ,size);
        return size;
    }

    public static int add(int[]arr,int val,int size){
        if(size> arr.length){
            throw new RuntimeException("数组已满");
        }
        arr[size] = val;
        size++;

        ShiftUp(arr,size-1);
        return size;
    }
    public static void main(String[] args) {
        int[] arr = { 9,8,7,6,5,4,3,2,1 };
       createQueue(arr,arr.length);
       delete(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
