
package operatorylogicznefalsetrue;
/**
 * 
 * @author pawelstradomski
 */

public class OperatoryLogiczneFalseTrue {

    
    public static void main(String[] args) {
        
        /*
        Operatory logiczne. Porownania: False, True,
        
        ! - negacja (zaprzeczenie) np:
        !(true) - false. Zamienia true na false
        !(false) - true. Zamienia false na true
        
        && - koniunkcja, polskie "i" - w tym samym momencie. Kareta tzn shift7 (&&) np:
        true true = true - tylko tutaj wyrzuci "tak"
        true false = false - nie wyrzuci "tak" chyba, ze uzyje negacji "!"
        false true = false - nie wyrzuci "tak" chyba, ze uzyje negacji "!"
        false false = false - nie wyrzuci "tak, chyba, ze uzyje negacji "!"
        
        Koniunkcja jest prawdziwa wtedy i tylko wtedy gdy oba wyrazenia sa prawdziwe
        
        || - alternatywa polskie "lub" np:
        true true - true
        true false - true
        false true - true
        false false - false
        
        Alternatywa jest falszywa tylko i tylko wtedy gdy oba wyrazenia sa falszywe
        */
        
        int aa = 5, bb = 5, cc = 7;
        if (aa == bb && cc > bb)
        System.out.println("tak");
        
        if (!(aa > cc))
            System.out.println("tak");
        
        if (aa > bb || bb < cc)
            System.out.println("tak");
        
    }
    
}
