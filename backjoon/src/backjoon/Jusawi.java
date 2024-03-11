package backjoon;

import java.util.*;

public class Jusawi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5; 
		int c = 2;
		int d = 6;
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] arr = {a, b, c, d};
 		for(int num : arr) {
 			map.put(num, map.getOrDefault(num, 0)+1);
 		}
 		if(map.size() == 1) {
 			answer = a * 1111;
 		}else if(map.size() == 2){
 			int[] keys = new int[map.size()];
 			int i = 0;
 			for(int key : map.keySet()){
 	        	keys[i++] = key;
 	        }
 			if(map.get(keys[0]) == 2) {
 				int p = keys[0];
 				int q = keys[1];
 				answer = (p+q) * Math.abs(p - q);
 			}else if(map.get(keys[0]) == 1) {
 				int p = keys[1];
 				int q = keys[0];
 				answer = (int)Math.pow(p*10 + q, 2);
 			}else if(map.get(keys[0]) == 3) {
 				int p = keys[0];
 				int q = keys[1];
 				answer = (int)Math.pow(p*10 + q, 2);
 			}
 		}else if(map.size() == 3){
 			int[] keys = new int[map.size()];
 			int i = 0;
 			for(int key : map.keySet()){
 	        	keys[i++] = key;
 	        }
 			if(map.get(keys[0]) == 2) {
 				int q = keys[1];
 				int r = keys[2];
 				answer = q*r;
 			}else if(map.get(keys[1]) == 2) {
 				int q = keys[0];
 				int r = keys[2];
 				answer = q*r;
 			}else if(map.get(keys[2]) == 2) {
 				int q = keys[0];
 				int r = keys[1];
 				answer = q*r;
 			}
 		}else {
 			int[] keys = new int[map.size()];
 			int i = 0;
 			for(int key : map.keySet()){
 	        	keys[i++] = key;
 	        }
 			Arrays.sort(keys);
 			answer = keys[0];
 		}
 		System.out.println(answer);
	}

}
