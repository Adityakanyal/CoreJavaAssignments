
public class Pattern1 {
	public static void main(String[] args) {
		int n=9;
		 for(int i=0;i<n;i++)
		 { 
			 //I letter
			 for(int j=0;j<n;j++)
			 {
				 if(i==0 || j==((n-1)/2) ||i==n-1) 
					System.out.print("*");
				 else 
					 System.out.print(" ");
			 }
			 System.out.print("  ");
			 //N letter
			for (int j = 0; j < n; j++) {
				if(j==0 || j==n-1 || i==j )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.print("  ");
			//E letter
			for(int j=0;j< n;j++)
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			 System.out.print("  ");
			 
				//U letter
				for(int j=0;j< n;j++)
				{
					if(j==0 || j==n-1 || i==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				 System.out.print("  ");
				 
				 //R letter
					for (int j = 0; j < n; j++) {
						if(j==0 || i==0 ||i==(n-1)/2 || j==n-1 && i<=(n-1)/2 || i==j && i>(n-1)/2)
							System.out.print("*");
						else
							System.out.print(" ");
						
					}
					System.out.print("  ");
				 
				//O letter	
					for(int j=0;j< n;j++)
					{
						if(j==0 || i==0 || i==n-1 || j==n-1)
							System.out.print("*");
						else
							System.out.print(" ");
						
					}
					 System.out.print("  ");
					 
					 //N letter
						for (int j = 0; j < n; j++) {
							if(j==0 || j==n-1 || i==j )
								System.out.print("*");
							else
								System.out.print(" ");
							
						}
			 
			System.out.println();
			 
		 }
	}
		 }