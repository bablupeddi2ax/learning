package Day5;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find();

				
	}
	static void find()
	{
		int arr[]= {7,1,2,3,6};
		int len=arr.length;
		int sum=0,temp=0,flag=0,j;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==6)
			{
				for(j=i+1;j<len;j++)
				{
					if(arr[j]==7)
					{
						flag=1;
						break;
					}
					else
						temp=temp+arr[j];
				}
				i=j;
			}
			else
				sum=sum+arr[i];
			}
		if(flag!=1)
		{
			sum=sum+temp+6;
		}
		System.out.println(sum);
		}

}
