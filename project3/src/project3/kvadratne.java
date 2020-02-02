package project3;
import java.util.Scanner;
class kvadratne{
public static void main (String args[]){
	Scanner in = new Scanner(System.in);
    System.out.print("Введите 3 числа a b c соответственно, через пробел и нажмите Enter: ");
    float a = in.nextFloat(), b = in.nextFloat(), c = in.nextFloat();
    if(a == 0){
        System.out.println("На 0 делить нельзя!!!");            
    }else{
    float d = (float) (Math.pow(b, 2) - (4*a*c));
    double x1 = (-b + Math.sqrt(d))/2*a;
    double x2 = (-b - Math.sqrt(d))/2*a;
    if(d < 0){
    System.out.println("Нет корней!");
    }else if(d == 0){
        System.out.print("Дискриминант: " + d);
        System.out.println("; Корень уравнения: x = " + x1);
    }else{System.out.print("Дискриминант: " + d);
        System.out.print("; Корни уравнения: x1 = " + x1);
        System.out.println(", x2 = " + x2);
    }
    }
}