package clintes.modelo.pratica;

import java.util.ArrayList;

public class RepositorioCliente implements IRespositorioCliente {
    protected ArrayList<Cliente> listacliente;

    @Override
    public void inserirCliente(Cliente cliente){
        listacliente.add(cliente);

    }

    @Override
    public void listarClientes(){
        for (int i = 0; i <=listacliente.size() ; i++) {
            System.out.println(listacliente.get(i).getName());

        }

    }

}
