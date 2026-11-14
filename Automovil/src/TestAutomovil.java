public class TestAutomovil {
    public static void main(String[] args){
        Automovil automovilUno= new Automovil("Tesstarosa","Ferrari",1850); //Da error porque 1850<1886.
        System.out.println(automovilUno);
        Automovil automovilDos= new Automovil("BMW X5","BMW",1999); //No da error porque 1999>1886 y hay marca y modelo.
        System.out.println(automovilDos);
        Automovil automovilTres= new Automovil(" ","BMW",1886); //Da error porque no hay modelo.
        System.out.println(automovilTres);
        Automovil automovilCuatro= new Automovil("BMW X5"," ",1999); //Da error porque no hay marca.
        System.out.println(automovilCuatro);
    }
}
