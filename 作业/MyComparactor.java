package com.jjhe;

import java.util.*;
@SuppressWarnings("rawtypes")
class MyComparactor implements Comparator {
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		/*if(s1.getScore()>s2.getScore()){//ÕýÐò
			return   1;
		}else if(s1.getScore()<s2.getScore()){
			return  -1;
		}else if(s1.getScore() == s2.getScore()){
			if(s1.getAge()>s2.getAge()){
				return    1;
			}else if(s1.getAge()<s2.getAge()){
				return   -1;
			}
		}*/
		if(s1.getScore()>s2.getScore()){//µ¹Ðð
			return   -1;
		}else if(s1.getScore()<s2.getScore()){
			return  1;
		}else if(s1.getScore() == s2.getScore()){
			if(s1.getAge()>s2.getAge()){
				return    -1;
			}else if(s1.getAge()<s2.getAge()){
				return   1;
			}
		}
		return 0;
	}
	
}
