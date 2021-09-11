package duplamente.lista;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        lista.add("oi");
        lista.add("cara");
        lista.add("de");
        lista.add("boi");

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);

        lista.add(1, "fuca");

        System.out.println(lista + " tamanho: " + lista.size());

        System.out.println(lista.get(3));

        System.out.println(lista.have("di"));
        System.out.println(lista.have("de"));

        ListaDuplamenteEncadeada<Integer> numeros = new ListaDuplamenteEncadeada<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        System.out.println(numeros);
        System.out.println("Have any number 9 in this list? " + numeros.have(9));
        System.out.println("Have any number 4 in this list? " + numeros.have(4));

        Integer numeroAdd = 8;

        if (numeros.have(numeroAdd)) {
            System.out.println("ja existe esse numero na lista");
        } else {
             numeros.add(numeroAdd);
            System.out.println("numero " + numeroAdd + " adicionado ao final da lista");
        }

        numeros.remove(7);

        if (numeros.have(numeroAdd)) {
            System.out.println("ja existe esse numero na lista");
        } else {
            numeros.add(numeroAdd);
            System.out.println("numero " + numeroAdd + " adicionado ao final da lista");
        }
    }
}
