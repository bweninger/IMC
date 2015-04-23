/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31213162
 */
public class TesteIMC {
    
    public TesteIMC() {
    }
    
    @Test
    public void testeCalculoIMC(){        
        Ex2 ex = new Ex2();
        ex.altura = 1.7;
        ex.peso = 70;
        ex.calcularIMC();
        assertEquals("24,221453", String.format("%2f", ex.getIMC()));        
    }
    
    @Test
    public void testeMensagemHomem(){
        Ex2 ex = new Ex2();
        ex.altura = 1.7;
        ex.peso = 70;
        ex.calcularIMC();
        ex.setSexo(SexoEnum.HOMEM);
        assertTrue(ex.tratarImcHomem().contains("PARABENS!!Voce esta com o peso ideal!"));
    }
    
    @Test
    public void testeMensagemMulher(){
        Ex2 ex = new Ex2();
        ex.altura = 1.7;
        ex.peso = 95;
        ex.calcularIMC();
        ex.setSexo(SexoEnum.MULHER);
        assertTrue(ex.tratarIMCMulher().contains("CUIDADO!!Voce esta obesa!"));
    }

}
