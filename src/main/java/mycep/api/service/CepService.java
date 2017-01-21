package mycep.api.service;
import mycep.api.exception.CepInvalidException;
import mycep.api.model.Cep;

/**
 * Interface que determina os metodos base do service de CEP (CepServiceImpl)
 * @version 1.0
 * @author victorsax12@gmail.com
 */
public interface CepService {
  
 
 /**
	 * Retorna um Objeto Cep (Com o endereco completo) a partir de um cepId (Numero do Cep)
  * @param cepId
	 * @return Cep
  * @throws CepInvalidException
	 */
 Cep getCEP(final String cepId) throws CepInvalidException;
 
 
 
}
