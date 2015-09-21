import java.util.Random;
import java.util.Stack;

public class QuickSortNonRecursion {
	
	static void quicksort(int[] array) {
        if (array == null || array.length == 1) return;
        Stack<Integer> s = new Stack<Integer>();      
        s.push(0); 
        s.push(array.length - 1); 
        while (!s.empty()) { 
            int right = s.pop(); 
            int left = s.pop(); 
            if (right <= left) continue; 
                     
            int i = partition(array, left, right); 
            if (left < i - 1) {
                s.push(left);
                s.push(i - 1);
            } 
            if (i + 1 < right) {
                s.push(i+1);
                s.push(right);
            }
        } 
    }
    static int partition (int[] arrary, int start, int end)
    {
        int temp;
        int i=start,j=end;
        if(start<end)
        {
            temp=arrary[i];
            while(i<j)
            {
                while(j>i&&arrary[j]>temp)j--;
                if(i<j)
                {
                    arrary[i]=arrary[j];
                    i++;
                }
                       
                while(i<j&&temp>arrary[i])i++;
                if(i<j)
                {
                    arrary[j]=arrary[i];
                    j--;
                }
            }
            arrary[i]=temp;
        }
        return i;
    }
    
	public static void main(String[] args)
    {
		Random random = new Random();
		int[] array=new int[1000];
		for(int i=0; i<1000; i++){
			array[i] = random.nextInt(10000);
		}
		quicksort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}