package Essais;

public class Poesie {

    public static void main(String[] args) {
        
        String poeme =  " .rosért nu tse liavart el euQtrom as tnava rertnom ruel eDegas tuf erèp el siaM .éhcac ed tniop ,tnegra’D.egatnavad atroppar ne lIna’l ed tuob ua’uq neib is ; tuotrap ,àled ,àçeDpmahc el tnenruoter suov slif sel ,trom erèp eL.essaper te essap en niam al ùOecalp ellun zessial en ; zehcêb ,relliuof ,zesuerC.tûO’l tiaf arua no’uq sèd pmahc ertov zeumeR.tuob à zerdneiv ne suov ,revuort aref el suoVegaruoc ed uep nu siam ; tiordne’l sap sias en eJ.snaded éhcac tse rosért nU.stnerap son éssial tno suon euQegatiréh’l erdnev ed ,li-tid ruel ,suov-zedraG.sniomét snas alrap ruel ,stnafne ses rinev tiF,eniahcorp trom as tnatnes ,rueruobaL ehcir nU.sniom el euqnam iuq sdnof el tse’C: eniep al ed zenerp ,zelliavarT ";

        String Resultat = "";
    
        for (int i = 0; i < poeme.length(); i++) {
    
            poeme.charAt(i);

            Resultat =  poeme.charAt(i) + Resultat;
    
        }

        System.out.println(Resultat);
    }

}
