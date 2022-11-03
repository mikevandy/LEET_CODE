//This is a test
//
 class twoSum
{
public static void main (String[] args) 
{
int nums[]={2,7,11,15}; int target = 9; int k=0;
for(int i=0;i<nums.length-2;i++) 
{ k++;
	for(int j= k ;j<nums.length-1; j++)
	if(i!=j)
	{
		if((nums[i] + nums[j])==target)  
		{System.out.println("["+i+", "+j+"]"); break; }
	}
	}

}






}	

