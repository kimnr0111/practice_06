package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if(str.equals("앱")) {
    		playApp();
    	} else if (str.contentEquals("음악")) {
    		playMusic();
    	} else {
    		call();
    	}
        
    }
 
    //메소드작성
    public void playApp() {
    	System.out.println("앱실행");
    }
    public void call() {
    	System.out.println("통화기능시작");
    }

    //메소드작성
    
    
    
}
