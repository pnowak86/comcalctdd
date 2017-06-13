
public class StringCalculator {

    int add(String numbers){
    if(numbers !=""){
        int result = 0;
        String[] tab = numbers.split(",");
        for (int i = 0; i < tab.length ; i++)
        {
           result = result + Integer.parseInt(tab[i]);
        }
        return result;

        }
        return 0;
    }


}