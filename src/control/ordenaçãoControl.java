
package control;

import view.viewPrincial;
import model.boubble;
import model.insertion;
import model.merge;
import model.selection;

public class ordenaçãoControl {

    private insertion in;
    private boubble bb;
    private selection se;
    private merge me;
    private String vetorString,pop;
    private int [] vetor;
    
   
    //entrada converte pra vetor
    
    public int [] setVetorString(String[] numeros){
        int [] vetor = new int[numeros.length];
        int i = 0;
        for (String n: numeros){
            vetor[i] = Integer.parseInt(n);
            i++;
        }
        this.vetor = vetor;
        return this.vetor;
    }

    public int[] getVetor() {
        return vetor;
    }
    public StringBuilder parseString(int[] vetor){
        StringBuilder stringArray = new StringBuilder();
        for (int k: vetor){
                stringArray.append(k+" ");
            }
        return stringArray;
    }
    
    public void setIn(insertion in) {
        this.in = in;
    }

    
    public String getVetorString() {
        return vetorString;
    }
    public int[] oInsertion(){
        in = new insertion(this.vetor);
        in.ordenarInsertion(this.vetor);
        return in.Numeros();
    }
    public int [] oBoubble(){
        bb = new boubble(this.vetor);
        bb.ordenarBoubble(this.vetor);
        return bb.Numeros();
    }
    public int [] oSelection(){
        se = new selection(this.vetor);
        se.ordenarSelection(this.vetor);
        return se.Numeros();
    }
    public int [] oMerge(){
        me = new merge(this.vetor);
        me.ordenarMerge(this.vetor,0,this.vetor.length-1);
        return me.Numeros();
    }
}
