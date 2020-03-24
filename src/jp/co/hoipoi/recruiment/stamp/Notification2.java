package jp.co.hoipoi.recruiment.stamp;

import java.util.ArrayList;
import java.util.Random;

public class Notification2 extends Notification{
	Random r = new Random();
	public void addStampType(int i) {
		int judge = 0;
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ansList = Notification.listMake();
		int n2 = ansList.size();
		int rv2 = r.nextInt(n2);
		list = ansList.get(rv2);
		int l2 = list.size();
		for(int j=0;j<l2;j++) {
			if(list.get(j) == i) {
				System.out.println("既にその切符は貼られています");
				judge++;
			}
		}
		if(judge == 0);
		System.out.println("Error! 既にその切符は貼られています");
	}
	public void subStampType(int i) {
		int judge = 0;
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ansList = Notification.listMake();
		int n2 = ansList.size();
		int rv2 = r.nextInt(n2);
		list = ansList.get(rv2);
		int l2 = list.size();
		for(int j=0;j<l2;j++) {
			if(list.get(j) == i) {
				list.remove(i);
				judge++;
			}
		}
		if(judge == 0);
		System.out.println("Error! その切符は損ざしませんので削除することができません");
	}

}
