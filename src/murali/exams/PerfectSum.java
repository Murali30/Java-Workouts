package murali.exams;

public class PerfectSum {

	static int counter = 0;
	static void findSubsets(int size, int arr[], int target)
	{
		for(int count= 0;count<arr.length;count++)
		{
			findInnerSets(count,arr[count],arr,target);
		}
	}
	
	static void findInnerSets(int count,int sum, int arr[],int target)
	{
		for(int j= count+1;j<arr.length;j++)
		{
			System.out.println(sum);
			if(sum+arr[j] == target)
			{
				counter++;
			}
			else
			{
				findInnerSets(j,sum+arr[j],arr,target);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size =5;
		int arr[] = {3,4,5};
		int target = 7;
		
		findSubsets(size,arr,target);
		System.out.println(counter);
	}

}
