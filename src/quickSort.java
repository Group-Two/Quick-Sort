import java.util.Random;

public class quickSort {

	static void qSort(int[]  array, int start, int end)
	{		
		if(start<end)
        {
            int key=array[start];
            int i=start,j;
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)
                {
                    int temp=array[j];
                    array[j]=array[i+1];
                    array[i+1]=temp;
                    i++;
                }
            }
            array[start]=array[i];
            array[i]=key;
            qSort(array, start, i-1);
            qSort(array, i+1, end);
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
