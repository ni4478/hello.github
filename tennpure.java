import java.util.Arrays;
import java.util.TreeMap;

public class tennpure {

	public static void main(String[] args) {

		//スキャン
		java.util.Scanner scan = new java.util.Scanner(System.in);
	
		//intに変換
		Integer.parseInt(a);
	
		//数値だけの配列
		Integer a[];
		
		//配列aの中にbがあるかif分の条件式で使う
		Arrays.asList(a).contains(b)
		
		//文字aをすべてbに置き換える
		S = S.replaceAll("a",  "b");
		
		//配列を小さい順にソート
		import java.util.Arrays;
		Arrays.sort(H);
		
		//aの５乗
		Math.pow(a, 5);
		//double型の値を四捨五入
		Math.round(a);
		//引数2つのうち大きいほうの値を取得
		Math.max(a, b);

		//<キーの変数型、データの変数型>を決めてtreemapのインスタンス作成
		//キーとデータを紐付けて管理できる
		TreeMap<String, Integer> s = new TreeMap<>();
		//マップの中同じキーがあれば実行
		if(s.containsKey(キーの変数))
		//マップに新規にキーとデータを入れる4
		s.put("A",3);
		//キーに対応する値を取得
		s.get("A");
		//キーを順番に出力する繰り返し
		for (Integer key : a.keySet()) {
			System.out.println(a.get(key));
		}


		import java.util.Scanner;
		import java.util.TreeMap;

		public class Main {

			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				
				TreeMap<Integer, Integer> a = new TreeMap<>();
				
				for(int i =1; i <= n; i++) {
					a.put(i, 0);
				}
				
				for(int i = 0; i < n - 1; i++) {
					int key = sc.nextInt();
					a.put(key,a.get(key)+1);
				}

				for (Integer key : a.keySet()) {
					System.out.println(a.get(key));
				}

			}
		}

	
	}

}
