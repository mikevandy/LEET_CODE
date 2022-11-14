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
//added two static methods getArray and getTarget
//get Array creates scanner object, creates array size and fill array
//with user suggested ints
//getTarget creates scanner object and gets user suggested target
import java.util.Scanner;

class twoSum
{ 
public static int[] getArray()
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the array size: ");
int size = in.nextInt(); int array1[] = new int[size];
for(int i =0; i<size; i++)
{
System.out.print("Enter number for the array: ");
array1[i]= in.nextInt();
}
System.out.println("Array has been filled.");
return array1;

}
public static int getTarget()
{
Scanner in1 = new Scanner(System.in);	
System.out.print("Enter the target number: ");
int target1 = in1.nextInt();
return target1;
}


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
			{System.out.println("These are the elements: ["+i+", "+j+"]"); return; 	} //print1
  	}
	}
}

System.out.println("No matches found for target: "+target+"."); return;
}


public static void main (String[] args) 
{

System.out.println("Program receives array and tests if \n2 elements add to target number.");
System.out.println("Instructions are as follows:");
int nums[]=getArray();

int target = getTarget(); 
System.out.print("This is the array: ");
for(int i:nums)
System.out.print(i+",");
System.out.println("\nThis is the target: "+target);
two_sum(nums,target);

}
}		
