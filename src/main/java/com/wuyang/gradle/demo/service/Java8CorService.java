package com.wuyang.gradle.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Java8CorService {
	public String oddNumbers (int startNum, int endNum) {
		List<Integer> listOfOddNum = new ArrayList<Integer>();
		for (int k = startNum; k <= endNum; k++) {
			if (k % 2 != 0) listOfOddNum.add(Integer.valueOf(k));
		}
		
		return "Odd numbers: " + listOfOddNum.toString();
	}
	
	public String countFrequency (String digit, int num) {
		int output = 0;
		String intStr = null;
		for (int k=0; k<=num; k++) {
			intStr = String.valueOf(k);
			for (int i=0; i<intStr.length(); i++) {
				if (String.valueOf(intStr.charAt(i)).contains(digit)) output++;
			}
		}
		return "Freq of " + digit + " between 0 and " + num + " : " + output;
	}
}
