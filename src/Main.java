import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : list) {
			System.out.println(i * 2);
		}

		// ラムダ式の場合
		list.stream().forEach(i -> System.out.println(i * 2));

		// parallelStreamでは、並列処理を行うため、大きく性能が向上することがある(上の高速版)
		list.parallelStream().forEach(i -> System.out.println(i * 2));
	}
}
