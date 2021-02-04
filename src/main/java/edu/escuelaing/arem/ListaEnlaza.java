package edu.escuelaing.arem;

public class ListaEnlaza {

    class Nodo {
        double info;
        Nodo sig;
    }

    private Nodo raiz;

    public ListaEnlaza () {
        raiz=null;
    }

    public void insertar(double x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public double extraer ()
    {
        if (raiz!=null)
        {
            double informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }

}
