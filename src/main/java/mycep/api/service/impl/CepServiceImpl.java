package mycep.api.service.impl;
import java.util.List;
import mycep.api.exception.CepInvalidException;
import mycep.api.model.Cep;
import mycep.api.service.CepService;
import mycep.api.util.CepDataset;


/**
 * Classe que determina as funcionalidades do Service de CEPs
 * Classe que implementa os metodos da Inteface CepService
 * @version 1.0
 * @author victorsax12@gmail.com
 */
public class CepServiceImpl implements CepService{

 
 
 /**
	 * Retorna um Objeto Cep (Com o endereco completo) a partir de um cepId (Numero do Cep)
  * @param cepId
	 * @return Cep
  * @throws CepInvalidException
	 */
 public Cep getCEP(String cepId) throws CepInvalidException{
  
  try{
          
   
      Cep cepResult = null;
      CepDataset dataset = new CepDataset();
      List<Cep> cepMockList = dataset.getCepList();

      //Boleano que determina se o Cep foi encontrado no Dataset
      boolean cepFinded = false;

      //Quantidade de zeros inseridos no cep
      Integer zerosCount = 0;


     while(cepFinded == false) {

        //Procura Cep no Dataset
        for(Cep cepObj : cepMockList){
         if(cepObj.getCepId().equals(cepId)){
          cepResult = new Cep();
          cepResult = cepObj;
          cepFinded = true;
          break;
         }
        }

        //Se não encontrar, insere um zero no final e tenta novamente
        if(cepFinded == false){

          if(zerosCount < cepId.length()){
             zerosCount++;
             char[] c = cepId.toCharArray();
             c[(cepId.length() - zerosCount)] = '0';
             cepId = new String(c); 			
          }else{
           break;
          }

        }
     }

    //Retornar objeto CEP
    if(cepResult != null)
     return cepResult;
    else
     throw new CepInvalidException();


  }catch(Exception erro){
    erro.printStackTrace();
    throw new CepInvalidException(erro.getMessage());
  }
  
 }

 
}
