import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tratamento
{
    public final static String diretorio = System.getProperty("user.dir") + "\\validar.txt";
    public static boolean validaTxt() throws IOException {
        if (Files.exists(Paths.get(diretorio)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static ArrayList<String> lerTxt()
    {
        ArrayList<String>inputTxt = new ArrayList<>();

        try
        {
            if (validaTxt())
            {
                FileReader leitor = new FileReader(diretorio);
                BufferedReader leitorBuffer = new BufferedReader(leitor);
                String linha;

                while ((linha = leitorBuffer.readLine()) != null)
                {
                    for (int i = 0;i<linha.length();i++)
                    {
                        inputTxt.add(linha.substring(i,i+1));
                    }
                }
            }
            return inputTxt;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return  inputTxt;
        }
    }

    public static ArrayList<String> lerDigitacao(String linha)
    {
        ArrayList<String> inputTxt = new ArrayList<>();
        try
        {
            for (int i = 0; i < linha.length(); i++) {
                inputTxt.add(linha.substring(i, i + 1));
            }
            return inputTxt;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return inputTxt;
        }
    }
}
