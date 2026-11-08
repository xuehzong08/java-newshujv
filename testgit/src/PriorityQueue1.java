/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22826
 * Date: 2026-11-08
 * Time: 15:04
 */
public class PriorityQueue1 {
    private int[] arr;
    private int size;

    public PriorityQueue1(int[] arr, int size) {
        this.arr = new int[1000] ;
        this.size = 0;
    }
    //优先级队列添加元素
   public void offer(int val){
        size = Heap.add(arr,val,size);
   }
   //优先级队列删除元素
   public int poll(){
        int ret = arr[0];
        size = Heap.delete(arr,size);
        return ret;
   }
   //优先级队列取出列顶元素
   public int  peek(){
        return arr[0];
   }

}
