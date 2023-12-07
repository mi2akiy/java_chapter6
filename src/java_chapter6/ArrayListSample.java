package java_chapter6;
import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java入門講座");
		list.add("ここまで");
		list.add("よく頑張りましたね！");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}