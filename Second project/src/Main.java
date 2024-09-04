 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int age = 17;
        int day = 4;
        boolean should_drink= false;
        if (age >= 18){

            System.out.println("You can drink");
        }else {
            System.out.println("not allowed to drink");
        }
        if(day == 1){
            System.out.println("Today is Monday");

        }else if(day == 2){
            System.out.println("Today is Tuesday");
        }else if(day == 3){
            System.out.println("Today is Wednesday");

        }else if(day == 4){
            System.out.println("Today is Thursday");

        }else if(day == 5){
            System.out.println("Today is Friday");

        }else if(day == 6){
            System.out.println("Today is Saturday");

        }else {
            System.out.println("Today is Sunday");

        }
        int chem_m = 60;
        if(chem_m >= 80){
            System.out.println("You got an A");
        }else if (chem_m >= 75){
            System.out.println("You got an A-");
        }else if (chem_m >= 65 ){
            System.out.println("You got an B");
        }else if (chem_m >= 55 ){
            System.out.println("You got an B-");
        }else if (chem_m >= 45 ){
            System.out.println("You got an C");
        }else if (chem_m >= 35 ){
            System.out.println("You got an C-");
        }else if (chem_m >= 25 ){
            System.out.println("You got an D");
        }else if (chem_m >= 15 ){
            System.out.println("You got an D-");
        }else {
            System.out.println("You got an E");
        }
        char unit = 'e';
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit name:   ");
        String unit = sc.nextLine();
        System.out.println();

         */
        switch (unit){
            case 'd' :
                System.out.println("Database Management Systems");
                break;
            case 'a' :
                System.out.println("Artificial Intelligence");
                break;
            case 'o' :
                System.out.println("Object Oriented Programming");
                break;
            case 'c' :
                System.out.println("Calculus");
                break;
            case 'm' :
                System.out.println("Mathematics for Science");
                break;
            case 'e' :
                System.out.println("Software Engineering");
                break;
            default :
                System.out.println("Enter a valid course");


        }
        String a = "math";
        switch (a){
            case "eng" :
                System.out.println("English");
                break;
            case "sci" :
                System.out.println("Science");
                break;
            case "kis" :
                System.out.println("Kiswahili");
                break;
            case "math" :
                System.out.println("Mathematics");
                break;
        }


    }
}