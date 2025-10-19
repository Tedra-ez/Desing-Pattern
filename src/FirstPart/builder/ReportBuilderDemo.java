package FirstPart.builder;

public class ReportBuilderDemo {


    public static void steid(){
        System.out.println("dsdasd");
    }

    public static void main(String[] args) {
        Report fullReport = new Report.Builder()
                .setTitle("Design Patterns in Java")
                .setAuthor("Yskak Zhanibek")
                .setContent("This report explains the Builder Pattern with Clean Code principles.")
                .setFooter("Astana IT Univeristy")
                .build();
        Report shortReport = new Report.Builder()
                .setTitle("Software")
                .setAuthor("Ivan")
                .build();
        System.out.println("===== REPORT 1 =====");
        System.out.println(fullReport);
        System.out.println("\n===== REPORT 2 =====");
        System.out.println(shortReport);

        steid();
    }
}
