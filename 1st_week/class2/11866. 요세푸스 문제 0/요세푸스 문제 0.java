import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Input N
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		Queue<Integer> num_queue = new LinkedList<>();
		Queue<Integer> res_queue = new LinkedList<>();
		
		//1~m 이 들어있는 Queue 생성
		for (int i=1;i<=m;i++) {
			num_queue.add(i);
		}
		
		int cnt = 0;
		
		// create Josephus queue
		while (!num_queue.isEmpty()) {
			if (cnt == k-1) {
				res_queue.add(num_queue.poll());
				cnt = 0;
			} else {
				num_queue.add(num_queue.poll());
				cnt ++;
			}
		}
		
		// print queue
		System.out.print("<");
		while (res_queue.size() > 1) {
			for (int i = 0;i<res_queue.size()-1;i++) {
				System.out.printf("%d, ",res_queue.poll());
			}
		}
		
		System.out.printf("%d>",res_queue.poll());
	}

}
