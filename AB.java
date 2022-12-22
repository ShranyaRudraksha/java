class AB{
public static void main(String a[]){
try{
int a[];
a= new int[10];
a[12]=20;
int d=0;
int c= 40/d;
System.out.println(a);
}
catch(ArrayIndexOutofBoundsException e){
System.out.println(e);
}
catch(ArithmeticException e){
System.out.println(e);
}
catch(Exception e){
System.out.println(e);
}
}}
