package com.company;

import java.util.ArrayList;

public class ClientService {

    public void addComanda(Client client, Comanda comanda) {
        ArrayList<Comanda> comenzi = client.getComenzi();
        comenzi.add(comanda);
        client.setComenzi(comenzi);

    }

    public void rmvComanda(Client client, Comanda comanda) {
        ArrayList<Comanda> comenzi = client.getComenzi();
        comenzi.remove(comanda);
        client.setComenzi(comenzi);
    }
}
