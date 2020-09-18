import java.util.ArrayList;

public class ValidadorAlfabeto {

    public static  boolean validarAlfabeto (ArrayList<String> input  )
    {
        if (input.size()>0)
        {
            for (String item:input)
            {
                if(item.equals("<")||item.equals(">")||item.equals("{")
                        ||item.equals("}")||item.equals("[")||item.equals("]")
                        ||item.equals("(")||item.equals(")"))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static String mostraResultado (boolean valor)
    {
        if (valor)
        {

            return ("Aguarde a leitura dos dados");

        }
        else
        {
            return ("Os dados informados não pertencem ao alfabeto permitido : <{[()]}>");
        }
    }
}
