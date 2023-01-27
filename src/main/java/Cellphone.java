public class Cellphone {

    private String brand;
    private String model;
    private ICalculator calculator;
    private ICalendar calendar;

    public Cellphone(String brand, String model, ICalculator calculator, ICalendar calendar) {
        this.brand = brand;
        this.model = model;
        this.calculator = calculator;
        this.calendar = calendar;
    }

    public String about(){
        return brand + " " + model + calculator.about() + calendar.about();
    }

    public String printTodaysDate(){
        return calendar.printTodaysDate();
    }

    public int addition(int a, int b){
        return calculator.addition(a, b);
    }

    public int exponentiation(int base, int exponent){
        /*int result;
        try{
        result = calculator.exponentiation(base, exponent);
         }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
            result = -1;
        }
        return result;*/
        return calculator.exponentiation(base, exponent);

}}
