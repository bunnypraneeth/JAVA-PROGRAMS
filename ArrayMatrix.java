
public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int add[][]= new int[3][3];
		int mul[][]= new int[3][3];
		int i,j,k;
		System.out.print("addition");
		System.out.println(); 
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				add[i][j]=a[i][j]+b[i][j];
				
				System.out.print(add[i][j]+"   ");	
			}
			System.out.println();
		}
		System.out.print("Multiplication");	
		System.out.println(); 
		for( i=0;i<3;i++){    
			for( j=0;j<3;j++){    
				mul[i][j]=0;      
				for( k=0;k<3;k++)      
					{      
					mul[i][j]+=a[i][k]*b[k][j];      
					} 
					System.out.print(mul[i][j]+"   "); 
				} 
				System.out.println();   
			}    

	}

}
