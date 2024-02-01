import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static long powMod(long a,long b, long c) {
		if (b == 0) {
			return 1%c;
		}
		
		long res = powMod(a,b/2,c);
		
		if (b%2 == 0) {
			return (res*res)%c;
		} else{
			return (res*res%c)*a%c;
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		// input nums
		
		long a = (long)Integer.parseInt(st.nextToken());
		long b = (long)Integer.parseInt(st.nextToken());
		long c = (long)Integer.parseInt(st.nextToken());
		long res = powMod(a,b,c);
		System.out.println(res);
		
	}
}
