public class Main {
    public static void main(String[] args) {

        ICalculator basicCalculator = new BasicCalculator("Casio", "1.0");
        ICalculator scientificCalculator = new ScientificCalculator("Casio", "5.0");
        ICalendar basicCalendar = new BasicCalendar("1.0");
        ICalendar fancyCalendar = new FancyCalendar("2.0");

        Cellphone oldCellphone = new Cellphone("Samsung", "Galaxy 3", basicCalculator, basicCalendar);
        Cellphone newCellphone = new Cellphone("Samsung", "Galaxy 8", scientificCalculator, fancyCalendar);

            System.out.println(oldCellphone.about());
            System.out.println(oldCellphone.printTodaysDate());
            System.out.println(oldCellphone.addition(2, 4));
            try {
                System.out.println(oldCellphone.exponentiation(2, 3));
            }catch(UnsupportedOperationException e){
                System.out.println(e.getMessage());
            }
            System.out.println("---------------------------------");
            System.out.println(newCellphone.about());
            System.out.println(newCellphone.printTodaysDate());
            System.out.println(newCellphone.addition(2, 4));
            System.out.println(newCellphone.exponentiation(2, 3));




    }
}
