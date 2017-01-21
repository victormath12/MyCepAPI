package mycep.api.resource;
import com.google.gson.Gson;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import mycep.api.exception.CepInvalidException;
import mycep.api.model.Cep;
import mycep.api.model.RestResponse;
import mycep.api.service.CepService;
import mycep.api.service.impl.CepServiceImpl;


/**
 * Resource da API para consultar CEPs e enderecos
 * @version 1.0
 * @author victorsax12@gmail.com
 */
@Path("/cep")
public class CepResource implements IRestResources<Cep>{
 

   //Call CepService
   private final CepService cepService = new CepServiceImpl();



   /**
   * Metodo para Consulta basica na API através de um Request (JSON) 
   * @param cepObject
   * @return Response
   */
   @Override
   public Response find(@NotNull Cep cepObject){ 

    try{


      //Validar o Parametro da Requisicao
      if(cepObject == null)
       throw new CepInvalidException();


      //Capturar o CEP atraves do cepId (numero do cep)
      Cep cep = cepService.getCEP(cepObject.getCepId());
      

      //Return REST Response
      return RestResponse.jsonResponse(cep, Response.Status.OK);

      
    }catch(CepInvalidException cepError){
      return RestResponse.jsonResponse(cepError.getMessage(), Response.Status.NO_CONTENT);
    }catch(Exception error){
      return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }

   }


 
}
