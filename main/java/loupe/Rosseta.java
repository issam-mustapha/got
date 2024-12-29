package loupe;

public class Rosseta {
    public String change(String chaine){
       String chaine1=chaine;
       int longeur=chaine.length();
       if(longeur>=2){
           String racine= chaine.substring(0,longeur-2);
           char dernier = chaine.charAt(longeur-1);
           char avant_dernier=chaine.charAt(longeur-2);
           chaine1= racine+dernier+avant_dernier;
       }
       return chaine1;
    }


}
