import java.util.Scanner;

public class UniqueInteger {
public static void main(String[] args){
	int[] a=new int[5];
	Scanner scr=new Scanner(System.in);
	int count=0;
	for(int i=0;i<5;i++){
		a[i]=scr.nextInt();
	}
	for(int j=0;j<5;j++){
	for(int i=0;i<5;i++){
		if(a[j]==a[i]){
			count++;
		}
	}
	if(count==1){
		System.out.println(a[j]);
		break;
	}
	count=0;
	 }
}
}
