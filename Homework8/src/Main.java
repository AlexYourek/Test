public class Main {
    public static void main(String[] args) {
        Student[] studenciaki = {
                new Student("Zenek", 20, 4.5),
                new Student("Alicja", 22, 3.8),
                new Student("Emilia", 21, 4.2),
                new Student("Michał", 19, 3.5),
                new Student("Bartek", 20, 4.8),
        };

        System.out.println("info o studentach: ");
        for (Student zmienna_student : studenciaki) {
            System.out.println(zmienna_student.toString());
        }

        System.out.println("\nStudenci z ocena powyzej 4.0");
        for (Student zmienna_student : studenciaki) {
            if (zmienna_student.getGrade() > 4.0) {
                System.out.println(zmienna_student.toString());
            }
        }

        double srednia = obliczSredniaStudentow(studenciaki);
        System.out.println("\nSrednia ocen to: " + srednia);
    }

        public static double obliczSredniaStudentow (Student[]studenciaki){
            double suma = 0;
            for (Student student : studenciaki) {
                suma += student.getGrade();
            }
            return suma / studenciaki.length;
        }
    }