package basicsofprogramming;

public class ArrayDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x={5,3,4,2,1};
		int temp=0;
		for(int i=0;i<5;i++) {
			
			for(int j=i+1;j<5;j++){
					if(x[i]<x[j]) {
						temp=x[i];
						x[i]=x[j];
						x[j]=temp;
					}
				}
			{
				System.out.print(x[i]+" ");
			}
			}
		}
	
		

	}


