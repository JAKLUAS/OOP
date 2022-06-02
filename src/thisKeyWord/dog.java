package thisKeyWord;

public class dog {
    String name;
    String breed ;
    int age;
    boolean isVaccinated;

    public dog(){
        this("Rex","Golden Rtriever",5,false);
//        name = "Rex";
//        breed ="Golden Retriever";
//        age = 5;                     this parantezi icerisine butun ozellikleri aktarabilir tek sira halinde yazabiliriz
//        isVaccinated = false;


    }
    public dog (String breed){
        this("Max",breed,8, true);
//        name = "Max";
//        age= 8;v
//        isVaccinated = true ;  SONUC OLARAK EGER HAYVANINN CINSI UZERINDE KATEGORI OLUSTURULACAKSA TEK BIR SIRA HALINE GETIRILEBILIR

    }

    public dog(String name, String breed, int age, boolean isVaccinated) {
        this.breed = breed;   // ust siralarda isleme alinmis veriable varsa bu sekilde yapilir
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }
}
