import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Create Heap
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		// input commands
		int N = Integer.parseInt(br.readLine());
		int tmp = 0;
		int size = 0;
		
		for(int n=0;n<N;n++) {
			tmp = Integer.parseInt(br.readLine());
			if (tmp == 0) {
				if (q.peek() == null) {
					System.out.println(0);
					} else {
						System.out.println(q.poll());
					}
			} else {
				q.add(tmp);
			}
		}
		
	}
}
