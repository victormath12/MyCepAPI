package mycep.api.util;
import java.util.ArrayList;
import java.util.List;
import mycep.api.model.Cep;


/**
 * Classe que oferece uma lista de CEPs validos, como um conjunto de dados para a API
 * @version 1.0
 * @author victorsax12@gmail.com
 */
public class CepDataset {
 
 
 
  //Lista de CEPs
  private List<Cep> cepList = new ArrayList<Cep>();
  
  
  /**
	 * Retorna um conjunto de CEPs validos - Deve ser utilizado para simular dados do BD
	 * @return List Cep
	 */
  public List<Cep> getCepList(){
   
   		Cep cep1 = new Cep();
     cep1.setCepId("9260070");
     cep1.setBairro("Parque Oratório");
     cep1.setCidade("Santo André");
     cep1.setEstado("SP");
     cep1.setRua("Rua Tanganica");
     
     Cep cep2 = new Cep();
     cep2.setCepId("9720973");
     cep2.setBairro("Centro");
     cep2.setCidade("São Bernardo do Campo");
     cep2.setEstado("SP");
     cep2.setRua("Avenida Brigadeiro Faria Lima");
     
     Cep cep3 = new Cep();
     cep3.setCepId("9725390");
     cep3.setBairro("Centro");
     cep3.setCidade("São Bernardo do Campo");
     cep3.setEstado("SP");
     cep3.setRua("Alameda Glória");
     
     Cep cep4 = new Cep();
     cep4.setCepId("9715265");
     cep4.setBairro("Rudge Ramos");
     cep4.setCidade("São Bernardo do Campo");
     cep4.setEstado("SP");
     cep4.setRua("Rua Alcides de Almeida");
     
     Cep cep5 = new Cep();
     cep5.setCepId("9715160");
     cep5.setBairro("Rudge Ramos");
     cep5.setCidade("São Bernardo do Campo");
     cep5.setEstado("SP");
     cep5.setRua("Rua Gonçalves Dias");
     
     Cep cep6 = new Cep();
     cep6.setCepId("1100000");
     cep6.setBairro("Pinheiros");
     cep6.setCidade("São Paulo");
     cep6.setEstado("SP");
     cep6.setRua("Rua Paulo Cruz");
     
     Cep cep7 = new Cep();
     cep7.setCepId("2200000");
     cep7.setBairro("Centro");
     cep7.setCidade("Praia Grande");
     cep7.setEstado("SP");
     cep7.setRua("Rua Grande Praia");
     
     Cep cep8 = new Cep();
     cep8.setCepId("3300000");
     cep8.setBairro("Centro");
     cep8.setCidade("Santos");
     cep8.setEstado("SP");
     cep8.setRua("Rua Osmar Silva");
     
     Cep cep9 = new Cep();
     cep9.setCepId("4400000");
     cep9.setBairro("Guarulhos");
     cep9.setCidade("São Paulo");
     cep9.setEstado("SP");
     cep9.setRua("Rua Tiradentes");

     cepList.add(cep1);
     cepList.add(cep2);
     cepList.add(cep3);
     cepList.add(cep4);
     cepList.add(cep5);
     cepList.add(cep6);
     cepList.add(cep7); 
     cepList.add(cep8); 
     cepList.add(cep9); 
     
     return cepList;
   
  }

 
}
