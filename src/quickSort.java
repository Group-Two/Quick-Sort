import java.util.Random;

public class quickSort {

	static void qSort(int[]  array, int start, int end)
	{		
		if(start<end)
        {
            int key=array[start];
            int p=start,i;
            for(i=start+1;i<=end;i++)
            {
                if(array[i]<key)
                {
                    int temp=array[i];
                    array[i]=array[p+1];
                    array[p+1]=temp;
                    p++;
                }
            }
            array[start]=array[p];
            array[p]=key;
            qSort(array, start, p-1);
            qSort(array, p+1, end);
        }
	}

		
	public static void main(String[] args)
    {
		Random random = new Random();
		int[] array=new int[1000];
		for(int i=0; i<1000; i++){
			array[i] = random.nextInt(10000);
		}
		qSort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
	
}
