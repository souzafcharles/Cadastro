package br.edu.ifsp.souza.charles.pdm.cadastro;
/*
Class title: Programming Mobile Devices
Lecturer: Prof. Dr. Pedro Northon Nobile
Activity presented by: Charles Fernandes de Souza
Date: August 15, 2022
*/
public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private Boolean mailing;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nome, String telefone, String email, Boolean mailing, String sexo, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.mailing = mailing;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMailing() {
        return mailing;
    }

    public void setMailing(Boolean mailing) {
        this.mailing = mailing;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Nome completo: " + nome +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nListado: " + mailing +
                "\nSexo: " + sexo +
                "\nCidade: " + cidade +
                " [" + uf + "]";
    }
}
