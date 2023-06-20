package Day5;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//biggest number in a 3*3 array
		int[][] a = {{1,2,10},{1,2,3},{1,2,3}};
		int max = a[0][0];
		for(int i  = 0;i<3;i++) {
				for(int  k= 0;k<3;k++) {
					if(a[i][k]>max) {
						max = a[i][k];
					}
				}
			}
		System.out.println(max);
		}
		
	}

