package jp.ac.aiit.pbl.medcheck;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EyesightTest {

    @Test
    public void 左目が正常右目が視力が悪い場合視力が悪いと判定される(){
        Eyesight eyesight = new Eyesight(0.2,0.1);
        assertThat(true,is(eyesight.isPoor()));
    }
    @Test
    public void 左目が視力が悪く右目が正常の場合視力が悪いと判定される(){
        Eyesight eyesight = new Eyesight(0.1,0.2);
        assertThat(true,is(eyesight.isPoor()));
    }
    @Test
    public void 両目が正常の場合視力に問題無しと判定される(){
        Eyesight eyesight = new Eyesight(0.2,0.2);
        assertThat(false,is(eyesight.isPoor()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 左目に0以下の数値を指定した場合例外が発生する(){
        Eyesight eyesight = new Eyesight(-1.0,0.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 右目に0以下の数値を指定した場合例外が発生する(){
        Eyesight eyesight = new Eyesight(1.0,-0.5);
    }
}