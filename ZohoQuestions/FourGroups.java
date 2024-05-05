package ZohoQuestions;
/* Q3) Write a program for the following. Let consider 20 students in a class with the roll no 101-120. 
       We are going to split them into four groups.
       Based on their roll number we are going to split them with the following logics.
O/P:
Input : Total Number of students : 20
Output:
Group 1:    Group 3:      
101         103
105         107
109         111
113         115
117         119
Group 2:    Group 4:
102         104
106         108
110         112
114         116
118         120
*/
public class FourGroups 
{
	public static void main(String[] args) 
	{
		int arr[]= new int[] {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120};
		int num[]=new int[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("Group"+(i+1)+": ");
			for(int j=i;j<arr.length;j+=4) 
			{
				System.out.println(arr[j]);
			}
		System.out.println(" ");
		}
	}
}
