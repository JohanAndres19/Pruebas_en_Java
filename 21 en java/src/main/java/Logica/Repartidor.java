package Logica;

import java.util.*;

public class Repartidor {

    private String  valores [] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String pintas []={"Corazones","Diamantes","Treboles","Picas"};
    private ArrayList<String[]> cartas= new ArrayList<String[]>();
    private ArrayList<String[]> mano=new ArrayList<String []>();
    public Repartidor(){
        for(int i=0; i<valores.length;i++){
            for(int j=0; j<pintas.length;j++){
                String auxiliar []= new String[2];
                auxiliar[0]=valores[i];
                auxiliar[1]=pintas[j];
                cartas.add(auxiliar);
            }
        }
    }
    public ArrayList<String[]> nueva_mano(){
        mano.add(cartas.get(new Random().nextInt(cartas.size())));
        mano.add(cartas.get(new Random().nextInt(cartas.size())));
        return mano;
    }
    public ArrayList<String[]> getMano() {
        return mano;
    }
    public void setMano(ArrayList<String[]> mano) {
        this.mano = mano;
    }
}
