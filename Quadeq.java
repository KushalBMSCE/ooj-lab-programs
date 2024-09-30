import java.util.Scanner;
class Equation{
int a=0,b,c;
double r1,r2,d;
void getd(){
Scanner s=new Scanner(System.in);
while (a==0){
System.out.println("Enter coeffcient of a");
a=s.nextInt();
if (a==0){
System.out.println("No possible solutions when a is 0");
}
}
System.out.println("Enter coeffcient of b");
b=s.nextInt();
System.out.println("Enter coeffcient of c");
c=s.nextInt();
d=(b*b)-(4*a*c);
if (d==0){
r1=(-b)/(2*a);
System.out.println("Roots are real and equal i.e root 1 and root 2 is"+ r1);
}
else if (d>0){
r1=((-b) + (Math.sqrt(d)))/(double)(2*a);
r2=((-b) - (Math.sqrt(d)))/(double)(2*a);
System.out.println("Roots are real ");
System.out.println("Root 1 "+r1);
System.out.println("Root 2 "+r2);
}
else if(d<0){
r1=(-b)/(2*a);
r2 = Math.sqrt(-d)/(2*a);
System.out.println("Roots are real and imaginary i.e ");
System.out.println("Root 1 : "+ r1);
System.out.println("Root 2 : "+ r2);
}
}
}
public class Quadeq{
public static void main(String args[]){
Equation e1=new Equation();
e1.getd();
System.out.println("Kushal Naidu N");
System.out.println("USN : 24BECS408");
}
}

