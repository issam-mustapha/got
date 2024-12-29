package loupeTester;

import loupe.Rosseta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TesterRien {

        Rosseta modifier ;

    @BeforeEach
    void setUp(){
        modifier= new Rosseta();
    }
    @AfterEach
    void tearDown(){
        modifier=null;
    }







    @Test
    void tester_rien(){
        //given
        String chaine="RINE";
        //when
        String actualChaine= modifier.change("RIEN");
        //THEN
        assertThat(actualChaine).isEqualTo(chaine);
    }
    @Test
    void tester_ab(){
        //given
        String chaine="ba";
        //when
        String actualChaine= modifier.change("ab");
        //THEN
        assertThat(actualChaine).isEqualTo(chaine);
    }
@ParameterizedTest
    @CsvSource({"'issam','issma'","'adoch','adohc'","'deufyugceiuedceeyuvc','deufyugceiuedceeyucv'"})

void testerissam(String chaine_entre , String chaine_sortie){
        assertThat(modifier.change(chaine_entre)).isEqualTo(chaine_sortie);
}









}
