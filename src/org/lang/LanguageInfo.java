package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("TamilLanguage");
	}
	private void englishLanguage() {
		System.out.println("EnglishLanguage");
	}
	private void HindiLanguage() {
		System.out.println("HindiLanguage");
	}
	public static void main(String[] args) {
		LanguageInfo a=new LanguageInfo();
				a.tamilLanguage();
	        	a.englishLanguage();
	        	a.HindiLanguage();
	            a.northIndia();
	            a.southIndia();
	        	
	   
	}
	
}

