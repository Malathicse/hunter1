import java.util.Scanner;
public class FirstElement{
public static void main(String[] args){
int[] a=new int[10];
int count=0;
Scanner scr=new Scanner(System.in);
for(int i=0;i<10;i++){
a[i]=scr.nextInt();
}
for(int i=0;i<10;i++){
for(int j=i+1;j<10;j++){
if(a[i]==a[j]){
Sytem.out.println(a[i]);
count++;
}
}if(count>0)break;
}
}

}
