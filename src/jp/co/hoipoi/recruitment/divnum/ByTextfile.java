package jp.co.hoipoi.recruitment.divnum;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ByTextfile {
	public static void main(String arg[]) {
		Random r = new Random();
		File text = new File("Users/tanakayuu/eclipse-workspace/jp.co.hoipoi.recruiment.stamp/number.txt");
		if (!text.exists()) {
			System.out.println("Error! テキストファイルが存在しません");
			return;
		}
		String[] tempInside = null;
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(text)))){
			List<String> list = new ArrayList<String>();
			String line;
			int l = (int) text.length();
			int n = r.nextInt(l);
			int m = l / n;
			while((line = reader.readLine()) != null) {
				list.add(line);
			}
		}
	}
}
