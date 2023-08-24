package elementos;
/**
 *
 * @author joaop
 */
public class Cliente {
    private String nome;
    private String CPF;
    private String destino;
    private String cidade;
    private String horario;
    private String nascimento;
    private String sexo;
    private String data;
    private double valor;
    private String classe;

    public Cliente(String nome, String CPF, String destino, String cidade,
            String horario, String nascimento, String sexo, String data,
            Double valor, String classe) {
        this.nome = nome;
        this.CPF = CPF;
        this.destino = destino;
        this.cidade = cidade;
        this.horario = horario;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.data = data;
        this.valor = valor;
        this.classe = classe;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
