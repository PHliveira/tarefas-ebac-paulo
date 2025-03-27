package pkt.testes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class TestUmTest  {
    @Test
    public void testSepararNomes() {
        // Simula a entrada do console
        String entrada = "Julia F\nMarcos M\nAna F\nPedro M\nfim\n";
        InputStream in = new ByteArrayInputStream(entrada.getBytes());
        System.setIn(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Executa o código a ser testado
        ListaLambda.main(new String[]{});

        // Restaura a entrada e saída padrão do console
        System.setIn(System.in);
        System.setOut(System.out);

        // Prepara os resultados esperados
        List<String> esperadoNomeF = List.of("JULIA F", "ANA F");
        List<String> esperadoNomeM = List.of("MARCOS M", "PEDRO M");

        // Verifica os resultados
        String saida = outContent.toString();
        assertEquals("Nomes com Femeninos " + esperadoNomeF + "\nNomes com Masculinos " + esperadoNomeM + "\n", saida.substring(saida.indexOf("Nomes com Femeninos")));
    }

}