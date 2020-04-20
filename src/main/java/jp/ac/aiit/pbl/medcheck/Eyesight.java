package jp.ac.aiit.pbl.medcheck;

/**
 * 視力クラス
 */
public class Eyesight {

    private double right;

    private double left;

    /**
     * コンストラクタ
     * @param leftEyesight
     * @param rightEyesight
     */
    public Eyesight(double leftEyesight,double rightEyesight){
        if(leftEyesight < 0 || rightEyesight < 0){
            throw new IllegalArgumentException("視力は0.0以上を指定してください");
        }
        this.right = rightEyesight;
        this.left = leftEyesight;

    }

    /**
     * どちらかの視力が0.2未満の場合trueを返す
     * @return
     */
    public boolean isPoor(){
        if ( left < 0.2 || right < 0.2){
            return true;
        }
        return false;
    }


}
