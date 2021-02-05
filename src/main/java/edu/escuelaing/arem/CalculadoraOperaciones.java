package edu.escuelaing.arem;

public class CalculadoraOperaciones {

    public static Double operate(ListaEnlaza l, Operaciones principal) {
        return null;
    }

    interface Operaciones {
        Double operation(ListaEnlaza lis);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("incorrect arguments.");
        } else {
            LecturaDocs r = new LecturaDocs();
            CalculadoraOperaciones cal = new CalculadoraOperaciones();
            ListaEnlaza l = r.readinList(r.read(args[0]));

            /**
             * Calcula la media dada una lista de Doubles
             * @param lis lista de Doubles
             * @return el valor de la media como tipo Double
             */
            Operaciones principal = (lis) ->
            {
                Double sum = 0.0;
                for (int i = 0; i < lis.size(); i++) {
                    sum += lis.get(i);
                }
                sum = sum / lis.size();
                return sum;
            };
            /**
             * Calcula la desviación estandar de la lista dada
             * @param lis lista de Doubles
             * @return el valor de la desviación estandar como tipo Double
             */
            Operaciones standarDes = (ListaEnlaza lis) ->
            {
                Double sum = 0.0;
                Double avr = CalculadoraOperaciones.operate(lis, principal);
                for (int i = 0; i < lis.size(); i++) {
                    sum += Math.pow(lis.get(i) - avr, 2);
                }
                sum = Math.sqrt(sum / (lis.size() - 1));
                return sum;
            };
        }
    }
}