import java.util.ArrayList;

public class ValidadorAlfabeto {

    public static  boolean validarAlfabeto (ArrayList<String> input  )
    {
        if (input.stream().count()>0)
        {
            for (String item:input)
            {
                if(item.equals("<")||item.equals(">")||item.equals("{")||item.equals("}")||item.equals("[")||item.equals("]")||item.equals("(")||item.equals(")"))
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
}
