package classe;

/**
 *
 * @author cassi
 */
public class Venda {
    private String nome = "";
    private String cpf = "" ;
    private String telefone = "";
    private String ingresso = "";
    private String assento = "";
    private String pagamento = "";
    
 
 public String getCpf() {
        return cpf;
    }
    
 public String getNome() {
        return nome;
    }
 
 public String getTelefone() {
        return telefone;
    }
 
  public String getIngresso() {
        return ingresso;
    }
  
   public String getAssento() {
        return assento;
    }
   
    public String getPagamento() {
        return pagamento;
    }
 
 public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
 public void setNome(String nome) {
        this.nome = nome;
    }
 
 public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
  public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }
  
  public void setAssento(String assento) {
        this.assento = assento;
    }
  
  public void setPagamento(String pagamento){
        this.pagamento = pagamento;
    }
 
 public void deleteCliente(){
       cpf = "";
       nome = "";
       telefone = "";
       ingresso = "";
       assento = "";
       pagamento = "";
    }  
    
}
