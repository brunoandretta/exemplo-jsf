/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.test.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class DigitoVerificadorCPFTest {
    
   @Test
   public void testsetValor(){
       String valor = "888888888";
       String resultado = "999999999";
       Assert.assertTrue(valor.length() <= resultado.length());
   }
   
   @Test
   public void testcalculaDV(){
   }
}