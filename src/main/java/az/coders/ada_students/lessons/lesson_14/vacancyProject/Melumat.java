package az.coders.ada_students.lessons.lesson_14.vacancyProject;

public class Melumat{

    public static final Checker2[] checker2 = new Checker2[7];

    public static void loadData(){
        checker2[0] = new Checker2("ADA MMC şirkəti", "Bakı şəhəri", 18, "Java", 700);
        checker2[1] = new Checker2("DA MMC şirkəti", "Bakı şəhəri", 20, "Phyton",  1000);
        checker2[2] = new Checker2("SSD MMC şirkəti", "Gəncə şəhəri", 18, "JavaScript", 800);
        checker2[3] = new Checker2("Kapital Bank", "Bakı şəhəri", 25, "C#", 900);
        checker2[4] = new Checker2("CSS MMC şirkəti", "Bakı şəhəri", 18, "GO", 2000);
        checker2[5] = new Checker2("Pasha Bank", "Naxçıvan şəhəri", 30, "C++", 1200);
        checker2[6] = new Checker2("Pasha MMC şirkəti", "Naxçıvan şəhəri", 20, "HTML ve CSS", 1500);
    }
}

//    public String check(){
//        Checker checker1 = new Checker();
//        if (checker1.age >= 18 && checker1.description.contains("Java") && checker1.salary >= 500 && checker1.salary <= 1000 && checker1.location.contains("Bakı"))
//            return Arrays.toString(vac1);
//        else if(checker1.age > 20 && (checker1.description.contains("Java") && (checker1.description.contains("Phyton"))) && checker1.salary >= 1000 && checker1.location.contains("Bakı"))
//            return Arrays.toString(vac2);
//        else if(checker1.age >= 18 && checker1.description.contains("C") && checker1.description.contains("C++") && checker1.description.contains("Javascript") && checker1.salary >= 300 && checker1.salary <= 500 && checker1.location.contains("Gəncə"))
//            return Arrays.toString(vac3);
//        else if(checker1.age >= 25 && checker1.description.contains("Java") && checker1.description.contains("C#") && checker1.salary >= 500 && checker1.salary <= 800 && checker1.location.contains("Bakı"))
//            return Arrays.toString(vac4);
//        else if ( checker1.age >= 18 && checker1.description.contains("Java") && checker1.description.contains("JavaScript") && checker1.salary >= 700 && checker1.salary <= 1000 && checker1.location.contains("Naxçıvan"))
//            return Arrays.toString(vac5);
//        else if ( checker1.age >= 30 && checker1.description.contains("C#") && checker1.description.contains("JavaScript") && checker1.salary >= 700 && checker1.salary <= 1200 && checker1.location.contains("Naxçıvan"))
//            return Arrays.toString(vac5);
//        else if ( checker1.age >= 20 && checker1.description.contains("JavaScript") && checker1.salary >= 700 && checker1.salary <= 1000 && checker1.location.contains("Bakı"))
//            return Arrays.toString(vac5);
//        else
//            return "Hələlik sizin üçün vakansiyamız yoxdur :-(((";
//
//    }