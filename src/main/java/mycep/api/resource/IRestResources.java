package mycep.api.resource;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface que determina de forma Generica os principais metodos de comunicacao RESTful da API
 * @version 1.0
 * @author victorsax12@gmail.com
 * @param <T>
 */
public interface IRestResources<T>{
 
 
 /**
 * Metodo para Consulta basica na API através de um Request (JSON) 
 * @param dataObject
	* @return Response
	*/
 @POST
 @Path("/find")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Response find(@NotNull T dataObject);
 
 
}
