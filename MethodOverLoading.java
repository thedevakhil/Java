class MethodOverLoading{
public static void main(String[] args){
area(5);
area(3,5);
area(3.14,3);
}
 static void area(int a){
System.out.println("Area of square ="+a*a);
 }
 static void area(int a,int b){
 System.out.println("Area of Rectangle = "+a*b);
 }
 static void area(double pi, int r){
 System.out.println("Area of Circle= "+2*pi*(r*r));}}

