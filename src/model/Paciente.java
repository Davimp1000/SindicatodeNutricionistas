
package model;


public class Paciente 

{
    
   private String nome; 
   private String cpf; 
   private String telefone; 
   private String data; 
   private boolean jaerapaciente; 
   private boolean consultarealizada; 

   //CONSTRUTOR
    public Paciente(String nome, String cpf, String telefone, String data, boolean jaerapaciente, boolean consultarealizada) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.jaerapaciente = jaerapaciente;
        this.consultarealizada = consultarealizada;
    }

    
    
    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getJaerapaciente() {
        return jaerapaciente;
    }

    public void setJaerapaciente(boolean jaerapaciente) {
        this.jaerapaciente = jaerapaciente;
    }

    public boolean getConsultarealizada() {
        return consultarealizada;
    }

    public void setConsultarealizada(boolean consultarealizada) {
        this.consultarealizada = consultarealizada;
    }
   
   
}
