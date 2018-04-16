class Oppgave1 {
    public static void main(String[] args){
        Oppgave1 mainObject = new Oppgave1();
        int[] liste = {1, 10, 2, 6, 5, 3};
        System.out.println(mainObject.highestProd(liste));
    }

    public int highestProd(int[] liste){
        int biggest = 0;
        int middle = 0;
        int smallest = 0;

        for(int i : liste){
            if(i > biggest){
                smallest = middle;
                middle = biggest;
                biggest = i;
            }else if(i > middle){
                smallest = middle;
                middle = i;
            }else if(i > smallest){
                smallest = i;
            }
        }
        return biggest*middle*smallest;

    }
}
