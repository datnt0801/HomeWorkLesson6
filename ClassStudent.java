import java.util.Scanner;

class Student {
    int StundentID;
    String name;
    int MathScore;
    int PhysicalScore;
    int ChemicalScore;


    Student(int a, String b) {
        StundentID = a;
        name = b;
    }

    Student() {
    }

    void SetMathScore(int a) {
        if (a < 0) a = 0;
        if (a > 10) a = 10;
        this.MathScore = a;
    }

    void SetPhysicalScore(int a) {
        if (a < 0) a = 0;
        if (a > 10) a = 10;
        this.PhysicalScore = a;
    }

    void SetChemicalScore(int a) {
        if (a < 0) a = 0;
        if (a > 10) a = 10;
        this.ChemicalScore = a;
    }

    float Average() {
        float average = 0;
        average = (this.MathScore + this.PhysicalScore + this.ChemicalScore) / 3;
        return average;
    }

    Boolean CheckScore() {
        if (this.MathScore + this.PhysicalScore + this.ChemicalScore >= 10) {
            return true;
        } else {
            return false;
        }
    }

    void BonusMathScore(int a) {
        this.MathScore += a;
        if (this.MathScore > 10) this.MathScore = 10;
        if (this.MathScore < 0) this.MathScore = 0;
    }
}

public class ClassStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student dat = new Student(sc.nextInt(), sc.nextLine());
        System.out.println("Set Math Score");
        dat.SetMathScore(sc.nextInt());
        System.out.println("Set Physical Score");
        dat.SetPhysicalScore(sc.nextInt());
        System.out.println("Set Chemical Score");
        dat.SetChemicalScore(sc.nextInt());

        System.out.println(dat.MathScore);
        System.out.println(dat.PhysicalScore);
        System.out.println(dat.ChemicalScore);
        System.out.println(dat.Average());

        if (dat.CheckScore()) System.out.println("True");
        else System.out.println("False");

        System.out.println("Bonus Math Score:");
        dat.BonusMathScore(sc.nextInt());
        System.out.println("After Bonus:");
        System.out.print(dat.MathScore);

        System.out.println(dat.name);
    }
}
