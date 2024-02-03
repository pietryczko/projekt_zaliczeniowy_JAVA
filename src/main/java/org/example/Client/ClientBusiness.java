package org.example.Client;

public class ClientBusiness extends Client{
    private int nip;

    public ClientBusiness(String name, String lastName, int pesel, int nip) {
        super(name, lastName, pesel);
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", pesel=" + getPesel() +
                ", nip=" + nip +
                ", type= business" +
                '}';
    }

}
