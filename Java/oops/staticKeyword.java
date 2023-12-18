package oops;

public class staticKeyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolName = "JMV";

        student s2 = new student();
        System.out.println(s2.schoolName);

        student s3 = new student();
        s3.schoolName = "MKV";
        System.out.println(s1.schoolName);

    }
}

class student {
    static int percentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}