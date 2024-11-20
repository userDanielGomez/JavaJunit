package es.curso.junit.aserciones;

import java.sql.SQLOutput;

public class Utilidades {


    /**
     * Concatena y devuelve dos strings pasados por parametro
     * @param   uno ->primer String a concatenar
     * @param   dos ->segundo String a concatenar
     * @return  uno+dos
     */
    public String concatenar(String uno, String dos){
        if(uno!=null && dos!=null){
            return uno.concat(" ").concat(dos);
        }else{
            return null;
        }
    }

    /**
     * Ejemplo "a","b","c" -> String[] array = {"a","b","c"};
     * array[a]="a"
     * array[b]="b"
     * array[c]="c"
     * @param strings
     * @return Strign[strings.lenght]
     */
    public String[] getArrayStrings(String... strings){

        String[] array = new String[strings.length];

        for(int i = 0; i<strings.length;i++){
            array[i] = strings[i];
        }

        return array;
    }

}
