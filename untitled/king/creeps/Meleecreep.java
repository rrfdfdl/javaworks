package king.creeps;

public class Meleecreep extends CreepSumm {
    public Meleecreep(int creephp, int creepdmg, int gold){
        super(creephp, creepdmg, gold);
        CreepSumm.creephp =1;
        CreepSumm.creepdmg =5;
        CreepSumm.gold =0;
    }

}
