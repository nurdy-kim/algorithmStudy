import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int m,n;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int[][] arr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		
		for (int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=n;j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1] -arr[i-1][j-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		int i1,j1,i2,j2, res;
		for (int t=0;t<m;t++) {
			st = new StringTokenizer(br.readLine());
			i1 = Integer.parseInt(st.nextToken());
			j1 = Integer.parseInt(st.nextToken());
			i2 = Integer.parseInt(st.nextToken());
			j2 = Integer.parseInt(st.nextToken());
			
			res = arr[i2][j2] - arr[i1-1][j2] - arr[i2][j1-1] + arr[i1-1][j1-1];
			
			sb.append(res).append("\n");
		}
		
		System.out.println(sb);
	}

}
