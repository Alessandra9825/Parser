import com.sun.org.apache.xpath.internal.operations.Bool;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AnalisadorSintatico {
    public static boolean validadorSintatico (ArrayList<String> inputValidate)
    {
        ArrayList<String> simbolOpen = new ArrayList<>();
        double contValidos = 0;
        for ( int i = 0; i<inputValidate.size();i++)
        {
            if (inputValidate.get(i).equals("<")||inputValidate.get(i).equals("{")||inputValidate.get(i).equals("[")||
                inputValidate.get(i).equals("("))
            {
                simbolOpen.add(inputValidate.get(i));

            }
            else if(simbolOpen.size()>0) {
                if (simbolOpen.get(simbolOpen.size()-1).equals("<") && inputValidate.get(i).equals(">")
                        || simbolOpen.get(simbolOpen.size()-1).equals("{") && inputValidate.get(i).equals("}")
                        ||simbolOpen.get(simbolOpen.size()-1).equals("(") && inputValidate.get(i).equals(")")
                        ||simbolOpen.get(simbolOpen.size()-1).equals("[") && inputValidate.get(i).equals("]"))
                {
                    contValidos++;
                    simbolOpen.remove(simbolOpen.get(simbolOpen.size()-1));
                }
            }
        }
        double qtPares = inputValidate.size()/2.00;
        if (simbolOpen.size() == 0 &&  contValidos == qtPares)
        {
            return true;
        }

        return false;
    }
    public static String mostraResultado( boolean valor)
    {
        if (valor)
        {
            return ("Simbolos balanciados");
        }
        else
        {
            return ("A sequencia informada NÃO esta balanceada !!!!!");
        }
    }
}
