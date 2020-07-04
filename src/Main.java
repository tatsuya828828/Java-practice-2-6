import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class Main {
	public static void main(String[] args) {
		// ラムダ式
		IntBinaryOperator func = (int a, int b) -> {
			return a - b;
		};
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は、" + a);

		// ラムダ式省略記法
		double b = 3.14;
		IntToDoubleFunction function = x ->  x * x * b;
		double c = function.applyAsDouble(5);
		System.out.println("5x5x3.14は" + c);
	}
}
