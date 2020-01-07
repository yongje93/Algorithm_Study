package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Number_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());

		// 중복 제거 set 이용
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < total; i++) {
			set.add(br.readLine());
		}
		
		// set을 list로 변경
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list, new Comparator<String>() {
            public int compare(String v1, String v2) {
                if(v1.length() > v2.length()) 
                    return 1;
                else if(v1.length() < v2.length()) 
                    return -1;
                else
                    return v1.compareTo(v2);
            }
        });
 
        for(String s : list) 
            System.out.println(s);
	}

}
