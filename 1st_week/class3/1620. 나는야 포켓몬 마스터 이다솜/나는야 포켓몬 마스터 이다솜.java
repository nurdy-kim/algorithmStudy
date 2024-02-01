import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// input Poketmon Num(N) & Problem Num (M)
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// Create HashMap for assign PokemonDict
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] pokeMons = new String[N];
		String pokeMon;
		
		// Read Pokemon
		for (int n=1;n<=N;n++) {
			pokeMon = br.readLine();
			map.put(pokeMon, n);
			pokeMons[n-1] = pokeMon;
		}
		
		// Sovle Problem
		String tmp;
		int tmpNum;
		for (int m=1;m<=M;m++) {
			tmp = br.readLine();
			if (tmp.charAt(0) >= '0' && tmp.charAt(0) <= '9') {
				tmpNum = Integer.parseInt(tmp);
				
				System.out.println(pokeMons[tmpNum-1]);
			} else {
				System.out.println(map.get(tmp));
			}			
		}
	}
}
