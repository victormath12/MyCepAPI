package mycep.api.model;

/**
 * @author victorsax12@gmail.com
 */
public class Cep {
 
 
 //Attributes
 private String cepId;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
 

 public String getCepId() { 
  return cepId;
 }

 //Getters e Setters
 public void setCepId(String cepId) { 
  this.cepId = cepId;
 }

 public String getRua() {
  return rua;
 }

 public void setRua(String rua) {
  this.rua = rua;
 }

 public String getBairro() {
  return bairro;
 }

 public void setBairro(String bairro) {
  this.bairro = bairro;
 }

 public String getCidade() {
  return cidade;
 }

 public void setCidade(String cidade) {
  this.cidade = cidade;
 }

 public String getEstado() {
  return estado;
 }

 public void setEstado(String estado) {
  this.estado = estado;
 }
 

}
