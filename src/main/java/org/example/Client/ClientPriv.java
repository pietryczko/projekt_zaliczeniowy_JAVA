package org.example.Client;

public class ClientPriv extends Client {
    private int clientNum;

    public ClientPriv(String name, String lastName, int pesel, int clientNum) {
        super(name, lastName, pesel);
        this.clientNum = clientNum;
    }

    public int getClientNum() {
        return clientNum;
    }

    public void setClientNum(int clientNum) {
        this.clientNum = clientNum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", pesel=" + getPesel() +
                ", clientNumber=" + clientNum +
                ", type= private" +
                '}';
    }
}
