import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// input commands
		int N = Integer.parseInt(br.readLine());
		int Con = Integer.parseInt(br.readLine());
		
		// Create list
		int [][] arr = new int[N][N];
		
		for (int c=0;c<Con;c++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			
			arr[i][j] = 1;
			arr[j][i] = 1;
		}
		
		boolean[] visited = new boolean[N];
		Stack<Integer> s = new Stack<>();
		
		s.push(0);
		
		while (!s.isEmpty()) {
			int current = s.pop();
			if (!visited[current]) {
				visited[current] = true;
				
				for (int n=N-1;n>=0;n--) {
					if (arr[current][n] == 1 && !visited[n]) {
						s.push(n);
					}
				}
			}
			
		}
		
		
		
		int cnt =0;
		for (int i=0;i<N;i++) {
			if (visited[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt-1);
		
	}
}
