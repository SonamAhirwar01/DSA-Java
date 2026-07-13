package OOPS;

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students(1 ,"Sonam", 95 );
        Students s2 = new Students(2 ,"Ankita", 96 );
        Students s3 = new Students(3 ,"Yashika", 100 );
        Students s4 = new Students(4 ,"vishakha", 55 );
        Students s5 = new Students(5 ,"Vanshika", 10 );
        Students s6 = new Students(6 ,"Yarun", 1);
        Students s7 = new Students(7 ,"Yash", 10 );
        Students s8 = new Students(8 ,"Yashvi", 90 );
        Students s9 = new Students(9 ,"tappu", 18 );
        Students s10 = new Students(10 ,"goli", 10 );

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
    }

}
class Students{
    int rno;
    String name;
    int marks;

    Students(int rno, String name , int marks){
        this.rno= rno;
        this.name=name;
        this.marks= marks;
    }

    void display(){
        System.out.println(rno+" "+ name +" "+ marks);
    }
}

