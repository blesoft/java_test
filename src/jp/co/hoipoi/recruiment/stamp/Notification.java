package jp.co.hoipoi.recruiment.stamp;
import java.util.Random;
import java.util.ArrayList;

public class Notification {	
	public static void main(String arg[]) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
		ansList = listMake();
		System.out.println(ansList);
	}
	public static ArrayList<ArrayList<Integer>> listMake() {
		int N = 3000;
		Random r = new Random();
		int rv = r.nextInt(N+1);
		int l[] = {1,5,10,20,63,84,94,120,140,210,290,320,1000};
		int n = l.length;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subList = new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			int k1 = l[j];		
			if(k1>rv) {
				subList.add(l[j]);
				list.add(subList);
			}
			if(j<n-1) {
				int k2 = l[j]+l[j+1];		
				if(k2>rv) {
				subList.add(l[j]);
				subList.add(l[j+1]);
				list.add(subList);
				}
			}
			if(j<n-2) {
				int k3 = l[j]+l[j+1]+l[j+2];		
				if(k3>rv) {
				subList.add(l[j]);
				subList.add(l[j+1]);
				subList.add(l[j+2]);
				}
			}
		}
		return list;
	}
}
