package jp.ac.aiit.pbl.medcheck;


import java.util.Date;

/**
 * 健康診断受診者クラス
 */
public class MedicalExaminee {

    private String name;

    private Date  birthday;

    private double height;

    private double weight;

    private Eyesight eyesight;

    public MedicalExaminee(String name ,Date birthday,double height,double weight,Eyesight eyesight){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.eyesight = eyesight;
    }

    /**
     * 視力矯正が必要かどうかを返す
     * @return 視力矯正が必要ならtrue 不要ならfalse
     */
    public boolean isInNeedOfGlasses(){
        return this.eyesight.isPoor();
    }
}
