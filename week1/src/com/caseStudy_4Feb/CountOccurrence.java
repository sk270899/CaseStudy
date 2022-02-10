package com.caseStudy_4Feb;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CountOccurrence {

//	public static void countOccurrenceOfLetters(char[] ch) {
//		int [] freqArr = new int[26];
//		int total = 0;
//		for(int i=0;i<ch.length;i++) {
//			freqArr[ch[i]-97]++;
//		}
//		for(int i=0;i<26;i++) {
//			if(freqArr[i]>0) {
//				total++;
//				System.out.println((char)(i+97)+" : "+(int)freqArr[i]);
//			}
//		}
//		System.out.println("Total unique characters : "+total);
//	}
//	
//	public static void randomCharacter(char[]charr, char ch) {
//		int [] freqArr = new int[26];
//		for(int i=0;i<charr.length;i++) {
//			freqArr[charr[i]-'a']++;
//		}
//		System.out.println(ch + " is repeated " + freqArr[ch-97] + " times");
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "mynameissahilkhandelwal";
//		char [] ch = str.toCharArray();
//		System.out.println(ch);
//		countOccurrenceOfLetters(ch);
//		randomCharacter(ch,'a');
//	}
	
	
	public CountOccurrence() {
		// TODO Auto-generated constructor stub
		this("hello");
		System.out.println("def");
		System.out.println(this);
	}
	public CountOccurrence(String name) {
		System.out.println("def ccc");
	}
	public static void main(String[] args) {
		CountOccurrence obj = new CountOccurrence();
		
	}
}
