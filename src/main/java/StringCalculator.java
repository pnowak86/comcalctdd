
public class StringCalculator {

    int add(String numbers){
    if(numbers !=""){
        String[] tab = numbers.split(",");
        int result = Integer.parseInt(tab[0]) + Integer.parseInt(tab[1]);
        return result;
        }
        return 0;
    }


}