package revisao.model;

public class Cliente {
    private long id;
    private String nome;
    private double credito;

    public Cliente(){}
           
    public Cliente(long id, String nome, double credito) {
        this.id = id;
        this.nome = nome;
        this.credito = credito;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double creditoAtt) {
        this.credito = creditoAtt;
    }

   

    @Override
    public String toString() {
        return "Cliente{" + "id= " + id + ", nome=" + nome + ", credito= "
                + credito +  '}';
    }
    
}
