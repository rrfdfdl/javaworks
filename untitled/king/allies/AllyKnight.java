package king.allies;

public class AllyKnight extends Ally{
    public AllyKnight(int allycost, int allyhp, int allydmg){
        super(allycost, allyhp, allydmg);
        Ally.allycost =30;
        Ally.allyhp =35;
        Ally.allydmg =20;
    }
}
