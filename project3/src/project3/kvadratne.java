package project3;
import java.util.Scanner;
class kvadratne{
public static void main (String args[]){
	Scanner in = new Scanner(System.in);
    System.out.print("������� 3 ����� a b c ��������������, ����� ������ � ������� Enter: ");
    float a = in.nextFloat(), b = in.nextFloat(), c = in.nextFloat();
    if(a == 0){
        System.out.println("�� 0 ������ ������!!!");            
    }else{
    float d = (float) (Math.pow(b, 2) - (4*a*c));
    double x1 = (-b + Math.sqrt(d))/2*a;
    double x2 = (-b - Math.sqrt(d))/2*a;
    if(d < 0){
    System.out.println("��� ������!");
    }else if(d == 0){
        System.out.print("������������: " + d);
        System.out.println("; ������ ���������: x = " + x1);
    }else{System.out.print("������������: " + d);
        System.out.print("; ����� ���������: x1 = " + x1);
        System.out.println(", x2 = " + x2);
    }
    }
}