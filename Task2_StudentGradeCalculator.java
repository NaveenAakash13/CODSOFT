import java.util.*;

class StudentGradeCalculator{
    public static void main(String ar[]){
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter the marks of the students:");
        int a=qq.nextInt();
        int b=qq.nextInt();
        int c=qq.nextInt();
        int d=qq.nextInt();
        int e=qq.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total marks taken: "+total);
        int avg=total/5;
        System.out.println("Average marks taken: "+avg);
        if(avg>=91){
            System.out.println("Grade recieved: O");
        }
        else if(avg>=81&&avg<=90){
            System.out.println("Grade recieved: A");
        }
        else if(avg>=71&&avg<=80){
            System.out.println("Grade recieved: B");
        }
        else if(avg>=61&&avg<=70){
            System.out.println("Grade recieved: C");
        }
        else if(avg>=51&&avg<=60){
            System.out.println("Grade recieved: D");
        }
        else if(avg>=41&&avg<=50){
            System.out.println("Grade recieved: E");
        }
        else{
            System.out.println("Grade recieved: F");
        }
        qq.close();
    }
}