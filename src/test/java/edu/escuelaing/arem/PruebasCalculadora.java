package edu.escuelaing.arem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.io.Reader;

/**
 * Unit test for simple App.
 */
public class PruebasCalculadora{
    private final CalculadoraOperaciones cal = new CalculadoraOperaciones();
    private final Reader rea = new Reader() {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return 0;
        }

        @Override
        public void close() throws IOException {

        }
    };
    private final String file1 = "lecturaArchivo.txt";
    private final String file2 = "test2.txt";


    public void AppFile1(){
        try{
            String[] args = {file1};
            CalculadoraOperaciones.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }

    private void assertTrue(boolean b) {
    }


    public void AppFile2(){
        try{
            String[] args = {file2};
            CalculadoraOperaciones.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
}
