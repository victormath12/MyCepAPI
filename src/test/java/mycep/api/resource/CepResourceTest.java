package mycep.api.resource;
import java.util.List;
import mycep.api.exception.CepInvalidException;
import mycep.api.model.Cep;
import mycep.api.service.CepService;
import mycep.api.service.impl.CepServiceImpl;
import mycep.api.util.CepDataset;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


/**
 * Classe de Teste do Resource para consultas de CEP
 * @author victorsax12@gmail.com
 */
public class CepResourceTest {
 
 
 /**
 * Mockito Spy Classes
 */
 CepDataset cepDataset = spy(new CepDataset());
 CepService cepService = spy(new CepServiceImpl());
  
  

 /**
  * Testar o recurso FIND com 4 CEPs Validos
  * @throws CepInvalidException
  */
 @Test
 public void validCepTest() throws CepInvalidException {
  

  //Mocar lista de Dataset   
  List<Cep> cepMockList = cepDataset.getCepList();
  when(cepDataset.getCepList()).thenReturn(cepMockList);
  
  
  //Executar Teste com 4 CEPS validos do Dataset
  Cep cepTest = cepService.getCEP("9260070");
  assertEquals("Parque Oratório", cepTest.getBairro());
  
  cepTest = cepService.getCEP("9720973");
  assertEquals("Centro", cepTest.getBairro());
  
  cepTest = cepService.getCEP("9725390");
  assertEquals("Alameda Glória", cepTest.getRua());
  
  cepTest = cepService.getCEP("9715265");
  assertEquals("São Bernardo do Campo", cepTest.getCidade());
  
  
 }

 
 
 
 /**
  * Testar o recurso FIND com 4 CEPs que serão preenchidos com zero
  * @throws CepInvalidException
  */
 @Test
 public void cepWithZerosTest() throws CepInvalidException {
  

  //Mocar lista de Dataset   
  List<Cep> cepMockList = cepDataset.getCepList();
  when(cepDataset.getCepList()).thenReturn(cepMockList);
  
  
  //Executar Teste com 4 CEPS validos do Dataset
  Cep cepTest = cepService.getCEP("1112548");
  assertEquals("1100000", cepTest.getCepId());
  
  cepTest = cepService.getCEP("2285211");
  assertEquals("2200000", cepTest.getCepId());
  
  cepTest = cepService.getCEP("3389521");
  assertEquals("3300000", cepTest.getCepId());
  
  cepTest = cepService.getCEP("4458952");
  assertEquals("4400000", cepTest.getCepId());
  
  
 }

 
 
 
 /**
  * Testar o recurso FIND com 4 CEPs Inválidos - devem retornar CepInvalidException
  * @throws CepInvalidException
  */
 @Test(expected = CepInvalidException.class)
 public void cepNotFoundTest() throws CepInvalidException{

  
   //Mocar lista de Dataset   
   List<Cep> cepMockList = cepDataset.getCepList();
   when(cepDataset.getCepList()).thenReturn(cepMockList);
   

   //Executar 4 Testes do CepService (ambas devem retornar Exception)
   Cep cepTest = cepService.getCEP("25599596");
       cepTest = cepService.getCEP("45516486");
       cepTest = cepService.getCEP("");
       cepTest = cepService.getCEP(null);
         
 }


 
}
