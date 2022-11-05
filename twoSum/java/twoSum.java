//Program has two methods: main and two_sum
//main reads in array and target
//two_sum search for 2 elements to sum up to the target
//for1 picks element 0, for2 selects next element and add to for1
//if2 test elements sum to target. if so return elements
//if not for2 adds the next element until reach end of array
//for1 loops to repeat process of selecting the next element(element1)
//and adding all other elements besides itself(purpose of if1) to see
//if sum= target.If no solution once for1 loops though entire array,
//print1 prints no matches and return control
//to main.


class twoSum
{
public static void two_sum (int nums[], int target) 
{
int k=0;
for(int i=0;i<nums.length-1;i++) //for loop1
{ k++;
	for(int j=k ;j<nums.length; j++)//for loop2 
  {
		if(i!=j)                                 //if 2                                    
		{	                                                                              	
			if((nums[i] + nums[j])==target)        //if 2
			{System.out.println("["+i+", "+j+"]"); return; 	} //print1
  	}
	}
}

System.out.println("No matches found for target: "+target+"."); return;
}


public static void main (String[] args) 
{
int nums[]={2,7,11,15}; int target = 18; 
two_sum(nums,target);

}
}		
