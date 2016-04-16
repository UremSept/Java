package day4;

import java.util.Arrays;

public class Demo4 {
public static void main(String[] args) {
	int a[]={33,64,55,98,66};
	//java提供的自动升序
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
}
}
