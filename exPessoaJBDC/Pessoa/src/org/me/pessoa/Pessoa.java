package org.me.pessoa;

public class Pessoa {

    private int ID;
    private String nome;
    private String sobrenome;
    private String email;
    private String Telefone;

    public Pessoa() {
    }

    public Pessoa(int cod, String n, String s, String e, String f) {
        setID(cod);
        setNome(n);
        setSobrenome(s);
        setEmail(e);
        setTelefone(f);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
}

